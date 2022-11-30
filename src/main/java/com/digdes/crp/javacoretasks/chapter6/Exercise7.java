package com.digdes.crp.javacoretasks.chapter6;

public class Exercise7 {
    /** Реализуйте обобщенный класс Pair<E>, позволяющий сохранять пару элементов
    типа Е. Предоставьте методы доступа для получения первого и второго элементов **/

    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(1, 17);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
