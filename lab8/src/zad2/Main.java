package zad2;

public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Marek","Analiza",1);
        Teacher t2=t1.clone();
        t2.experience=3;
        System.out.println(t1.experience);
        System.out.println(t2.experience);
    }
}
