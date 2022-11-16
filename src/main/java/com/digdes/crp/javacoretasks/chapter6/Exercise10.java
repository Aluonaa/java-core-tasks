package com.digdes.crp.javacoretasks.chapter6;

import java.util.stream.IntStream;

public class Exercise10 {
    /** Предоставьте в служебном классе Arrays обобщенные методы min() и mах(),
    возвращающие наименьший и наибольший элементы массива соответственно. **/

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 6, 3, 4, 23};
        Integer [] integerArray = IntStream.of(numbers).boxed().toArray(Integer []::new);
        System.out.println(Arrays.maxElement(integerArray));
        System.out.println(Arrays.minElement(integerArray));
    }
}
