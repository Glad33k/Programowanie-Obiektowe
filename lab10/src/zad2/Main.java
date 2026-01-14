package zad2;

public class Main {
    public static void main(String[] args) {
        Samochod samochod1=new Samochod(new BenzynowySilnik());
        samochod1.start();
        samochod1.stop();

    }
}
