package com.digdes.crp.javacoretasks.chapter2;

import au.com.bytecode.opencsv.CSVReader;

import java.io.FileReader;
import java.util.Arrays;

public class Exercise13 {
    /**Загрузите архивный JAR-файл с библиотекой OpenCSV по адресу h t t p : / /
    o p e n c s v . s o u r c e f o r g e . n e t . Напишите класс с методом main()
    для чтения избранных файлов формата CSV и вывода некоторого их содержимого.
    Соответствующий образец кода можно найти на веб-сайте библиотеки OpenCSV по
    указанному выше адресу. А поскольку вы еще не научились обрабатывать исключения,
    го воспользуйтесь следующим заголовком для метода main ():
    public static void main(String[] args) throws Exception
    Назначение данного упражнения — не сделать что-нибудь полезное с файлами
    формата CSV, но поупражняться в применении библиотеки, предоставляемой
    в упомянутом выше архивном JAR-файле. **/

    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\Strelets.A\\Desktop\\q.csv");
             CSVReader csvReader = new CSVReader(reader)) {
            csvReader.readAll().stream().limit(5).map(Arrays::toString).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
