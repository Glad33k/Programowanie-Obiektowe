package zad3;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Book implements Comparable<Book>{
    String title;
    int numberOfPages;
    LocalDate publicationDate;

    public Book(String title, int numberOfPages, LocalDate publicationDate) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "" + numberOfPages;
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(o.numberOfPages,this.numberOfPages);
    }

    public static void main(String[] args) {
        Book b1=new Book("Marian",30,LocalDate.of(2024,10,3));
        Book b2=new Book("Marian",40,LocalDate.of(2024,10,3));
        Book b3=new Book("Marian",10,LocalDate.of(2024,10,3));
        Book b4=new Book("Marian",80,LocalDate.of(2024,10,3));
        Book[] ksiazki ={b1,b2,b3,b4};
        for(Book i: ksiazki){
            System.out.println(i.numberOfPages);
        }
        Arrays.sort(ksiazki);
        for(Book i: ksiazki){
            System.out.println(i.numberOfPages);
        }

    }
}
