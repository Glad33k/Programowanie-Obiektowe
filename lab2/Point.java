package zad3;
import java.lang.Math;

public class Point {
    public double x;
    public double y;


    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this(0,0);
    }
    public double distance( Point otherPoint){
        return Math.sqrt(Math.pow(x-otherPoint.x,2)+Math.pow(y-otherPoint.y,2));
    }

    public static void main(String[] args) {
        Point punkt1=new Point(3,4);
        Point punkt2=new Point(5,6);
        System.out.println(punkt1.x + " " + punkt1.y);
        System.out.println(punkt1.distance(punkt2));



    }
}
