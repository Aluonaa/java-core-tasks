package main.java.ru.furiosaming.javacoretasks.chapter6;

import java.util.ArrayList;

public class Arrays {

    public static <E extends Number> Pair<E> firstLast(ArrayList<E> a){
        return new Pair<>(a.get(0), a.get(a.size()-1));
    }

    public static <E extends Number> E maxElement(E[] array){
        if(array.length == 0){
            return null;
        }
        E max = array[0];
        for (E e : array) {
            if (e.doubleValue() > max.doubleValue()) {
                max = e;
            }
        }
        return max;
    }

    public static <E extends Number> E minElement(E[] array){
        if(array.length == 0){
            return null;
        }
        E min = array[0];
        for (E e : array) {
            if (e.doubleValue() < min.doubleValue()) {
                min = e;
            }
        }
        return min;
    }

    public static <E extends Number> Pair<E> minMax(E[] array){
        if(array.length == 0){
            return null;
        }
        E min = array[0];
        E max = array[0];
        for (E e : array) {
            if (e.doubleValue() < min.doubleValue()) {
                min = e;
            }
        }
        for (E e : array) {
            if (e.doubleValue() > max.doubleValue()) {
                max = e;
            }
        }
        return new Pair<E>(min, max);
    }
}
