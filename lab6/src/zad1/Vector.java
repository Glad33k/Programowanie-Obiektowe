package zad1;

public class Vector extends ComputerGraphic{
    public Vector(int width, int height, String fileName) {
        super(width, height, fileName);
    }

    public Vector() {
    }

    @Override
    public void saveFile() {
        System.out.println("Vector zapisany " + this.fileName);
    }

    @Override
    public void loadFile() {
        System.out.println("Vector załadowany " + this.fileName);
    }
}
