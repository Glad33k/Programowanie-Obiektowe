package zad3;

public class Main {
    public static void main(String[] args) {
        PointC punkt = new PointC(10,15);
        System.out.println(punkt);


        PointR punkt2= punkt.toRecord();
        System.out.println(punkt2);
        PointC punkt3=punkt2.toClass();
        System.out.println(punkt3);
    }
}
