package com.digdes.crp.javacoretasks.chapter6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exercise15 {
    /** Реализуйте метод mар () , получающий списочный массив и объект типа
    Function<T ,R> (см. главу 3) и возвращающий списочный массив, состоящий
    из результатов применения функции к заданным элементам этого массива. **/

    public static void main(String[] args) {

        Function<ArrayList<String>, List<Integer>> function = strings -> {
            List<Integer> nameLength = strings.stream()
                    .map(String::length).collect(Collectors.toList());
            nameLength.stream().forEach(System.out::println);
            return nameLength;
        };

        ArrayList<String> listString = new ArrayList<>();
        listString.add("123456");
        listString.add("ewrtyuio");
        listString.add("ytrewqwerfghy7");
        listString.add("erty");

        swap(function, listString);

    }

    public static <T, R> void swap(Function<T,R> function, T arrayList){
        function.apply(arrayList);
    }
}
