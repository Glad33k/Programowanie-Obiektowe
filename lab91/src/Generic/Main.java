package Generic;

public class Main {
    public static void main(String[] args) {
        Animal kot=new Animal("Filemon");
        Animal kot2=new Animal("Bimbaj");
        String napis="Dzień dobry";
        Box<Animal,String> pudelko=new Box<>(kot,napis);
        Box<Animal,Animal> pudelko2=new Box<>(kot,kot2);
        pudelko.obiekt.dajGlos();
        System.out.println(pudelko.obiekt2);
        pudelko2.obiekt.dajGlos();
        pudelko2.obiekt2.dajGlos();
    }
    public static <T> boolean isEqual(T obj1,T obj2){
        return obj1.equals(obj2);
    }
}
