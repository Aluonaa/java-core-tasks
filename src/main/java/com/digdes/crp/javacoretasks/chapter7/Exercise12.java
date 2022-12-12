package com.digdes.crp.javacoretasks.chapter7;

import java.util.*;

public class Exercise12 {
    /** Используя метод Collections.shuffle(), напишите программу для чтения
    предложения, перетасовки его слов и вывода результата. Устраните (до и после
    перетасовки) написание начального слова с заглавной буквы и наличие точки в
    конце предложения. Подсказка: не перетасовывайте при этом слова  **/

    public static void main(String[] args) {
        String words = "Напишите. Программу. Для. Чтения. Предложения. В. Списочный. Массив.";
        List<String> arrayList = Arrays.asList(words.split(" "));
        arrayList.set(0, arrayList.get(0).toLowerCase());
        arrayList.set(arrayList.size()-1, arrayList.get(arrayList.size()-1).replaceAll("\\.(?!.*\\.)",""));
        Collections.shuffle(arrayList);
        arrayList.set(0, arrayList.get(0).toLowerCase());
        arrayList.set(arrayList.size()-1, arrayList.get(arrayList.size()-1).replaceAll("\\.(?!.*\\.)",""));

        System.out.println(arrayList);
    }
}
