package com.digdes.crp.javacoretasks.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise10 {
    public static void main(String[] args){
        List<String> listForRandom = new ArrayList<>();
        listForRandom.add("1");
        listForRandom.add("2");
        listForRandom.add("3");
        listForRandom.add("4");
        listForRandom.add("5");
        listForRandom.add("6");
        listForRandom.add("7");
        String resultRandomFromList = RandomNumbers.randomNumberFromList(listForRandom);
        System.out.println(resultRandomFromList);

        Integer[] arrayForRandom = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        int resultRandomFromArray = arrayForRandom[new Random().nextInt(arrayForRandom.length)];
        System.out.println(resultRandomFromArray);
    }
}
