package com.digdes.crp.javacoretasks.chapter5;

import java.io.IOException;

public class Exercise3 {
    /**Напишите программу, вызывающую метод из предыдущего упражнения и
    выводящую полученный результат. Организуйте перехват исключений и
    предоставьте ответную реакцию на действия пользователя в виде сообщений о любых ошибочных условиях.
    Решение: сообщения добавлены**/

    public static void main(String[] args) {
        String filename = "C:\\Users\\Strelets.A\\Desktop\\qq.txt";
        try {
            System.out.println(Exercise2.sumOfValues(filename));
        }
        catch (IOException fileNotFoundException){
            System.out.println("Файл не найден");

        } catch (NumberFormatException  numberFormatException){
            System.out.println("Не удалось преобразовать в число. " +
                    "Методу был передан недопустимый или неуместный аргумент из файла, разрешен только double");
        }

    }


}
