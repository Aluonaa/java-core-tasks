package com.digdes.crp.javacoretasks.chapter8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise16 {
    /** Найдите 500 самых длинных слов в романе "Война и мир", используя параллельный поток данных.
     *  Насколько это делается быстрее, чем при использовании последовательного потока данных? **/
    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get(
                "C:\\Users\\Strelets.A\\Desktop\\voyna-i-mir-tom-1.txt")), StandardCharsets.UTF_8);

        List<String> listOfWords = Arrays.asList(content.split("\\PL+"));


        /** параллельный поток **/
//        long startStreamOfWordsParallel = System.currentTimeMillis();
//        Stream<String> streamOfWordsParallel = listOfWords.parallelStream().sorted(Comparator.comparing(String::length).reversed()).limit(500);
//        long endStreamOfWordsParallel = System.currentTimeMillis();

        /** последовательный поток **/
        long startStreamOfWords = System.currentTimeMillis();
        Stream<String> streamOfWords = listOfWords.stream().sorted(Comparator.comparing(String::length).reversed()).limit(500);
        long endStreamOfWords = System.currentTimeMillis();

        List<String> sortedListOfWords = streamOfWords.collect(Collectors.toList());

        System.out.println(sortedListOfWords);
//        System.out.println(endStreamOfWordsParallel-startStreamOfWordsParallel);
        System.out.println(endStreamOfWords-startStreamOfWords);

    }
}
