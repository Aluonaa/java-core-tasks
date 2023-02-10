package main.java.ru.furiosaming.javacoretasks.chapter1;

import java.util.Scanner;

public class Exercise8 {
    /** Напишите программу, вводящую символьную строку и выводящую все ее непустые подстроки. **/

    public static void main(String[] args) {
        System.out.println("Введите символьную строку: ");
        Scanner scanner = new Scanner(System.in);
        String stringWithEmptySubstrings = scanner.nextLine();
        String[] nonEmptySubstrings = stringWithEmptySubstrings.replaceAll("[\\s]{2,}", " ").split(" ");
        for (String word : nonEmptySubstrings) {
            System.out.println(word);
        }
    }
}
