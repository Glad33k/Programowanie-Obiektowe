package zad4.entertainment;

import zad4.AdventureGame;
import zad4.StrategyGame;

import java.util.ArrayList;

public class TestGame {
    public static void main(String[] args) {
        StrategyGame strategia=new StrategyGame();
        StrategyGame strategia1=new StrategyGame();
        StrategyGame strategia2=new StrategyGame();
        AdventureGame adventure=new AdventureGame();
        AdventureGame adventure1=new AdventureGame();
        ArrayList<Game> gry=new ArrayList<>();
        gry.add(strategia);
        gry.add(strategia1);
        gry.add(strategia2);
        gry.add(adventure);
        gry.add(adventure1);
        for(Game gra: gry){
            System.out.println(gra.getRating());
        }
    }
}
