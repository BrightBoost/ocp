package dag1.overriding;

import dag1.subpackage.ClassA;

public class OverridingChild extends OverridingParent {


    @Override
    public void doeIetsLeuks(int i, String s) {
        System.out.println("child");
        super.doeIetsLeuks(i, s);
    }

    public static void main(String[] args) {
        OverridingChild o = new OverridingChild();
        o.doeIetsLeuks(5, "blabla");


    }
}
