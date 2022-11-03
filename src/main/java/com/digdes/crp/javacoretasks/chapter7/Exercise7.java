package com.digdes.crp.javacoretasks.chapter7;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise7 {
    public static void main(String[] args) throws IOException {
        Scanner scanner1 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
        Map<String, Integer> uniqueStringsOfFile = new TreeMap<>();

        while(scanner1.hasNext())
        {
            int count = 0;
            String s = scanner1.next();
            Scanner scanner2 = new Scanner(Paths.get("C:\\Users\\Strelets.A\\Desktop\\qwe.txt"));
            if (!uniqueStringsOfFile.containsKey(s)) {
                while(scanner2.hasNext()) {
                    String s2 = scanner2.next();
                    if(s2.equals(s)){
                        count++;
                    }
                }
                uniqueStringsOfFile.put(s, count);
            }
        }
        System.out.println(uniqueStringsOfFile);
    }
}
