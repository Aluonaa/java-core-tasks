package com.digdes.crp.javacoretasks.chapter2;

import com.sun.istack.internal.Nullable;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

/** 2.10 **/

public class RandomNumbers {

    public static <T> T randomNumberFromList(List<T> list){
        int sizeOfArrayList = list.size();
        if(sizeOfArrayList == 0){
            return null;
        }
        int randomNum = new Random().nextInt(sizeOfArrayList);
        return list.get(randomNum);
    }
    public static <T> T randomNumberFromArray(T[] array){
        if(array != null) {
            int sizeOfArrayList = array.length;
            if (sizeOfArrayList == 0) {
                return null;
            }
            int randomNum = new Random().nextInt(sizeOfArrayList);
            return array[randomNum];
        }
        return null;
    }

}
