package com.digdes.crp.javacoretasks.chapter3;

import java.io.File;
import java.util.Arrays;

public class Exercise11 {
    /** Используя метод list(FilenameFilter) из класса
    java.io.File, напишите метод, возвращающий все файлы из заданного
    каталога с указанным расширением. Воспользуйтесь для этой цели лямбда-выражением вместо объекта типа
    FilenameFilter. **/

    private static final String DIRECTORY = System.getProperty("java.io.tmpdir");

    public static void main(String[] args) {
        System.out.println("*.tmp в директории " + DIRECTORY);
        System.out.print(Arrays.toString(withExtension()));
    }

    private static String[] withExtension() {
        return new File(Exercise11.DIRECTORY).list((directory, name) -> name.endsWith(".tmp"));
    }
}

