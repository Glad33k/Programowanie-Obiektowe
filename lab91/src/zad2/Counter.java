package zad2;

import java.util.ArrayList;

public class Counter<T> {
    public ArrayList<T> elements;
    public T element;

    public Counter(T element) {
        this.elements = new ArrayList<>();
        this.element=element;
    }

    public Counter() {
        this.elements=new ArrayList<>();
    }
    public ArrayList<T> getElements() {
        return elements;
    }

    public void setElements(ArrayList<T> elements) {
        this.elements = elements;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void add(T element){
        elements.add(element);
    }
    public int getCount(){
        return elements.size();
    }


}
