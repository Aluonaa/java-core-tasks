package com.digdes.crp.javacoretasks.chapter6;

import java.util.ArrayList;
import java.util.function.Function;

public class Exercise16 {
    /** Реализуйте метод mар() , получающий списочный массив и объект типа
    Function<T ,R> (см. главу 3) и возвращающий списочный массив, состоящий
    из результатов применения функции к заданным элементам этого массива. **/

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("абстрактный");
        arrayList.add("распространенных");
        arrayList.add("использования");
        arrayList.add("интерфейса");
        arrayList.add("вариантов");
        ArrayList<Integer> result = map(String::length, arrayList);
        System.out.println(result.toString());
    }

    public static <T, R> ArrayList<R> map(Function<T,R> function, ArrayList<T> arrayList) {
        ArrayList<R> result = new ArrayList<>();
        for(T obj: arrayList){
            result.add(function.apply(obj));
        }
        return result;
    }
}
