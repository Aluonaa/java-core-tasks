package chapterSix;


/** 6.1 **/

import java.util.ArrayList;

public class Stack<E> {

    private ArrayList<E> arrayList;

    public Stack(ArrayList<E> arrayList){
        this.arrayList = arrayList;
    }

    public ArrayList<E> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<E> arrayList) {
        this.arrayList = arrayList;
    }

    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    public void push(E element){
        arrayList.add(0, element);
    }

    public E pop(){
        E returnValue = arrayList.get(0);
        arrayList.remove(0);
        return returnValue;
    }

}
