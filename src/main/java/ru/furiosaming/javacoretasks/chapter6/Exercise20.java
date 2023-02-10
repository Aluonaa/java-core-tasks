package main.java.ru.furiosaming.javacoretasks.chapter6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class Exercise20 {
    /** Реализуйте следующий метод:
    @SafeVarargs public static final <T> T[] repeat(int n, T... objs)
    Он должен возвращать массив n копий заданных объектов. Имейте в виду, что
    для этого не потребуется объект типа Class или ссылка на конструктор,
    поскольку наращивать количество объектов objs можно рефлексивно. **/

    public static void main(String[] args) {
        Integer integer1 = 4;
        Integer integer2 = 7;
        Integer integer3 = 9;
        Object[] mass = repeat(1, integer1, integer2, integer3);
        for(Object o: mass) {
            System.out.println(o.toString());
        }

    }

    @SafeVarargs
    public static <T> T[] repeat(int n, T... objs){
        @SuppressWarnings("unchecked")
        T[] t = (T[]) Array.newInstance(objs.getClass(), n*objs.length);
        int length = Array.getLength(t);
        int j = 0;
        for (int i=0; i<n; i++) {
            Array.set(t, i, objs);
        }
        return t;
    }
}
