package zad2;

public class Laptop extends ElectronicDevice{
    public Laptop(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    public Laptop() {
    }

    @Override
    public void turnOff() {
        System.out.println("Laptop wyłączony");
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop włączony ");
    }
}
