package zad2;

import java.util.Objects;

public class Person {
    public String firstName;
    public String lastName;
    public int age;


    public Person(String firstName, String lastName, int age){
        this.age = Math.max(age, 0);
        if(firstName==null || firstName.isEmpty()){
            this.firstName="";
        }
        else{
            this.firstName=firstName;
        }
        if(lastName==null || lastName.isEmpty()){
            this.lastName="";
        }
        else{
            this.lastName=lastName;
        }
    }

    public String getFirstName() {
        return firstName;
    }



    public String getLastName() {
        return lastName;
    }



    public int getAge() {
        return age;
    }



    @Override
    public String toString() {
        return "Person: " +getFirstName() +" " + getLastName()+ ", Age: " + getAge() + ".";
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Person person)){
            return false;
        }
        return person.getFirstName().equals(this.getFirstName())
                && person.getLastName().equals(this.getLastName())
                && person.getAge()==this.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge());
    }

    public static void main(String[] args) {
        Person osoba1=new Person("Marek","Mostowiak",48);
        Person osoba2=new Person("Marek","Mostowiak",48);
        System.out.println(osoba1);
        System.out.println(osoba1.equals(osoba2));
        System.out.println(osoba1.hashCode()==osoba2.hashCode());
    }
}


