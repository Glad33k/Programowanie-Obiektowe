package zad5;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Person {
    String firstName;
    String lastName;
    LocalDate birthDate;

    public Person(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return this.lastName + " " + this.firstName;
    }

    static void main(String[] args) {
        Person p1=new Person("Marian","Gładek",LocalDate.of(2005,3,12));
        Person p2=new Person("Dawid","Gładek",LocalDate.of(2005,3,12));
        Person p3=new Person("Dawid","Nowak",LocalDate.of(2005,3,12));
        Person p4=new Person("Adam","Nowak",LocalDate.of(2005,3,12));
        Person p5=new Person("Ada","Nowak",LocalDate.of(2005,3,12));
        Person[] osoby ={p1,p2,p3,p4,p5};
        for (Person e:osoby){
            System.out.println(e);
        }
        System.out.println("================");
        Arrays.sort(osoby, new PersonComparator());
        for(Person e:osoby){
            System.out.println(e);
        }
    }
}
class PersonComparator implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        if(o1.lastName.compareTo(o2.lastName)!=0){
            return o1.lastName.compareTo(o2.lastName);
        }
        else{
            return o1.firstName.compareTo(o2.firstName);
        }
    }
}



