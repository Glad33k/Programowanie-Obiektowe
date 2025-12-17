package zad3;

public class Main {
    public static void main(String[] args) {
        int liczba=123;
        String napis="Napisik";
        boolean prawda=true;
        Triple<Integer, String, Boolean> potrojny=new Triple<>(liczba,napis,prawda);
        System.out.println(potrojny.getFirst());
        System.out.println(potrojny.getSecond());
        System.out.println(potrojny.getThird());
    }
}
