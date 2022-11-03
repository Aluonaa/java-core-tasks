package com.digdes.crp.javacoretasks.chapter1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Задание 2. Введите значение угла:");
        number = scanner.nextInt();
        if (number < 0) {
            number = 0;
        } else {
            System.out.println("Способ выполнения 1: ");
            number = number % 360;
            System.out.println(number);

            System.out.println("Способ выполнения 2: ");
            number = Math.floorMod(number, 360);
            System.out.println(number);
        }
    }
}
