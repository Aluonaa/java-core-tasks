package com.digdes.crp.javacoretasks.chapter7;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise7 {
    /** Напишите программу для чтения всех слов из файла и вывода частоты,
    с которой каждое слово встречается в нем. Воспользуйтесь для этой цели классом
    TreeMap<String, Integer> **/
    public static void main(String[] args) throws IOException {
        Scanner scanner1 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
        Map<String, Integer> uniqueStringsOfFile = new TreeMap<>();

        while(scanner1.hasNext())
        {
            int count = 0;
            String currentWord = scanner1.next();
            Scanner scanner2 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
            if (!uniqueStringsOfFile.containsKey(currentWord)) {
                while(scanner2.hasNext()) {
                    String s2 = scanner2.next();
                    if(s2.equals(currentWord)){
                        count++;
                    }
                }
                uniqueStringsOfFile.put(currentWord, count);
            }
        }
        System.out.println(uniqueStringsOfFile);
    }
}
