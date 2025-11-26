package demo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hammer mlotek=new Hammer("Młotek",1999);
        Saw pila=new Saw("Piła",2005);
        Screwdriver srubokret=new Screwdriver("Śrubokręt",2025);
        WorkTool narzedzie = new Screwdriver("Śrubokręt płaski",2024);
        //mlotek.use();
        //pila.use();
        //srubokret.use();
        //narzedzie.use();
        WorkTool lyzka=new WorkTool("łyżka",1670) {
            @Override
            public void use() {
                System.out.println("Nałożono zupę na łyżkę");
            }
        };
        ArrayList<WorkTool> narzedzia=new ArrayList<>();
        narzedzia.add(mlotek);
        narzedzia.add(srubokret);
        narzedzia.add(pila);
        narzedzia.add(narzedzie);
        narzedzia.add(lyzka);
        for(WorkTool workTool: narzedzia){
            workTool.use();
        }
    }
}
