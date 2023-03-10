package main.java.ru.furiosaming.javacoretasks.chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Exercise5 {
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
    public static void main(String[] args) {
        List<Character> list = letters("Hello");
        System.out.println(list);
    }

    public static List<Character> letters(String s) {
        List<Character> charList = new ArrayList<>();
        IntStream.range(0,s.length()).forEach(i -> charList.add(s.charAt(i)));
        return charList;

    }

}
