package com.digdes.crp.javacoretasks.chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise1 {
    /** Напишите служебный метод для копирования всего содержимого из потока
    ввода InputStream в поток вывода OutputStream, не пользуясь временными
    файлами. Предоставьте другое решение без цикла, используя методы из класса
    Files и временный файл **/

    public static void main(String[] args) throws IOException {
        Files.newOutputStream(Paths.get("src/main/resources/textFiles/9.1/9.1.1.txt")).
                write(Files.readAllBytes(Paths.get("src/main/resources/textFiles/9.1/9.1.2.txt")));
    }
}
