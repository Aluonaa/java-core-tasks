package com.digdes.crp.javacoretasks.chapter2;
import org.opencv

import java.io.FileReader;
import java.util.Arrays;

public class Exercise13 {
    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
        try (FileReader reader = new FileReader("src/resources/test_case.csv");

             CSVReader csvReader = new CSVReader(reader)) {
            csvReader.readAll().stream().limit(10).map(Arrays::toString).forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
}
