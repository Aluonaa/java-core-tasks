package main.java.ru.furiosaming.javacoretasks.chapter7;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise8 {
    /** Напишите программу для чтения всех слов из файла и вывода строк,
    в которых каждое слово встречается в нем. Воспользуйтесь для
    этой цели преобразованием из символьных срок в множества. **/

    public static void main(String[] args) throws IOException {
        Scanner scanner1 = new Scanner(Paths.get("src/main/resources/textFiles/7.8.txt"));
        Scanner scanner2 = new Scanner(Paths.get("src/main/resources/textFiles/7.8.txt"));
        Set<String> uniqueStringsOfFile = new HashSet<>();

        while(scanner1.hasNext())
        {
            String currentLine = scanner1.next();
            currentLine = currentLine.replaceAll("[^A-Za-zА-Яа-я]", "");
            uniqueStringsOfFile.add(currentLine);
        }

        System.out.println("Список уникальных слов: " + uniqueStringsOfFile);

        while(scanner2.hasNext())
        {
            String currentLine = scanner2.nextLine();
            String[] massOfWords = currentLine.split(" ");
            if(Arrays.asList(massOfWords).containsAll(uniqueStringsOfFile)){
                System.out.println("Строка, содержащая все уникальные слова: " + currentLine);
            }
        }
    }
}
