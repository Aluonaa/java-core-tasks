package main.java.ru.furiosaming.javacoretasks.chapter5;

import java.io.IOException;
import java.util.ArrayList;

public class Exercise2 {

   /** Напишите метод public double sumOfValues (String filename) throws...,
    *  вызывающий метод из предыдущего упражнения и возвращающий сумму значений в файле.
    *  Организуйте распространение любых исключений вызывающему коду **/

   public static void main(String[] args) throws IOException, NumberFormatException{
       String filename = "src/main/resources/textFiles/5.1.txt";
       System.out.println(sumOfValues(filename));
   }

    public static double sumOfValues (String filename) throws IOException {
        Double sum = 0.0;
            ArrayList<Double> doubleArrayList = Exercise1.readValues(filename);
            for (Double d : doubleArrayList) {
                sum += d;
            }
        return sum;
    }
}
