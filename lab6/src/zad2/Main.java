package zad2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Laptop l1=new Laptop("Asus","a5",2000);
        Smartphone p1=new Smartphone("Samsung","s20",2025);
        Smartphone p2=new Smartphone("Samsung","s3",2001);
        Television t1=new Television("Samsung","ultra",2015);
        Television t2=new Television("LG","git",2002);
        ArrayList<ElectronicDevice> urzadzenia=new ArrayList<>();
        urzadzenia.add(p1);
        urzadzenia.add(l1);
        urzadzenia.add(p2);
        urzadzenia.add(t1);
        urzadzenia.add(t2);
        for(ElectronicDevice urzadzenie: urzadzenia){
            urzadzenie.turnOn();
            urzadzenie.turnOff();
        }
    }


}
