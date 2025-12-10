package zad1;

import java.util.ArrayList;

public class Butterfly extends Animal{
    public Butterfly(String name) {
        super(name);
    }

    public static void main(String[] args) {
        ArrayList<Animal> animals= new ArrayList<>();
        animals.add(new Dog("Reksio"));
        animals.add(new Cat("Filemon"));
        animals.add(new Butterfly("Cytrynek"));
        for(Animal animal: animals){
            if(animal instanceof LoudAnimal loudAnimal){
                loudAnimal.makeSound();
                loudAnimal.sayName();
            }
        }
    }
}
