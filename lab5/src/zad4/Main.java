package zad4;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> lista=new ArrayList<Double>();
        lista.add(5.0);
        lista.add(3.0);
        lista.add(4.0);
        lista.add(2.0);
        Student student1=new Student("Dawid","Gładek",lista);
        System.out.println(student1);
        System.out.println(student1.averageGrades());
    }
}
