package com.digdes.crp.javacoretasks.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise10 {

    /** 10. Предоставьте в классе RandomNumbers два статических метода типа random
            Element, получающих произвольный элемент из обычного или списочного
            массива целочисленных значений. (Если обычный или списочный массив пуст,
            должен быть возвращен нуль.) **/

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
        String resultRandomFromArray = RandomNumbers.randomNumberFromArray(arrayForRandom).toString();
        System.out.println(resultRandomFromArray);
    }
}
