package dag2;

public class AmbigueKlassse extends Parent implements A, B {
    @Override
    public void bla() {
        System.out.println("bla ambigueklassse");
        A.super.bla();
        B.super.bla();
    }

    public static void main(String[] args) {
       A.blabla();
       blablabla();
    }
}
