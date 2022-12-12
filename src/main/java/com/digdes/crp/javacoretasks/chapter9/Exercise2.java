package com.digdes.crp.javacoretasks.chapter9;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class Exercise2 {
    /**Напишите программу для чтения текстового файла и создания файла с таким
    же именем, но с расширением .toe. Этот файл должен содержать список всех
    слов из входного файла, а также список номеров строк, в которых встречается
    каждое слово. Имейте в виду, что содержимое входного файла представлено в
    кодировке UTF-8 **/

    public static void main(String[] args) {

        Set<String> uniqueStringsOfFile = new HashSet<>();
        List<Integer> stringWithAllWords = new ArrayList<>();

        try(Scanner scanner1 = new Scanner(Paths.get("src/main/resources/textFiles/9.2.txt"));
        Scanner scanner2 = new Scanner(Paths.get("src/main/resources/textFiles/9.2.txt")))
        {
            while(scanner1.hasNext())
            {
                String currentLine = scanner1.nextLine();
                String[] massOfWords = currentLine.split("\\PL+");
                uniqueStringsOfFile.addAll(Arrays.asList(massOfWords));
            }

            System.out.println(uniqueStringsOfFile);
            int i = 1;

            while(scanner2.hasNext())
            {
                String currentLine = scanner2.nextLine();
                String[] massOfWords = currentLine.split(" ");
                if(Arrays.asList(massOfWords).containsAll(uniqueStringsOfFile)){
                    stringWithAllWords.add(i);
                }
                i++;
            }
        }
        catch (IOException io){
            io.printStackTrace();
        }

        System.out.println(stringWithAllWords);

        try(FileWriter fileWriter = new FileWriter("src/main/resources/textFiles/9.2.toe")) {
            for (String s : uniqueStringsOfFile) {
                fileWriter.write(s);
                fileWriter.write(" ");
            }
            for (Integer integer : stringWithAllWords) {
                fileWriter.write(integer.toString());
            }
        }
        catch (IOException io){
            io.printStackTrace();
        }
    }
}
