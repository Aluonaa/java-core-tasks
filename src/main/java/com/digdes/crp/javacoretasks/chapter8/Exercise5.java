package com.digdes.crp.javacoretasks.chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise5 {
    public static void main(String[] args) {
        /** Метод letters(), упоминавшийся в разделе 8.3, выглядит
        несколько неуклюже, поскольку в нем сначала получается списочный
        массив, а затем он превращается в поток данных. Напишите другой, однострочный вариант этого
        метода, используя поток данных. Преобразуйте значения типа int в пределах
        от 0 до s.length()-1 с помощью подходящего лямбда-выражения.

         public static Stream<String> letters(String s) {
         List<String> result = new ArrayList<>();
         for (int i = 0; i < s.length(); i++)
         result.add(s.substring(i, i + 1));
         return result.stream();
         }
         **/
//        String s = "Hello";
//        List<String> result = new ArrayList<>();
//        for (int i = 0; i < s.length(); i++)
//            result.add(s.substring(i, i + 1));
//        System.out.println(result);
//
//
//        Stream<String> stream = letters("Hello");
//        List<String> list = stream.collect(Collectors.toList());
//        System.out.println(list);
//    }
//
//    public static Stream<String> letters(String s) {
//        Stream<String> d = IntStream.range(0, s.length()-1).flatMap(s -> );
//
    }

}
