package zad3.store;

import zad3.Book;
import zad3.Clothing;

public class TestProduct {
    public static void main(String[] args) {
        Product[] tablica =new Product[5];
        Book ksiazka=new Book();
        Book ksiazka1=new Book();
        Clothing ciuch=new Clothing();
        Clothing ciuch1=new Clothing();
        Clothing ciuch2=new Clothing();
        tablica[0]=ksiazka;
        tablica[1]=ksiazka1;
        tablica[2]=ciuch;
        tablica[3]=ciuch1;
        tablica[4]=ciuch2;
        for(Product produkt:tablica){
            System.out.println(produkt.getPrice());
        }
    }
}
