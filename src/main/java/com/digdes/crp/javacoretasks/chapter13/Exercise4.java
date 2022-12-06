package com.digdes.crp.javacoretasks.chapter13;

import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Exercise4 {
    /** Напишите программу, выводящую названия всех языков из региональных настроек
    вашей виртуальной машины JVM на всех имеющихся языках. Отсортируйте их, исключив дубликаты. **/

    public static void main(String[] args) {
        Set<String> languages = Arrays.stream(Locale.getISOLanguages())
                .map(Locale::new)
                .map(Locale::getDisplayLanguage)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(languages);
    }
}
