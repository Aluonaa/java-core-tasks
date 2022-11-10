package com.digdes.crp.javacoretasks.chapter1;

import java.util.Scanner;

public class Exercise8 {
    /** Напишите программу, вводящую символьную строку и выводящую все ее непустые подстроки. **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stroka = scanner.nextLine();
        String[] words = stroka.replaceAll("[\\s]{2,}", " ").split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
