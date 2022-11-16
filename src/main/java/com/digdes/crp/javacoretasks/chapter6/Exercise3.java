package com.digdes.crp.javacoretasks.chapter6;

public class Exercise3 {
    /** Реализуйте обобщенный класс Table<K, V>, управляющий списочным массивом,
    состоящим из элементов типа Entry<K, V>. Предоставьте методы для
    получения значения, связанного с ключом, установки значения по заданному
    ключу и удаления ключа. **/

    public static void main(String[] args) {
        Entry<Integer, String> entry = new Entry<>(1, "Value");
        Table<Integer, String> table = new Table<>(entry);
        System.out.println(table.getEntry().getKey());
        table.getEntry().setKey(2);
        table.getEntry().deleteKey();
        System.out.println(table.toString());
    }
}
