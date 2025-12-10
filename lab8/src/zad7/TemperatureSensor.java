package zad7;

public class TemperatureSensor implements Sensor{
    double temperature;

    public TemperatureSensor(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double readValue() {
        return this.temperature;
    }

    @Override
    public String getStatus() {
        if(this.temperature>0) return "Gorąco";
        else return "Zimno";
    }

    @Override
    public void reset() {
        this.temperature=0;
    }
}
