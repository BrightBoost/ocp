package dag2;

public interface A {
    default void bla() {
        System.out.println("bla a");
    }

    static void blabla() {
        System.out.println("blabla a");
    }
}
