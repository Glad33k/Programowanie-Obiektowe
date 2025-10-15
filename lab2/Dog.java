package zad6;

public class Dog {
    public String name;
    public String breed;
    public int age;

    public Dog(String name, String breed, int age){
        this.name=name;
        this.breed=breed;
        this.age=age;
    }
    public Dog(String name, String breed){
        this(name,breed,1);
    }

    public static void main(String[] args) {
        Dog piesel1=new Dog("Fafik","Husky");
        System.out.println(piesel1.name + " " + piesel1.breed + " " + piesel1.age);
    }
}
