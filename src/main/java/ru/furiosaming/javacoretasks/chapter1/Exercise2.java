package main.java.ru.furiosaming.javacoretasks.chapter1;

import java.util.Scanner;

public class Exercise2 {
    /** Напишите программу, вводящую целочисленное (как положительное, так и
    отрицательное) значение угла и нормализующую его в пределах от 0 до 359
    градусов. Попробуйте сделать это сначала с помощью операции %, а затем методом floorMod(). **/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Введите значение угла:");
        number = scanner.nextInt();
        System.out.println(number < 0 ? 0 : "Способ выполнения %: " + number % 360 + "\n" +
                                            "Способ выполнения floorMod(): " + Math.floorMod(number, 360));
    }
}
