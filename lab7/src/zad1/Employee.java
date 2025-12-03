package zad1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee> {
    String name;
    double salary;
    LocalDate employmentDate;

    public Employee(String name, double salary, LocalDate employmentDate) {
        this.name = name;
        this.salary = salary;
        this.employmentDate = employmentDate;
    }

    @Override
    public String toString() {
        return " " + salary;
    }

    @Override
    public int compareTo(Employee o) {
       return Double.compare(this.salary,o.salary);
    }

    public static void main(String[] args) {
        Employee p1=new Employee("Jacek",3200.5,LocalDate.of(2024,12,3));
        Employee p2=new Employee("Jacek",3300.02,LocalDate.of(2024,12,3));
        Employee p3=new Employee("Jacek",2900,LocalDate.of(2024,12,3));
        Employee p4=new Employee("Jacek",2800,LocalDate.of(2024,12,3));
        Employee p5=new Employee("Jacek",1000,LocalDate.of(2024,12,3));
        ArrayList<Employee> pracownicy = new ArrayList<>();
        pracownicy.add(p1);
        pracownicy.add(p2);
        pracownicy.add(p3);
        pracownicy.add(p4);
        pracownicy.add(p5);
        System.out.println(pracownicy);
        Collections.sort(pracownicy);
        System.out.println(pracownicy);
    }
}
