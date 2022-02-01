package dag3;

public class Keuken {

    private String aanrecht;
    private double lengte;
    private double breedte;

    public Keuken(String aanrecht, double lengte, double breedte) {
        this.aanrecht = aanrecht;
        this.lengte = lengte;
        this.breedte = breedte;
    }



    public static class KeukenBuilder {
        private String aanrecht;
        private double lengte;
        private double breedte;
        //etc


        public KeukenBuilder() {
        }

        public KeukenBuilder aanrecht(String aanrecht) {
            this.aanrecht = aanrecht;
            return this;
        }

        public KeukenBuilder afmeting(double lengte, double breedte) {
            this.lengte = lengte;
            this.breedte = breedte;
            return this;

        }



        public Keuken build() {
            Keuken keuken = new Keuken(aanrecht, lengte, breedte);
            return keuken;

        }
    }
}
