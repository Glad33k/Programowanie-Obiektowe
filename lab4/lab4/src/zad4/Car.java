package zad4;

public class Car extends Vehicle{
    @Override
    public void drive(){
        super.drive();
        System.out.println("The car is moving");
    }
}
