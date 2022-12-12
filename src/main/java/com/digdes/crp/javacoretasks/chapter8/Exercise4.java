package com.digdes.crp.javacoretasks.chapter8;

import java.util.stream.Stream;

public class Exercise4 {
    public static void main(String[] args) {
        /** С помощью метода Stream.iterate() создайте бесконечный поток случайных
        чисел, не вызывая метод Math.random(), а непосредственно реализуя линейный
        конгруэнтный генератор. Такой генератор начинает действовать с числа, задаваемого
        выражением х0 = начальное значение, а затем производит случайные
        числа по формуле х(n + 1) = (ахn + с) % m, при соответствующих значениях а, с и
        m. С этой целью реализуйте метод, принимающий параметры а, с, m и получающий поток
        данных Stream <Long>. Опробуйте его со следующими параметрами: а = 25214903917, с = 11 и m = 2^48. **/


        randomStream(0, 25214903917L, 11, 248L)
                .limit(10)
                .forEach(System.out::println);
    }

    public static Stream<Long> randomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, e -> (a * e + c) % m);
    }
}
