package com.digdes.crp.javacoretasks.chapter5;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    /** Напишите метод public ArrayList<Double> readValues(String filename)
    throws..., читающий числа с плавающей точкой из файла. Сгенерируйте
    подходящие исключения, если файл не удается открыть или же если введены
    данные, не относящиеся к числам с плавающей точкой. **/

    public static void main(String[] args) {
        String filename = "C:\\Users\\Strelets.A\\Desktop\\qq.txt";
        System.out.println(readValues(filename).toString());
    }

    public static ArrayList<Double> readValues(String filename){
        ArrayList<Double> listDouble = new ArrayList<>();
        try(Scanner scanner = new Scanner(Paths.get(filename))){
            while(scanner.hasNext()){
                listDouble.add(Double.parseDouble(scanner.next()));
            }
        } catch (IOException fileNotFoundException){
            System.out.println("Файл не найден");

        } catch (NumberFormatException  numberFormatException){
            System.out.println("Не удалось преобразовать в число. " +
                    "Методу был передан недопустимый или неуместный аргумент из файла, разрешен только double");
        }
        return listDouble;
    }
}

