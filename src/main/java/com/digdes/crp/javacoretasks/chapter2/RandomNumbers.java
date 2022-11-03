package com.digdes.crp.javacoretasks.chapter2;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/** 2.10 **/

public class RandomNumbers {

    private static Random generator = new Random();


    public static int nextlnt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }


    public static <T> T randomNumberFromList(List<T> list){
        int sizeOfArrayList = list.size();
        if(sizeOfArrayList == 0){
            return null;
        }
        int randomNum = ThreadLocalRandom.current().nextInt(0, sizeOfArrayList);
        return list.get(randomNum);
    }
    public static <T> T randomNumberFromArray(T[] array){
        int sizeOfArrayList = array.length;
        if(sizeOfArrayList == 0){
            return null;
        }
        int randomNum = ThreadLocalRandom.current().nextInt(0, sizeOfArrayList);
        return array[randomNum];
    }
}
