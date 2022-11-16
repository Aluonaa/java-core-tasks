package com.digdes.crp.javacoretasks.chapter9;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Exercise2 {
    /**Напишите программу для чтения текстового файла и создания файла с таким
    же именем, но с расширением .toe. Этот файл должен содержать список всех
    слов из входного файла, а также список номеров строк, в которых встречается
    каждое слово. Имейте в виду, что содержимое входного файла представлено в
    кодировке UTF-8 **/

    public static void main(String[] args) throws IOException {
        Scanner scanner1 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
        Scanner scanner2 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
        OutputStream outputStream = Files.newOutputStream(Paths.get("C:\\Users\\Strelets.A\\Desktop\\out.toe"));
        PrintWriter printWriter = new PrintWriter(outputStream);
        Set<String> uniqueStringsOfFile = new HashSet<>();
        List<Integer> stringWithAllWords = new ArrayList<>();

        while(scanner1.hasNext())
        {
            String currentLine = scanner1.nextLine();
            String[] massOfWords = currentLine.split(" ");
            uniqueStringsOfFile.addAll(Arrays.asList(massOfWords));
        }

        int i = 0;

        while(scanner2.hasNext())
        {
            String currentLine = scanner2.nextLine();
            String[] massOfWords = currentLine.split(" ");
            if(Arrays.asList(massOfWords).containsAll(uniqueStringsOfFile)){
                stringWithAllWords.add(i);
            }
            i++;
        }
        for(String s: uniqueStringsOfFile){
            printWriter.write(s);
        }
        for(Integer integer: stringWithAllWords){
            printWriter.write(integer);
        }

    }
}
