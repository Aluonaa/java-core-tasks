package com.digdes.crp.javacoretasks.chapter1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        int length = stroka.length();
        for (int i = 0; i < length; i++) {
            stroka = stroka.replaceAll(" ", "");
        }
        System.out.println(stroka);
    }
}
