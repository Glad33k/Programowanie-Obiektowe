import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>, Cloneable {
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
        Student student1=new Student("Adam",4.0,2001);
        Student student2=student1.clone();
        student1.sredniaOcen=4.5;
        System.out.println(student1);
        System.out.println(student2);
    }


    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
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