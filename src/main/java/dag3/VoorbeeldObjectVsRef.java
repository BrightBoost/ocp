package dag3;

public class VoorbeeldObjectVsRef {
    public static void main(String[] args) {
        Baasje baasje = new Baasje("Victor");
        Hond hond = new Hond("Bruin", 25, 30.0, baasje);
        voerHond(baasje, hond);
    }

    public static void voerHond(Baasje baasje, Hond hond) {
        hond.setWeight(hond.getWeight() + 1.0);
        hond.setWeight2(hond.getWeight2() + 1.0);
        baasje.setName("Robert");
    }


}
