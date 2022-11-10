package com.digdes.crp.javacoretasks.chapter1;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise6 {

    /** Напишите программу, вычисляющую факториал
    n ! = 1 х 2 * . . . х n, используя класс
    BigInteger. Вычислите факториал числа 1000 **/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 6. Введите число для вычисления факториала: ");
        int factori = scanner.nextInt();
        BigInteger bigInteger = BigInteger.ONE; // При вычислении факториала минимальный результат 1
        for (int r = 1; r <= factori; r++) {
            bigInteger = bigInteger.multiply(BigInteger.valueOf(r));
        }
        System.out.println(bigInteger);
    }
}
