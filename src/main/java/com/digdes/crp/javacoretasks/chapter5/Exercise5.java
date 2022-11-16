package com.digdes.crp.javacoretasks.chapter5;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise5 {
    /** Реализуйте метод, содержащий код, где применяются классы Scanner и
    PrintWriter (см. раздел 5.1.5). Но вместо оператора try с ресурсами воспользуйтесь
    оператором catch. Непременно закройте оба объекта, при условии, что они
    построены надлежащим образом. **/

    public static void main(String[] args) {
        String filenameFrom = "C:\\Users\\Strelets.A\\Desktop\\qq.txt";
        String fileNameTo = "C:\\Users\\Strelets.A\\Desktop\\qq2.txt";
        writingFromFileToAnother(filenameFrom, fileNameTo);
    }

    public static void writingFromFileToAnother(String filenameFrom, String fileNameTo){
        Scanner scanner = null;
        PrintWriter printWriter = null;
        try{
            scanner = new Scanner(Paths.get(filenameFrom));
            printWriter = new PrintWriter(fileNameTo);
            while (scanner.hasNext()){
                printWriter.println(scanner.nextLine());
            }
        }
        catch (IOException fileNotFoundException){
            System.out.println("Файл не найден");

        } catch (NumberFormatException  numberFormatException){
            System.out.println("Не удалось преобразовать в число. " +
                    "Методу был передан недопустимый или неуместный аргумент из файла, разрешен только double");
        }
        finally {
            if(scanner != null) scanner.close();
            if(printWriter!= null) printWriter.close();
        }
    }
}
