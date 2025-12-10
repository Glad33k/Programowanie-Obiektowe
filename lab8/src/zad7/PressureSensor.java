package zad7;

public class PressureSensor implements Sensor {
    double Pressure;

    public PressureSensor(double pressure) {
        Pressure = pressure;
    }

    @Override
    public double readValue() {
        return this.Pressure;
    }

    @Override
    public String getStatus() {
        if(this.Pressure>0) return "duże";
        else return "małe";
    }

    @Override
    public void reset() {
        this.Pressure=0;
    }

    public static void main(String[] args) {
        PressureSensor p1=new PressureSensor(20.5);
        System.out.println(p1.readValue());
        System.out.println(p1.getStatus());
        p1.reset();
        System.out.println(p1.Pressure);
        TemperatureSensor t1=new TemperatureSensor(30.5);
        System.out.println(t1.readValue());
        System.out.println(t1.getStatus());
        t1.reset();
        System.out.println(t1.temperature);
    }
}
