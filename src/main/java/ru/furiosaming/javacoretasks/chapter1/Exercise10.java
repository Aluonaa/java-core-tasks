package main.java.ru.furiosaming.javacoretasks.chapter1;

import java.util.Random;

public class Exercise10 {
    /** Напишите программу, составляющую произвольную символьную строку из
    букв и цифр, генерируя произвольное значение типа long и выводя его по основанию 36 **/

    public static void main(String[] args) {
        Random random = new Random();
        long randomNumber = random.nextLong();
        System.out.println(Long.toString(randomNumber, Character.MAX_RADIX));
    }
}
