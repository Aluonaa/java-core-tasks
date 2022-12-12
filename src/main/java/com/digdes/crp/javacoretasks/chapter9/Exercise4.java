package com.digdes.crp.javacoretasks.chapter9;

import java.io.*;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise4 {
    /** Пользоваться классом Scanner удобно, но он действует чуть медленнее,
    чем класс BufferedReader. Организуйте построчное чтение длинного файла,
    подсчитывая количество вводимых строк, во-первых, с помощью класса Scanner и методов
    hasNextLine() и nextLine(); во-вторых, с помощью
    класса BufferedReader и метода readLine(); а в-третьих, с помощью класса
    BufferedReader и метода lines(). Каким из способов читать из файла быстрее
    и удобнее всего?

     Решение: BufferedReader это обертка для FileReader, которая добавляет механизм буферизации, работают быстрее, чем Scanner
     Уменьшает количество обращений к файлу в сравнении с FileReader, что является ресурсоемкой операцией.
     Для BufferedWriter также.**/

    public static void main(String[] args) throws IOException {
        try(Scanner scanner = new Scanner(Paths.get
                ("src/main/resources/textFiles/voyna-i-mir-tom-1.txt"));
            BufferedReader reader = new BufferedReader
                    (new FileReader("src/main/resources/textFiles/voyna-i-mir-tom-1.txt"));
            BufferedReader readerWithLines = new BufferedReader
                    (new FileReader("src/main/resources/textFiles/voyna-i-mir-tom-1.txt"));){

            // Метод Scanner
            int i = 0;
            String lineScanner;
            long startCountWithScanner = System.currentTimeMillis();
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
            List<String> linesBufferedReaderWithLines = readerWithLines.lines().collect(Collectors.toList());
            long endCountWithBufferedReaderLines = System.currentTimeMillis();

            System.out.println(endCountWithScanner-startCountWithScanner);
            System.out.println(endCountWithBufferedReader-startCountWithBufferedReader);
            System.out.println(endCountWithBufferedReaderLines-startCountWithBufferedReaderLines);
        }


    }
}
