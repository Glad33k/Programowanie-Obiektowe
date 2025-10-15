package zad7;

public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private int age;
    private int salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public Employee(String firstName, String lastName, String position, int age, int salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.position=position;
        this.age=age;
        this.salary=salary;
    }


    public void showInformation(){
        System.out.println("Dane pracownika: ");
        System.out.println("Imie : " + this.firstName);
        System.out.println("Nazwisko : " + this.lastName);
        System.out.println("stopien : " + this.position);
        System.out.println("wiek : " + this.age);
        System.out.println("zarobki : " + this.salary);
    }

    public static void main(String[] args) {
        Employee pracownik1=new Employee("Dawid","Mostowiak","Szef",30,2050);
        pracownik1.showInformation();
    }
}
