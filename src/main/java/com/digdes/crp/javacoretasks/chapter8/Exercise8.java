package com.digdes.crp.javacoretasks.chapter8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise8 {
    /** Прочитайте слова из файла / u s r / s h a r e / d ic t / w o r d s (или аналогичного списка
            слов) в поток данных и получите массив всех слов, содержащих пять отдельных
    гласных. **/

//    public static void main(String[] args) throws IOException {
//        String content = new String(Files.readAllBytes(Paths.get(
//                "src/main/resources/textFiles/8.1.txt")), StandardCharsets.UTF_8);
//
//        /** разделитель - все небуквенные символы **/
//        List<String> listOfWords = Arrays.asList(content.split("\\PL+"));
//        Stream<List<String>> stringStream = Stream.of(listOfWords);
//        List<String> list = stringStream.filter(String::co);
//
//
//        Files.lines(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe2.txt"))
//                .collect(Collectors.groupingBy(String::length))
//                .entrySet()
//                .stream()
//                .max(line -> line.split("[aeiou]", -1).length)
//                .map(Map.Entry::getValue)
//                .orElse(null);
//    }
}
