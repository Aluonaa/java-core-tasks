package com.digdes.crp.javacoretasks.chapter1;

import java.util.Scanner;

public class Exercise7 {
    /**Напишите программу, вводящую два числа в пределах от 0 до 65535,
    сохраняющую их в переменных типа short и вычисляющую их сумму,
    разность, произведение, частное и остаток без знака, не преобразуя эти величины в тип int **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 2 числа short: ");
        short one = scanner.nextShort();
        short two = scanner.nextShort();

        System.out.println((short) (one + two));
        System.out.println((short) (one * two));
        System.out.println((short) (one / two));
        System.out.println((short) (one % two));
        System.out.println((short) (one - two));
    }
}
