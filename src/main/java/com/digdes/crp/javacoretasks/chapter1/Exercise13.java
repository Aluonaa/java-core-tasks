package com.digdes.crp.javacoretasks.chapter1;

import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 49; i++) {
            integerList.add(i);
        }
        int size = 49;
        List<Integer> newIntegerList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            int deletedNumber = (random.nextInt(size) + 1) % size;
            integerList.remove(random.nextInt(size));
            size--;
            newIntegerList.add(deletedNumber);
        }
        Collections.sort(newIntegerList);
        System.out.println(newIntegerList);
    }
}
