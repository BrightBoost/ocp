package dag1;

public class Overloading {
//    public void blabla() {
//
//    }

//    public int blabla(long i) {
//       return 5;
//    }

    public void blabla(Integer i) {
        return;
    }

    public void blabla(int... i) {

    }

    public void doeIets() {
        blabla(Integer.valueOf(5));
        blabla(3);
        blabla();
    }
}
