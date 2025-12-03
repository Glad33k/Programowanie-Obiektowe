package zad2;

import java.text.DateFormat;
import java.time.Instant;
import java.util.*;

public class Client implements Comparable<Client>{
    String name;
    int clientNumber;
    Date lastLogin;

    public Client(String name, int clientNumber, Date lastLogin) {
        this.name = name;
        this.clientNumber = clientNumber;
        this.lastLogin = lastLogin;
    }

    @Override
    public String toString() {
        return "" + lastLogin;
    }

    @Override
    public int compareTo(Client o) {
        return o.lastLogin.compareTo(this.lastLogin);
    }

    public static void main(String[] args) {
        Date d1=new Date(100, Calendar.DECEMBER,30);
        Date d2=new Date(105, Calendar.DECEMBER,30);
        Date d3=new Date(107, Calendar.DECEMBER,30);

        Client c1=new Client("Marek",123, d1);

        Client c2=new Client("Marek",123, d2);
        Client c3=new Client("Marek",123, d3);
        Client c4=new Client("Marek",123, d1);
        ArrayList<Client> klienci=new ArrayList<>();
        klienci.add(c1);
        klienci.add(c2);
        klienci.add(c3);
        klienci.add(c4);
        System.out.println(klienci);
        Collections.sort(klienci);
        System.out.println(klienci);
    }
}
