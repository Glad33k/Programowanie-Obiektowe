package zad1;

public class book {
    public String title;
    public String author;
    public int publicationYear;

    public  book(){

    }
    public book(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public static void main(String[] args) {
        book ksiazka1=new book();
        ksiazka1.title = "Koziołek Matołek";
        ksiazka1.author = "Kornel Makuszyński";
        ksiazka1.publicationYear = 1932;
        System.out.println(ksiazka1.title + " " + ksiazka1.author + " " +
                ksiazka1.publicationYear);
        book ksiazka2=new book("Pan Tadeusz", "Adam Mickiewicz", 1834);
        System.out.println(ksiazka2.title + " " + ksiazka2.author + " " +
                ksiazka2.publicationYear);
        book ksiazka3 = new book("Manifest",null, 2000);
        System.out.println(ksiazka3.title + " " + ksiazka3.author + " " +
                ksiazka3.publicationYear);

    }
}
