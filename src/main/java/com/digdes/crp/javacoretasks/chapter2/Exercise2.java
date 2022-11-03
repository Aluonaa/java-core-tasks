package com.digdes.crp.javacoretasks.chapter2;

public class Exercise2 {
    public static void main(String[] args){
        System.out.println("Проанализируйте метод nextlnt() из класса Scanner. Является ли он методом\n" +
                "//        доступа или модифицирующим методом и почему? А что можно сказать о методе nextlnt() из класса Random\n" +
                "//\n" +
                "//        Решение: метод класса Scanner является модифицирующим, так как при исключении\n" +
                "//        NumberFormatException меняется поле position. Также он считывает информацию,\n" +
                "//        вводимую пользователем, поэтому является методом доступа.\n" +
                "//        Метод класса Random является модифицирующим, так как в процессе генерирования\n" +
                "//        псевдорандома меняется поле seed.");
    }
}
