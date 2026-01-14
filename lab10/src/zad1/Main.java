package zad1;

public class Main {
    public static void main(String[] args) {
        Biuro biuro=new Biuro(new StandardowyPrinter());
        biuro.drukujDokument("Tak tak nie");
    }
}
