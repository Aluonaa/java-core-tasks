package com.digdes.crp.javacoretasks.chapter10;

import java.util.Arrays;
import java.util.Random;

public class Exercise2 {
    /** Насколько большим должен быть массив, чтобы метод Arrays.parallelSort()
    выполнялся быстрее, чем метод Arrays.sort() на вашем компьютере? **/

    public static void main(String[] args) {
        Random random = new Random();
        int count = 100000;
        int[] mass = new int[count];
        int[] mass2 = new int[count];
        for(int i=0; i<count; i++){
            mass[i] = random.nextInt();
        }
        for(int i=0; i<count; i++){
            mass2[i] = random.nextInt();
        }
        long startParallelSort = System.currentTimeMillis();
        Arrays.parallelSort(mass);
        long endParallelSort = System.currentTimeMillis();

        long startSort = System.currentTimeMillis();
        Arrays.sort(mass2);
        long endSort = System.currentTimeMillis();

        System.out.println(endParallelSort-startParallelSort);
        System.out.println(endSort-startSort);

    }
}
