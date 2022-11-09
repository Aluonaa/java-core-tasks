package com.digdes.crp.javacoretasks.chapter8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;


public class Exercise10 {
    public static void main(String[] args) throws IOException {
        /** Определите все символьные строки максимальной длины в заданном конечном
        потоке символьных строк. **/

            List<String> longestWords =
                    Files.lines(Paths.get("C:\\Users\\Strelets.A\\Desktop\\q.txt"))
                            .collect(Collectors.groupingBy(String::length))
                            .entrySet()
                            .stream()
                            .max(Map.Entry.comparingByKey())
                            .map(Map.Entry::getValue)
                            .orElse(null);

            System.out.println(longestWords);

    }
}
