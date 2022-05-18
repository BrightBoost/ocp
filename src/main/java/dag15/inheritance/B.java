package dag15.inheritance;

public class B extends A implements X, Z {

//    public void hallo() {
//        System.out.println("blabla b");
//        X.super.hallo();
//    }
    public B(int m) {
        super(7);
    }
    static int x = 20;
    int y = 20;

    @Override
    public int getY() {
        hallo();
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }
}
