package com.digdes.crp.javacoretasks.chapter4;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.StringJoiner;

public class Exercise9 {
    /**
     * Напишите "универсальный" метод toString(), в котором применяется рефлексия
     * для получения символьной строки со всеми переменными экземпляра
     * объекта. В качестве дополнительного задания можете организовать обработку
     * циклических ссылок.
     **/

    public static void main(String[] args) throws Exception {
        Rectangle rectangle = new Rectangle(new Point(1, 1), 100, 50);
        System.out.println(toString(rectangle));
        System.out.println(toString("abc"));
        System.out.println(toString(new HashSet<Object>()));
    }

    public static String toString(Object o) throws Exception {
        Class<?> clazz = o.getClass();
        StringJoiner joiner = new StringJoiner(",", clazz.getName() + "{", "}");
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            joiner.add(field.getName() + "=" + field.get(o).toString());
        }
        return joiner.toString();
    }
}