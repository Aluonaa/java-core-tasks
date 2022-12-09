package com.digdes.crp.javacoretasks.chapter3;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Exercise10 {
    /**Используя методы listFiles(FileFilter) и isDirectory
    из класса java.io.File, напишите метод, возвращающий все подкаталоги из
    заданного каталога. Воспользуйтесь для этой цели лямбда-выражением вместо объекта типа
    FileFilter. Сделайте то же самое, используя ссылку на метод и анонимный
    внутренний класс. **/

    public static void main(String[] args) {

        String classpath = Exercise10.class.getProtectionDomain().getCodeSource().getLocation().getPath();

        System.out.println("Ссылка на метод: " + Arrays.toString(getSubdirectories(classpath)));
        System.out.println("Лямбда: " + Arrays.toString(getSubdirectoriesWithLambda(classpath)));
        System.out.println("Анонимный внутренний класс: " + Arrays.toString(getSubdirectoriesWithInnerClass(classpath)));

    }

    private static File[] getSubdirectories(String path) {
        File[] subdirectories = new File(path).listFiles(File::isDirectory);
        if(subdirectories == null){
            return  new File[0];
        }
        else{
            return subdirectories;
        }
    }

    private static File[] getSubdirectoriesWithLambda(String path) {
        File[] subdirectories = new File(path).listFiles(f -> f.isDirectory()); // тут должна быть лямбда по заданию
        if(subdirectories == null){
            return  new File[0];
        }
        else{
            return subdirectories;
        }
    }


    private static File[] getSubdirectoriesWithInnerClass(String path) {
        File[] subdirectories = new File(path).listFiles(new FileFilter() { // тут должен быть анонимный по заданию
            @Override
            public boolean accept(File f) {
                return f.isDirectory();
            }
        });
        if(subdirectories == null){
            return  new File[0];
        }
        else{
            return subdirectories;
        }
    }
}

