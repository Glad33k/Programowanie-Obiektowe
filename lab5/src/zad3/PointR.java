package zad3;

public record PointR(double x, double y) {
     PointC toClass(){
        return (new PointC(x,y));
    }

}
