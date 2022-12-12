package com.digdes.crp.javacoretasks.chapter8;

import java.util.stream.Stream;

public class Exercise11 {
    /** Допустим, что ваш непосредственный начальник дал вам задание написать метод
    public static <Т>boolean isFinite (Stream<T>stream).
    Почему это не самая удачная мысль? Все равно напишите этот метод

     Решение: Потому что чтобы посчитать элементы в потоке используется терминальная операция
     и поток больше не будет использоваться и если поток бесконечный, этот метод будет выполняться без остановки **/

    public static void main(final String[] args) {
        final Stream<Integer> finiteStream = Stream.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final Stream<Integer> infiniteStream = Stream.generate(() -> 1);

        System.out.println(isFinite(finiteStream));

        try {
            finiteStream.count();
        } catch (final IllegalStateException e) {
            e.printStackTrace();
        }

        isFinite(infiniteStream);
    }

    public static <T> boolean isFinite(final Stream<T> stream) {
        return stream.count() <= Long.MAX_VALUE;
    }
}