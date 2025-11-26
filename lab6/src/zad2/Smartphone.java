package zad2;

public class Smartphone extends ElectronicDevice{
    public Smartphone(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    public Smartphone() {
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone wyłączony");
    }

    @Override
    public void turnOn() {
        System.out.println("Smartphone włączony");
    }
}
