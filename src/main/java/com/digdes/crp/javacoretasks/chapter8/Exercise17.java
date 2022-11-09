package com.digdes.crp.javacoretasks.chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise17 {
    public static void main(String[] args) {

        /** Каким образом можно исключить получение смежных дубликатов
          из потока данных? Сможет ли написанный вами метод обрабатывать параллельный поток (да) **/

        Stream<String> uniqueWords =
                Stream.of("anna", "anna", "anna", "gently").distinct();
        List<String> list = uniqueWords.collect(Collectors.toList());
        System.out.println(list);

        /** параллельный поток **/
        List<String> listForParallel = new ArrayList<>();
        listForParallel.add("anna");
        listForParallel.add("anna");
        listForParallel.add("anna");
        listForParallel.add("anna");
        listForParallel.add("anna");
        listForParallel.add("anna");
        listForParallel.add("gently");
                Stream<String> uniqueWordsParallel = listForParallel.parallelStream().distinct();
                List<String> listParallel = uniqueWordsParallel.collect(Collectors.toList());
        System.out.println(listParallel);

    }

}
