package Generic;

public class Box <T,U>{
    T obiekt;
    U obiekt2;
    public Box(T obiekt, U obiekt2){
        this.obiekt=obiekt;
        this.obiekt2=obiekt2;
    }

    public T getObiekt() {
        return obiekt;
    }

    public U getObiekt2() {
        return obiekt2;
    }

    public void setObiekt2(U obiekt2) {
        this.obiekt2 = obiekt2;
    }

    public void setObiekt(T obiekt) {
        this.obiekt = obiekt;
    }
}
