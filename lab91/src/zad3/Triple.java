package zad3;

public class Triple <T,U,V>{
    T objekt1;
    U objekt2;
    V objekt3;

    public Triple(T objekt1, U objekt2, V objekt3) {
        this.objekt1 = objekt1;
        this.objekt2 = objekt2;
        this.objekt3 = objekt3;
    }



    public T getFirst(){
        return objekt1;
    }
    public U getSecond(){
        return objekt2;
    }
    public V getThird(){
        return objekt3;
    }

    public void setObjekt1(T objekt1) {
        this.objekt1 = objekt1;
    }

    public void setObjekt2(U objekt2) {
        this.objekt2 = objekt2;
    }

    public void setObjekt3(V objekt3) {
        this.objekt3 = objekt3;
    }
}
