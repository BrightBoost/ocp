package dag15.inheritance;

public interface X {
    int x = 5;
    int y = 5;

    default void hallo() {
        System.out.println("hallo");
    }
}
