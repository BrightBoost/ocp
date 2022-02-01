package dag1;

public enum Weekdays {
    MONDAY("Maandag"), TUESDAY("Dinsdag"), WEDNESDAY("Woensdag");

    private final String name;

    public String getName() {
        return name;
    }

    Weekdays(String name) {
        System.out.println("in constructor");
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println("lol");
        for(Weekdays w : Weekdays.values()) {
            System.out.println(w.getName());
        }

         System.out.println(Weekdays.MONDAY.getName());
    }
}
