package dag15;

import java.text.NumberFormat;

public class DemoRecords {
    public static void main(String[] args) {
        Reptile2 reptile2 = new Reptile2("jazeker", "blauw", NumberFormat.Style.SHORT, 43, false, false);
        Reptile2 reptile1 = new Reptile2("jazeker", "blauw", NumberFormat.Style.LONG, 43, false, false);
        System.out.println(reptile1.equals(reptile2));
        System.out.println(reptile1);
    }
}

// old way
class Reptile {
    private String scales;
    private String color;
    private NumberFormat.Style size;
    private int avgEggs;
    private boolean extinct;
    private boolean nest;

    public Reptile(String scales, String color, NumberFormat.Style size, int avgEggs, boolean extinct, boolean nest) {
        this.scales = scales;
        this.color = color;
        this.size = size;
        this.avgEggs = avgEggs;
        this.extinct = extinct;
        this.nest = nest;
    }

    public String getScales() {
        return scales;
    }

    public void setScales(String scales) {
        this.scales = scales;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public NumberFormat.Style getSize() {
        return size;
    }

    public void setSize(NumberFormat.Style size) {
        this.size = size;
    }

    public int getAvgEggs() {
        return avgEggs;
    }

    public void setAvgEggs(int avgEggs) {
        this.avgEggs = avgEggs;
    }

    public boolean isExtinct() {
        return extinct;
    }

    public void setExtinct(boolean extinct) {
        this.extinct = extinct;
    }

    public boolean isNest() {
        return nest;
    }

    public void setNest(boolean nest) {
        this.nest = nest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reptile reptile = (Reptile) o;

        if (avgEggs != reptile.avgEggs) return false;
        if (extinct != reptile.extinct) return false;
        if (nest != reptile.nest) return false;
        if (!scales.equals(reptile.scales)) return false;
        if (!color.equals(reptile.color)) return false;
        return size == reptile.size;
    }

    @Override
    public int hashCode() {
        int result = scales.hashCode();
        result = 31 * result + color.hashCode();
        result = 31 * result + size.hashCode();
        result = 31 * result + avgEggs;
        result = 31 * result + (extinct ? 1 : 0);
        result = 31 * result + (nest ? 1 : 0);
        return result;
    }
}

record Reptile2(String scales, String color, NumberFormat.Style size, int avgEggs, boolean extinct, boolean nest) implements AutoCloseable {

    @Override
    public void close() throws Exception {

    }

    public String toString() {
        return "blabla";
    }
}