import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    String imie;
    double sredniaOcen;
    int rokUrodzenia;

    public Student(String imie, double sredniaOcen, int rokUrodzenia) {
        this.imie = imie;
        this.sredniaOcen = sredniaOcen;
        this.rokUrodzenia = rokUrodzenia;
    }

    @Override
    public String toString() {
        return ""+ sredniaOcen + " " + rokUrodzenia;

    }
    @Override
    public int compareTo(Student o) {
        if(this.sredniaOcen>o.sredniaOcen) return 1;
        else if(this.sredniaOcen<o.sredniaOcen) return -1;
        else return Integer.compare(this.rokUrodzenia, o.rokUrodzenia);
    }

    public static void main(String[] args) {
        ArrayList<Student> studenci = new ArrayList<>();
        studenci.add(new Student("Adam",4.0,2001));
        studenci.add(new Student("Adam",3.0,1999));
        studenci.add(new Student("Adam",4.0,2000));
        System.out.println(studenci);
        //Collections.sort(studenci);
        System.out.println(studenci);
        studenci.sort(new AvgGradeStudentComparator());
        System.out.println(studenci);
        studenci.sort(new YearofBirthStudentComparator());
        System.out.println(studenci);
    }

}
class AvgGradeStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.sredniaOcen,o2.sredniaOcen);
    }
}
class YearofBirthStudentComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        return Integer.compare(o1.rokUrodzenia,o2.rokUrodzenia);
    }
}