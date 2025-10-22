import java.util.Objects;

public class Dog {
    public String name;
    public int age;
    public String breed;
    public String ownerName;
    public String color;


    public Dog(String name, int age, String breed, String ownerName, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString(){
        return "Name: " + getName() + "\nAge: " + getAge() + "\nBreed: " + getBreed()
                + "\nOwner Name: " + getOwnerName()
                + "\nColor: " + getColor();
    }

    @Override
    public boolean equals(Object other){
        if (!(other instanceof Dog dog)) {
            return false;
        }
        return dog.getAge()==this.getAge() && dog.getName().equals(this.getName()) &&
                dog.getColor().equals(this.getColor()) && dog.getBreed().equals(this.getBreed())
                && dog.getOwnerName().equals(this.getOwnerName());


    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getBreed(), getOwnerName(), getColor());
    }

    public static void main(String[] args) {
        Dog pies1=new Dog("Scooby", 7, "Owczarek",
                "Kudłaty", "Brązowy w czarne ciapki");
        Dog pies2=new Dog("Scooby", 7, "Owczarek",
                "Kudłaty", "Brązowy w czarne ciapki");
        System.out.println(pies1.equals(pies2));
        System.out.println(pies1.hashCode() + " " + pies2.hashCode());
    }
}
