package zad3;

import zad3.store.Product;

public class Book extends Product {
    public Book() {
    }

    @Override
    public double getPrice() {
        return 29.99;
    }
}
