package zad5;

public class Radio implements MusicPlayer{
    @Override
    public void turnOn() {
        System.out.println("Radio włączone");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio wyłączone");
    }

    @Override
    public void nextTrack() {
        System.out.println("Zmieniono stację radiową");
    }

    public static void main(String[] args) {
        Radio r=new Radio();
        r.turnOn();
        r.turnOff();
        r.nextTrack();
    }
}
