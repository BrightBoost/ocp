package dag15;

public class InstanceOfJava17 {

    public static void main(String[] args) {
        Object o = new Car();
        // oude manier
        if(o instanceof Car) {
            Car c = (Car) o;
        }

        // nieuwe manier
        if(o instanceof Car c && c.getKleur().equals("zwart")) {
            System.out.println(c.getKleur());
        }
    }
}



class Car {
    private String kleur = "zwart";

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}