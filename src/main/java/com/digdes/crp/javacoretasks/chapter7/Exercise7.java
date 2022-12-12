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
    public static void main(String[] args){
        Map<String, Integer> uniqueStringsOfFile = new TreeMap<>();
            try(Scanner scanner1 = new Scanner(Paths.get(String.valueOf(Paths.get("src/main/resources/textFiles/7.7.txt")))))
            {
                while(scanner1.hasNext())
                {
                    String currentWord = scanner1.next();
                    currentWord = currentWord.replaceAll("[^A-Za-zА-Яа-я]", "");
                    uniqueStringsOfFile.merge(currentWord, 1, Integer::sum);
                }
            } catch (IOException io){
               io.printStackTrace();
            }
        uniqueStringsOfFile.remove("");
        System.out.println(uniqueStringsOfFile);
    }
}
