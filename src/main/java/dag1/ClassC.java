package dag1;

import dag1.subpackage.ClassA;

public class ClassC  extends ClassA {
    public ClassC(String name) {
        super(name);
        sayName();
    }

    public static void main(String[] args) {
        ClassA cA = new ClassA("Maria");
        cA.name = "David";
        cA.shoutName();
//        cA.sayName();

        ClassC cC = new ClassC("Maria");
        cC.name = "David";
        cC.sayName();

    }
}
