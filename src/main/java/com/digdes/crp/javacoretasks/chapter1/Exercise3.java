package com.digdes.crp.javacoretasks.chapter1;

import java.util.Scanner;

public class Exercise3 {
    /** Напишите программу, вводящую три целочисленных значения и выводящую
    самое большое из них, используя только условную операцию. Сделайте то же
    самое с помощью метода Math.mах() **/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Задание 3. Введите три числа:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        System.out.println("Метод 1: ");
        if (number1 >= number2 && number1 >= number3) {
            number = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            number = number2;
        } else number = number3;

        System.out.println(number);

        System.out.println("Метод 2, Math.max: ");
        number = Math.max(number1, number2);
        number = Math.max(number, number3);

        System.out.println(number);
    }
}
