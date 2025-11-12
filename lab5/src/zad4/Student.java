package zad4;

import java.util.ArrayList;
import java.util.Arrays;

public record Student(String imie, String nazwisko, ArrayList<Double> oceny) {
    public double averageGrades(){
        double sum=0;
        for(int i=0;i<oceny.size();i++)
        {
            sum += oceny.get(i);
        }
        return sum/oceny.size();
    }
}
