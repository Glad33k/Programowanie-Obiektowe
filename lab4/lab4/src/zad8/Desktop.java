package zad8;

import java.util.Arrays;
import java.util.Objects;

public class Desktop extends Computer{
    public String caseType;

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Desktop desktop = (Desktop) o;
        return Objects.equals(caseType, desktop.caseType);
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "caseType='" + caseType + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", partsPrices=" + Arrays.toString(partsPrices) +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), caseType);
    }

    public Desktop(String manufacturer, String model, double[] partsPrices, String caseType) {
        super(manufacturer, model, partsPrices);
        this.caseType = caseType;
    }
}
