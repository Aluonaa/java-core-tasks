package main.java.ru.furiosaming.javacoretasks.chapter6;

import java.util.*;
import java.util.Arrays;


public class StackWithMassOfGenerics<E> {

    private E[] mass;

    public StackWithMassOfGenerics(E[] mass){
        this.mass = mass;
    }

    @SuppressWarnings("unchecked")
    public void push(E element){
        ArrayList<E> list = new ArrayList<>(Arrays.asList(mass));
        list.add(element);
        mass = (E[]) list.toArray();
    }
    @SuppressWarnings("unchecked")
    public E pop(){
        E returnValue = mass[0];
        List<E> list = Arrays.asList(mass);
        list = list.subList(1, list.size());
        mass = (E[]) list.toArray();
        return returnValue;
    }

    @Override
    public String toString() {
        return "StackWithMassOfE{" +
                "mass=" + Arrays.toString(mass) +
                '}';
    }
}
