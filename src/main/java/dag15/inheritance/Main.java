package dag15.inheritance;

public class Main {
    public static void main(String[] args) {
        A a = new C(6);
        X x = new Y() {
        };

        B b = (B) a;
        System.out.println(b.getY());
    }
}
