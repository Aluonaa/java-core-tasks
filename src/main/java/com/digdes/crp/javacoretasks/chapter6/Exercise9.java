package com.digdes.crp.javacoretasks.chapter6;

import java.util.ArrayList;

public class Exercise9 {
    /** Предоставьте в служебном классе Arrays следующий метод, возвращающий
    пару, состоящую из первого и последнего элементов массива а, указав подходящий аргумент типа:
    public static <Е> Pair<E> firstLast(ArrayList<__> a) **/
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(Arrays.firstLast(arrayList).getFirst());
        System.out.println(Arrays.firstLast(arrayList).getSecond());
    }

}
