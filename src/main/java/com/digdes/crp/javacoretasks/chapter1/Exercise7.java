package com.digdes.crp.javacoretasks.chapter1;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа short: ");
        short one = scanner.nextShort();
        short two = scanner.nextShort();

        System.out.println((short) (one + two));
        System.out.println((short) (one * two));
        System.out.println((short) (one / two));
        System.out.println((short) (one % two));
        System.out.println((short) (one - two));
    }
}
