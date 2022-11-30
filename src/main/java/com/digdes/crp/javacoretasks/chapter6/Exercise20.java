package com.digdes.crp.javacoretasks.chapter6;

import java.lang.reflect.Array;

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

    }

    @SafeVarargs public static final <T> T[] repeat(int n, T... objs){
        T[] t = (T[]) Array.newInstance(objs.getClass(), n); //5 is length
        int length = Array.getLength(t); // will be 5
        for (int i=0; i<length; i++)
            Array.set(t, i, objs); // set your val here
        return t;
    }
}
