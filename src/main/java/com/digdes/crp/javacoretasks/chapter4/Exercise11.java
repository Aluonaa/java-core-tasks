package com.digdes.crp.javacoretasks.chapter4;

import java.lang.reflect.Field;

public class Exercise11 {
    /** Напишите программу, выводящую сообщение "Hello, World",
    воспользовавшись рефлексией для поиска поля out в классе java.lang.System и методом
    invoke() для вызова метода println() **/

    public static void main(String[] args) throws Exception {
        Class<?> classForExercise = Class.forName("java.lang.System");
        Field field = classForExercise.getDeclaredField("out");
        field.getType().getMethod("println", String.class)
                .invoke(field.get(null), "Hello, World");
    }
}