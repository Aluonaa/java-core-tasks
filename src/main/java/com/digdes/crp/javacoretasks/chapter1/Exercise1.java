package com.digdes.crp.javacoretasks.chapter1;

import java.util.Scanner;

public class Exercise1 {

    /**Напишите программу, вводящую целочисленное значение и выводящую его
    в двоичной, восьмеричной и шестнадцатеричной форме. Организуйте вывод
    обратного значения в виде шестнадцатеричного числа с плавающей точкой **/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Задание 1. Введите целое число:");
        number = scanner.nextInt();
        String s2 = Integer.toBinaryString(number);
        String s8 = Integer.toOctalString(number);
        String s16 = Integer.toHexString(number);
        System.out.println("Двоичная система: " + s2 + "  Восьмеричная система: " + s8 + "  Шестнадцатеричная система: " + s16);
    }
}
