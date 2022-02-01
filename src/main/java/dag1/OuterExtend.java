package dag1;

public class OuterExtend extends Outer {
    public static void main(String[] args) {
        Inner i = new OuterExtend().new Inner();

    }
}
