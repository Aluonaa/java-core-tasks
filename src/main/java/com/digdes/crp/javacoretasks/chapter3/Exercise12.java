package com.digdes.crp.javacoretasks.chapter3;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Exercise12 {
    /** Если задан массив объектов типа File, отсортируйте его таким образом, чтобы
    каталоги следовали перед файлами, а в каждой группе отсортируйте элементы
    по пути к ним. Воспользуйтесь лямбда-выражением, чтобы указать компаратор типа Comparator **/

    private static final String DIR = System.getProperty("java.io.tmpdir");

    public static void main(String[] args) {
        File[] files = new File(DIR).listFiles();
        sort(files);
        System.out.print(Arrays.toString(files));
    }

    private static void sort(File[] files) {
        Arrays.sort(files, Comparator.comparing(File::isFile).thenComparing(File::getPath));
    }
}