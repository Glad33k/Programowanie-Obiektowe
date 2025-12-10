package zad1;

public interface LoudAnimal {
    public abstract void makeSound();
    //Nie trzeba pisac public abstract w interface
    default void sayName(){
        System.out.println("Nie wiem jak sie nazywam");
    }
}
