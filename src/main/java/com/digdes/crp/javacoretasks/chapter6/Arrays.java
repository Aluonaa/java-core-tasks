package com.digdes.crp.javacoretasks.chapter6;

import java.util.ArrayList;

public class Arrays {

    public static <E extends Number> Pair<E> firstLast(ArrayList<E> a){
        return new Pair<>(a.get(0), a.get(a.size()-1));
    }

    public static <E extends Number> E maxElement(E[] array){
        E max = array[0];
        for(int i=0; i<array.length; i++){
            if (array[i].doubleValue() > max.doubleValue()){
                max = array[i];
            }
        }
        return max;
    }

    public static <E extends Number> E minElement(E[] array){
        E min = array[0];
        for(int i=0; i<array.length; i++){
            if (array[i].doubleValue() < min.doubleValue()){
                min = array[i];
            }
        }
        return min;
    }

    public static <E extends Number> Pair<E> minMax(E[] array){
        E min = array[0];
        E max = array[0];
        for(int i=0; i<array.length; i++){
            if (array[i].doubleValue() < min.doubleValue()){
                min = array[i];
            }
        }
        for(int i=0; i<array.length; i++){
            if (array[i].doubleValue() > max.doubleValue()){
                max = array[i];
            }
        }
        return new Pair<E>(min, max);
    }
}
