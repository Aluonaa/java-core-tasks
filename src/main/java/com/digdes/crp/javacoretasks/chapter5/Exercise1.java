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
        try {
            System.out.println(readValues(filename).toString());
        }
        catch (IOException | NumberFormatException exception){
            exception.printStackTrace();

        }
    }

    public static ArrayList<Double> readValues(String filename) throws IOException, NumberFormatException{
        ArrayList<Double> listDouble = new ArrayList<>();
        try(Scanner scanner = new Scanner(Paths.get(filename))){
            while(scanner.hasNext()){
                listDouble.add(Double.parseDouble(scanner.next()));
            }
        }
        return listDouble;
    }
}

