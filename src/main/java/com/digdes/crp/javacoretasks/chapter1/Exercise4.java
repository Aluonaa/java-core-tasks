package com.digdes.crp.javacoretasks.chapter1;

public class Exercise4 {

    /** Напишите программу, выводящую наименьшее и наибольшее
    положительные значения типа double. Подсказка: воспользуйтесь методом Math.nextUp()
    из прикладного программного интерфейса Java API **/

    public static void main(String[] args) {
        double numDouble = Math.nextUp(0f);
        System.out.println(numDouble);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_NORMAL);

        double d = 2147483648.0;
        int a = (int) d;
        System.out.println(a);
    }
}
