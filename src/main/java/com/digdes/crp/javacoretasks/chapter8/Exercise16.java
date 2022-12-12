package com.digdes.crp.javacoretasks.chapter8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise16 {
    /** Найдите 500 самых длинных слов в романе "Война и мир", используя параллельный поток данных.
     *  Насколько это делается быстрее, чем при использовании последовательного потока данных? **/
    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get(
                "src/main/resources/textFiles/voyna-i-mir-tom-1.txt")), StandardCharsets.UTF_8);

        List<String> listOfWords = Arrays.asList(content.split("\\PL+"));

        /** последовательный поток **/
        long startStreamOfWords = System.currentTimeMillis();
        List<String> streamOfWords = listOfWords.stream().sorted(Comparator.comparing(String::length)
                .reversed()).limit(500).collect(Collectors.toList());
        long endStreamOfWords = System.currentTimeMillis();

        /** параллельный поток **/
        long startStreamOfWordsParallel = System.currentTimeMillis();
        List<String> streamOfWordsParallel = listOfWords.parallelStream().sorted(Comparator.comparing(String::length)
                .reversed()).limit(500).collect(Collectors.toList());
        long endStreamOfWordsParallel = System.currentTimeMillis();


        System.out.println(streamOfWords);
        System.out.println("Время работы параллельного потока: " + (endStreamOfWordsParallel-startStreamOfWordsParallel));
        System.out.println("Время работы обычного потока: " + (endStreamOfWords-startStreamOfWords));

    }
}
