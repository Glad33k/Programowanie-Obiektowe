package zad3;

public class PointC {
    double x;
    double y;

    public PointC(double x, double y){
        this.x=x;
        this.y=y;
    }
    PointR toRecord(){
        return (new PointR(this.x,this.y));
    }
}
