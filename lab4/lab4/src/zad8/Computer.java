package zad8;
import java.util.Arrays;
import java.util.Objects;
public class Computer {
    public String manufacturer;
    public String model;
    public double[] partsPrices;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double[] getPartsPrices() {
        return partsPrices;
    }

    public void setPartsPrices(double[] partsPrices) {
        this.partsPrices = partsPrices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(manufacturer, computer.manufacturer) && Objects.equals(model, computer.model) && Arrays.equals(partsPrices, computer.partsPrices);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(manufacturer, model);
        result = 31 * result + Arrays.hashCode(partsPrices);
        return result;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", partsPrices=" + Arrays.toString(partsPrices) +
                '}';
    }

    public Computer(String manufacturer, String model, double[] partsPrices) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.partsPrices = partsPrices;
    }
}
