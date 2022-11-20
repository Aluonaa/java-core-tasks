package com.digdes.crp.javacoretasks.chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise15 {

    /** Напишите программу, сохраняющую треугольник Паскаля вплоть до заданной
    величины п в переменной типа ArrayList<ArrayList<Integer». **/

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int size = size("Enter size: ");
        List<List<Integer>> triangle = new ArrayList<List<Integer>>() {{
            add(Collections.singletonList(1));
        }};

        for (int i = 1; i < size; i++) {
            List<Integer> row = new ArrayList<Integer>() {{
                add(1);
            }};
            for (int j = 1; j < i; j++) {
                List<Integer> previous = triangle.get(i - 1);
                row.add(Integer.sum(previous.get(j - 1), previous.get(j)));
            }
            row.add(1);
            triangle.add(row);
        }

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

    private static int size(String caption) {
        System.out.print(caption);
        return sc.nextInt();
    }

}
