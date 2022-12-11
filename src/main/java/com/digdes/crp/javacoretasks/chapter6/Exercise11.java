package com.digdes.crp.javacoretasks.chapter6;

import java.util.stream.IntStream;

public class Exercise11 {
    /** Продолжая предыдущее упражнение, предоставьте
    метод minMax(), возвращающий объект типа Pair с
    наименьшим и наибольшим элементами массива. **/

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 6, 3, 4, 23};
        Integer [] integerArray = IntStream.of(numbers).boxed().toArray(Integer []::new);
        Pair<Integer> pair = Arrays.minMax(integerArray);
        if(pair != null) {
            System.out.println(pair.getFirst());
            System.out.println(pair.getSecond());
        }
    }
}
