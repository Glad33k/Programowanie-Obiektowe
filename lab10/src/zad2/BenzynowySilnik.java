package zad2;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Silnik uruchomiony za pierwszym");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Silnik wyłączony");
    }
}
