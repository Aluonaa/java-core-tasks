package com.digdes.crp.javacoretasks.chapter8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise9 {

    public static void main(String[] args) throws IOException {

        /** Определите среднюю длину строки в заданном конечном потоке символьных
         строк. **/

        double averageLength =
                Files.lines(Paths.get("src/main/resources/textFiles/8.9.txt"))
                .mapToInt(String::length)
                .average()
                .orElseThrow(IllegalStateException::new);

        System.out.println(averageLength);
    }
}
