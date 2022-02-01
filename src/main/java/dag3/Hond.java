package dag3;

public class Hond {
    private String color;
    private double weight;
    private Double weight2;
    private Baasje baasje;

    public Hond(String color, double weight, Double weight2, Baasje baasje) {
        this.color = color;
        this.weight = weight;
        this.weight2 = weight2;
        this.baasje = baasje;
    }

    public Baasje getBaasje() {
        return baasje;
    }

    public void setBaasje(Baasje baasje) {
        this.baasje = baasje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Double getWeight2() {
        return weight2;
    }

    public void setWeight2(Double weight2) {
        this.weight2 = weight2;
    }
}
