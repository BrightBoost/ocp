package dag3;

import static dag3.Keuken.*;

public class Timmerman {
    public static void main(String[] args) {
        Keuken k = new KeukenBuilder()
                .aanrecht("marmer")
                .afmeting(3,3)
                .build();

        // zelfde maar dan niet gechaind
        KeukenBuilder k2 = new KeukenBuilder();
        k2 = k2.aanrecht("marmer");
        k2 = k2.afmeting(3,3);
        Keuken k3 = k2.build();

    }
}
