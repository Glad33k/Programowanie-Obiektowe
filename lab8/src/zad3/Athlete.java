package zad3;

import java.util.ArrayList;

public class Athlete implements Cloneable{
    String name;
    ArrayList<Integer> lapTimes;

    public Athlete(String name, ArrayList<Integer> lapTimes) {
        this.name = name;
        this.lapTimes = lapTimes;
    }

    @Override
    public Athlete clone(){
        // TODO: copy mutable state here, so the clone can't change the internals of the original
        return new Athlete(this.name, (ArrayList<Integer>) this.lapTimes.clone());
    }

    public static void main(String[] args) {
        ArrayList<Integer> wyniki=new ArrayList<>(3);
        wyniki.add(3);
        wyniki.add(2);
        wyniki.add(4);
        Athlete a1=new Athlete("Jacek",wyniki);
        Athlete a2=a1.clone();
        a1.lapTimes.set(2, 10);
        System.out.println(a1.lapTimes);
        System.out.println(a2.lapTimes);
    }
}
