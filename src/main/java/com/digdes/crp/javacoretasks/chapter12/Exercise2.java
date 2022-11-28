package com.digdes.crp.javacoretasks.chapter12;

import java.time.LocalDate;
import java.time.Period;

public class Exercise2 {
    /**Что произойдет, если добавить один год, четыре года, четыре раза по одному
    году при вызове метода LocalDate.of(2000, 2, 29)

    Решение: при прибавлении одного года получается 28 февраля, тк. 29 февраля в этом году нет
    При прибавлении 4 лет(снова выпадает високосный год) получается правильная дата
    А если прибавлять 4 года поочередно, то, очевидно, после первого прибавления дата смещается на 28
    февраля, и в дальнейшем, не смотря на то, что при последнем прибавлении получается високосный год,
    в результате будет 28 февраля вместо 29**/

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(2000, 2, 29);
        System.out.println(localDate.plus(Period.ofYears(1)));
        System.out.println(localDate.plus(Period.ofYears(4)));
        System.out.println(localDate.plus(Period.ofYears(1)).plus(Period.ofYears(1)).plus(Period.ofYears(1)).plus(Period.ofYears(1)));

    }


}
