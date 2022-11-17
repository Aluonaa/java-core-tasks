package com.digdes.crp.javacoretasks.chapter9;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise1 {
    /**Напишите служебный метод для копирования всего содержимого из потока
    ввода InputStream в поток вывода OutputStream, не пользуясь временными
    файлами. Предоставьте другое решение без цикла, используя методы из класса
    Files и временный файл **/

    public static void main(String[] args) throws IOException {
        String inFile = "C:\\Users\\Strelets.A\\Desktop\\qq.txt";
        String outFile = "C:\\Users\\Strelets.A\\Desktop\\9.1.txt";
        InputStream in = Files.newInputStream(Paths.get(outFile));
        OutputStream out = Files.newOutputStream(Paths.get(outFile));
        out.write(Files.readAllBytes(Paths.get(inFile)));

    }
}
