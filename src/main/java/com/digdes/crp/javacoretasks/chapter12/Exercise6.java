package com.digdes.crp.javacoretasks.chapter12;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Exercise6 {

    /** Выведите перечень всех пятниц, которые пришлись на 13-е число в XX веке **/

    public static void main(String[] args) {
        int count = 0;
        LocalDate start = LocalDate.of(1900, 1, 1);
        for (int year = 1900; year<2001; year++){
            for (int month=1; month<=12; month++) {
                LocalDate d =LocalDate.of(year,month,13);
                if(d.getDayOfWeek() == DayOfWeek.FRIDAY){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
