package chapterTwo;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/** 2.10 **/

public class RandomNumbers {
    private static Random generator = new Random();
    public static int nextlnt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
    }
    public static <T> T randList(ArrayList<T> arrayList){
        int sizeOfArrayList = arrayList.size();
        if(sizeOfArrayList == 0){
            return null;
        }
        int randomNum = ThreadLocalRandom.current().nextInt(0, sizeOfArrayList + 1);
        return arrayList.get(randomNum);
    }
    public static <T> T randArray(T[] array){
        int sizeOfArrayList = array.length;
        if(sizeOfArrayList == 0){
            return null;
        }
        int randomNum = ThreadLocalRandom.current().nextInt(0, sizeOfArrayList + 1);
        return array[randomNum];
    }
}
