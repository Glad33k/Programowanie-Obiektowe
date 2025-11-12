package zad1;

public class Main {
    public static void main(String[] args) {
        BookDTO ksiazka1=new BookDTO("ksiazka1","Marek Towarek",100,2025);
        System.out.println(ksiazka1.title() + " " + ksiazka1.author() + " " +
                ksiazka1.price() + " " + ksiazka1.yearOfPublication());
        System.out.println(ksiazka1);
        BookDTO ksiazka2=new BookDTO("ksiazka1","Marek Towarek",100);
        System.out.println(ksiazka2);
        System.out.println(ksiazka1.equals(ksiazka2));

    }
}
