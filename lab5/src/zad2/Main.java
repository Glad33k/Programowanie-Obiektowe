package zad2;

public class Main {
    public static void main(String[] args) {
        Address a1=new Address("Wiejska",15,"07-415","Ohio");
        Person osoba=new Person("Marek","Michał",a1);
        System.out.println(osoba);
    }
}
