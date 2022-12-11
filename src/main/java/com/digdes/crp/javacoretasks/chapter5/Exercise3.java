package com.digdes.crp.javacoretasks.chapter5;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class Exercise3 {
    /**Напишите программу, вызывающую метод из предыдущего упражнения и
    выводящую полученный результат. Организуйте перехват исключений и
    предоставьте ответную реакцию на действия пользователя в виде сообщений о любых ошибочных условиях.
    Решение: сообщения добавлены**/

    public static void main(String[] args) {
        String filename = "src/main/resources/textFiles/5.1.txt";
        try {
            System.out.println(Exercise2.sumOfValues(filename));
        }
        catch (NoSuchFileException noSuchFileException){
            System.out.println("Файл не найден");

        } catch (NumberFormatException  numberFormatException){
            System.out.println("Не удалось преобразовать в число. " +
                    "Методу был передан недопустимый или неуместный аргумент из файла, разрешен только double");
        } catch (IOException io){
            io.printStackTrace();
        }
    }
}
