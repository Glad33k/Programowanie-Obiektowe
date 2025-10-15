package zad5;

public class Time {
    public int hours;
    public int minutes;

    public Time(int hours, int minutes){
        this.hours=hours;
        this.minutes=minutes;
    }
    public Time(){
        this(0,0);
    }
    public Time addTime(Time otherTime){
        Time nowy = new Time();
        nowy.hours=hours+otherTime.hours;
        nowy.minutes=minutes+otherTime.minutes;
        if (nowy.minutes>59){
            nowy.hours+=1;
            nowy.minutes-=60;
        }
        if(nowy.hours>23){
            nowy.hours=0;
        }
        return nowy;
    }

    public static void main(String[] args) {
        Time czas1=new Time(10,30);
        Time czas2=new Time(13,44);
        System.out.println(czas1.hours + " " + czas1.minutes);
        System.out.println(czas2.hours + " " + czas2.minutes);
        System.out.println(czas1.addTime(czas2).hours + " " + czas1.addTime(czas2).minutes);
    }

}
