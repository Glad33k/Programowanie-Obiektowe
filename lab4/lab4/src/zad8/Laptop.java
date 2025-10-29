package zad8;

import java.util.Arrays;
import java.util.Objects;

public class Laptop extends Computer{
    public int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return weight == laptop.weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", partsPrices=" + Arrays.toString(partsPrices) +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), weight);
    }

    public Laptop(String manufacturer, String model, double[] partsPrices, int weight) {
        super(manufacturer, model, partsPrices);
        this.weight = weight;
    }
}
