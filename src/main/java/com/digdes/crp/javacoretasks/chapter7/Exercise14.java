package com.digdes.crp.javacoretasks.chapter7;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise14 {
   /** Напишите метод для получения неизменяемого представления списка чисел
    от 0 до n, не сохраняя эти числа **/
    public static void main(String[] args){
        System.out.println(getUnmodifiableList(10));
    }

    public static List<Integer> getUnmodifiableList(int n) {
        return Collections.unmodifiableList(IntStream.range(0, n).boxed().collect(Collectors.toList()));
    }
}
