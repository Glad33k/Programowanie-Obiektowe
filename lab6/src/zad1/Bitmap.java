package zad1;

public class Bitmap extends ComputerGraphic{
    public Bitmap(int width, int height, String fileName) {
        super(width, height, fileName);
    }
    public Bitmap() {
    }

    @Override
    public void loadFile() {
        System.out.println("Bitmapa załadowana " + this.fileName);
    }

    @Override
    public void saveFile() {
        System.out.println("Bitmapa zapisana " + this.fileName);
    }
}
