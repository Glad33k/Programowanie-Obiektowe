package zad4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.price  + " " + this.id;
    }


    static void main(String[] args) {
        Product p1=new Product(1,"Maskotka",20.5);
        Product p2=new Product(2,"Maskotka",12.5);
        Product p3=new Product(3,"Maskotka",12.5);
        Product p4=new Product(4,"Maskotka",15);
        Product p5=new Product(5,"Maskotka",20.5);
        ArrayList<Product> produkty=new ArrayList<>();
        produkty.add(p1);
        produkty.add(p2);
        produkty.add(p3);
        produkty.add(p4);
        produkty.add(p5);
        Collections.sort(produkty, new Porownanie());
        System.out.println(produkty);
    }
}
class Porownanie implements Comparator<Product>{
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.price!=o2.price)
            return Double.compare(o1.price,o2.price);
        else
            return Integer.compare(o1.id,o2.id);

    }
}
