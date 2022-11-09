package com.digdes.crp.javacoretasks.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise15 {
   /** Обобщите предыдущее упражнение произвольным функциональным
    интерфейсом IntFunction. Имейте в виду, что в конечном итоге
    может получиться бесконечная коллекция, поэтому некоторые
    методы (например, size() и toArray() должны генерировать исключение типа
    UnsupportedOperationException.  **/

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
