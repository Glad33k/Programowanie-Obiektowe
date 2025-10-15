package zad2;

public class Square {
    public int side;

    public Square(int side){
        this.side=side;
    }

    public Square(){
        this(1);
    }

    public int pole(){
        return side*side;
    }

    public static void main(String[] args) {
        Square kwadrat1=new Square(3);
        System.out.println(kwadrat1.side);
        System.out.println(kwadrat1.pole());
    }

}


