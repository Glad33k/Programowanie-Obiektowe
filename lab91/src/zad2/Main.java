package zad2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String napis="Napisik";
        String liczba="123";
        Counter<String> licznik= new Counter<>();
        licznik.add(napis);
        System.out.println(licznik.getCount());
        licznik.add(liczba);
        System.out.println(licznik.getCount());
    }
}
