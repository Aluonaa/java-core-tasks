package com.digdes.crp.javacoretasks.chapter13;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise7 {
    /** Напишите программу, выводящую списком отображаемые и самостоятельные
    названия месяцев во всех региональных настройках, где они отличаются,
    учитывая то, что самостоятельные названия месяцев могут состоять из цифр. **/

    public static void main(String[] args) {

        List<String> months = Arrays.stream(Locale.getAvailableLocales())
                .collect(Collectors.toList()).stream().map(currentLocale ->
                        Month.of(12).getDisplayName(TextStyle.FULL_STANDALONE, currentLocale)).distinct().collect(Collectors.toList());
        System.out.println(months);
        }

}
