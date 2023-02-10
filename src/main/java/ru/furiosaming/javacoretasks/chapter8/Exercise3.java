package main.java.ru.furiosaming.javacoretasks.chapter8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exercise3 {
    /** Допустим, что имеется массив int[] values = { 1, 4, 9, 16 }. Каков результат
    вызова Stream.of(values)? Как вместо этого получить поток данных типа int?

     Решение: при вызове Stream.of(values) создается поток данных, в котором будут содержаться
     значения переменных в объектах-оболочках. Это неэффективный способ хранения**/

    public static void main(String[] args) {
        int[] values = { 1, 4, 9, 16 };

        IntStream stream = IntStream.of(values);
        System.out.println(Arrays.toString(stream.toArray()));
    }
}
