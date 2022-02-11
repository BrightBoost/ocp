package dag4;


public class Bag<T> implements Foldable<Bag<T>> {
    private T inhoud;
    private boolean folded;

    public Bag() {

    }
    public Bag(T inhoud) {
        this.inhoud = inhoud;
        folded = false;
    }

    public T unpack() {
        return inhoud;
    }

    @Override
    public Bag<T> fold(Bag<T> bag) {
        folded = true;
        return this;
    }

    public static <U> U doStuff(U u) {
        return u;
    }

}
