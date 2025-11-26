package zad2;

public class Television extends ElectronicDevice{
    public Television(String manufacturer, String model, int productionYear) {
        super(manufacturer, model, productionYear);
    }

    public Television() {
    }

    @Override
    public void turnOn() {
        System.out.println("Telewizor włączony");
    }

    @Override
    public void turnOff() {
        System.out.println("Telewizor wyłączony ");
    }
}
