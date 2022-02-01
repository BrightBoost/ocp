package dag3;

import java.util.Locale;

public class StandaardVraagVb {
    public static void main(String[] args) {
        Integer x = Integer.valueOf(129);
        Integer y = Integer.valueOf(129);
        System.out.println(x);
        addOne(x);
        System.out.println(x);
        //question: what does this print?
        // a: 3 /n4
        // b: 3 /n3
        // c: it doesn't compile
        // d: 4

        String s1 = new String("Blabla");
        String s = "Blabla";
        String s2 = "Blabla";
        System.out.println(s == s1); //false
        System.out.println(s2 == s1); //false
        System.out.println(s2 == s); //true want string pool


    }
    public static Integer addOne(Integer i) {
        ++i;
        return i;
    }
}
