package com.digdes.crp.javacoretasks.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise14 {
   /** Напишите метод для получения неизменяемого представления списка чисел
    от 0 до n, не сохраняя эти числа **/
    public static void main(String[] args){
        System.out.println(getUnmodifiableList(10));
    }

    public static List<Integer> getUnmodifiableList(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        return Collections.unmodifiableList(list);
    }
}
