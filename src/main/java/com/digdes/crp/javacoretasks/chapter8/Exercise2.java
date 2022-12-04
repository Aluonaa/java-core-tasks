package com.digdes.crp.javacoretasks.chapter8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Exercise2 {

   /** Определите разность во времени подсчета длинных слов с помощью методов
    parallelStream() и stream(). Вызовите метод System.current TimeMillis()
    до и после этих методов и выведите разность **/

    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get(
                "src/main/resources/textFiles/8.1.txt")), StandardCharsets.UTF_8);

        /** разделитель - все небуквенные символы **/
        List<String> listOfWords = Arrays.asList(content.split("\\PL+"));

        long startCountWithStreamMethod = System.currentTimeMillis();
        long countWithStreamMethod = listOfWords.stream().filter(w -> w.length() > 12).count();
        long endCountWithStreamMethod = System.currentTimeMillis();


        long startCountWithParallelStreamMethod = System.currentTimeMillis();
        long countWithParallelStreamMethod = listOfWords.parallelStream().filter(w -> w.length() > 12).count();
        long endCountWithParallelStreamMethod = System.currentTimeMillis();

        System.out.println(endCountWithStreamMethod-startCountWithStreamMethod);
        System.out.println(endCountWithParallelStreamMethod-startCountWithParallelStreamMethod);
        System.out.println(countWithStreamMethod);
        System.out.println(countWithParallelStreamMethod);

    }
}
