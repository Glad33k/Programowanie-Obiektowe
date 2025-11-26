package zad1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bitmap bitmapa=new Bitmap(10,10,"Bitmapa");
        Bitmap bitmapa1=new Bitmap(12,13,"Bitmapa1");
        Vector wektor=new Vector(15,15,"Wektor");
        Vector wektor1=new Vector(30,15,"Wektor1");
        Vector wektor2=new Vector(30,40,"Wektor2");
        ArrayList<ComputerGraphic> computerGraphics=new ArrayList<>();
        computerGraphics.add(bitmapa);
        computerGraphics.add(bitmapa1);
        computerGraphics.add(wektor);
        computerGraphics.add(wektor1);
        computerGraphics.add(wektor2);
        for(ComputerGraphic grafika:computerGraphics){
            grafika.saveFile();
            grafika.loadFile();

        }
    }
}
