package dag15;

import java.lang.constant.Constable;

public class Java17Switch {
    enum KLEUREN {
        BLAUW, GEEL, ROOD;
    }
    public static void main(String[] args) {
        int x = 8;
        switch(x) {
            default:
                System.out.println("Wat is dit?");
                break;
            case 0:
                System.out.println("X is nul");
                break;
            case 1:
                System.out.println("X is een");
                break;
            case 2:
                System.out.println("X is twee");
                break;
        }

        // nieuwe versie, geen break nodig bij ->
        switch(x) {
            case 0 -> System.out.println("X is nul");
            case 1 -> { System.out.println("X is een"); break; }  // dit mag
            case 2 -> System.out.println("X is twee");
            default -> System.out.println("Wat is dit?");
        }

        // waarde returnen met switch statement
        String getal = switch(x) {
            case 0 -> "X is nul";
            case 1 -> "X is een";
            case 2 -> "X is twee";
            default -> "Wat is dit?";
        };

        // waarde returnen met switch statement en expliciet yield
        String getal1 = switch(x) {
            case 0: yield "X is nul";
            case 1: yield "X is een";
            case 2: yield "X is twee";
            default: yield "Wat is dit?";
        };

        // waarde returnen met switch statement en meer acties
        String getal2 = switch(x) {
            case 0 -> {
                System.out.println("Het is nul :)");
                yield "X is nul";
            }
            case 1 -> "X is een";
            case 2 -> "X is twee";
            default -> "Wat is dit?";
        };

        // enums en switch
        KLEUREN kleur = KLEUREN.GEEL;
        String s;
        switch (kleur) {
            case ROOD:
                System.out.println("rood");
                s = "rood";
                break;
            case BLAUW:
                System.out.println("blauw");
                s = "blauw";
                break;
            case GEEL:
                s = "geel";
                break;
            default:
                s = "watdan?!";
        }
        System.out.println(s);

        // als je alle labels behandelt geen default nodig
        var s1 = switch (kleur) {
            case ROOD -> "rood";
            case BLAUW -> KLEUREN.BLAUW;
            case GEEL -> 2;
        };
        System.out.println(s1 + " " + s1.getClass());


    }
}
