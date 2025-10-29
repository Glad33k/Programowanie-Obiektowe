package zad1;

public class Employee extends Person{
    public int salary;
    public String jobID;
    public Employee(String firstName, String lastName, int salary, String jobID){
        super(firstName,lastName);
        this.salary=salary;
        this.jobID=jobID;
    }


    public void displayData(){
        System.out.println(getFirstName() + " "+ getLastName());
    }


}
