package com.digdes.crp.javacoretasks.chapter9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercise4 {
    /** Пользоваться классом Scanner удобно, но он действует чуть медленнее,
    чем класс BufferedReader. Организуйте построчное чтение длинного файла,
    подсчитывая количество вводимых строк, во-первых, с помощью класса Scanner и методов
    hasNextLine() и nextLine(); во-вторых, с помощью
    класса BufferedReader и метода readLine(); а в-третьих, с помощью класса
    BufferedReader и метода lines(). Каким из способов читать из файла быстрее
    и удобнее всего? **/

    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\voyna-i-mir-tom-1.txt"));

            //BufferedReader это обертка для FileReader, которая добавляет механизм буферизации, работают быстрее, чем Scanner
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Strelets.A\\Desktop\\voyna-i-mir-tom-1.txt"));
            BufferedReader readerWithLines = new BufferedReader(new FileReader("C:\\Users\\Strelets.A\\Desktop\\voyna-i-mir-tom-1.txt"));){

            // Метод Scanner
            int i = 0;
            long startCountWithScanner = System.currentTimeMillis();
            String lineScanner;
            while(scanner.hasNext())
            {
                lineScanner = scanner.nextLine();
                i++;
            }
            long endCountWithScanner = System.currentTimeMillis();

            // Метод BufferedReader
            String lineBufferedReader;
            i = 0;
            long startCountWithBufferedReader = System.currentTimeMillis();
            while ((lineBufferedReader = reader.readLine()) != null) {
                i++;
            }
            long endCountWithBufferedReader = System.currentTimeMillis();

            // Метод BufferedReader with lines
            i = 0;
            long startCountWithBufferedReaderLines = System.currentTimeMillis();
            Stream<String> linesBufferedReaderWithLines = readerWithLines.lines();
            long endCountWithBufferedReaderLines = System.currentTimeMillis();

            System.out.println(endCountWithScanner-startCountWithScanner);
            System.out.println(endCountWithBufferedReader-startCountWithBufferedReader);
            System.out.println(endCountWithBufferedReaderLines-startCountWithBufferedReaderLines);
        }


    }
}
