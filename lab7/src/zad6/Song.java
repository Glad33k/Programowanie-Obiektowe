package zad6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Song {
    String title;
    String artist;
    int duration;

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return this.title + " " + this.artist + " " + this.duration;
    }

    static void main(String[] args) {
        Song[] piosenki=new Song[5];
        piosenki[0]=new Song("Radzik","Tadzik",160);
        piosenki[1]=new Song("Radzik","Tadzik",120);
        piosenki[2]=new Song("Radzik","Radzik",120);
        piosenki[3]=new Song("Radzik","Tadzik",120);
        piosenki[4]=new Song("Gadzik","Tadzik",120);
        for(Song s: piosenki) System.out.println(s);
        Arrays.sort(piosenki,new DurationComparator());
        System.out.println("=====");
        for(Song s: piosenki) System.out.println(s);
        Arrays.sort(piosenki, new ArtistTitleComparator());
        System.out.println("=====");
        for(Song s: piosenki) System.out.println(s);
    }
}
class DurationComparator implements Comparator<Song>{

    @Override
    public int compare(Song o1, Song o2) {
        return Integer.compare(o1.duration,o2.duration);
    }
}
class ArtistTitleComparator implements Comparator<Song>{
    @Override
    public int compare(Song o1, Song o2){
        if(o1.artist.compareTo(o2.artist)==0) return o1.title.compareTo(o2.title);
        else return o1.artist.compareTo(o2.artist);
    }
}
