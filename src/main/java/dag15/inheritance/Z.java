package dag15.inheritance;

public interface Z extends X {
    default void hallo() {
        System.out.println("blabla z");
    }
}
