package com.digdes.crp.javacoretasks.chapter1;

import java.util.Scanner;

public class Exercise1 {
    /**Напишите программу, вводящую целочисленное значение и выводящую его
    в двоичной, восьмеричной и шестнадцатеричной форме. Организуйте вывод
    обратного значения в виде шестнадцатеричного числа с плавающей точкой **/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите целое число:");
        int number = scanner.nextInt();
        System.out.println("Двоичная система: " + Integer.toBinaryString(number) + "\n" +
                           "Восьмеричная система: " + Integer.toOctalString(number) + "\n" +
                           "Шестнадцатеричная система: " + Integer.toHexString(number));
    }
}
