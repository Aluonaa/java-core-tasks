package com.digdes.crp.javacoretasks.chapter12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exercise5 {
    /** Напишите программу, выводящую количество дней, которые вы прожили. **/

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1996, 5, 19);
        LocalDate now = LocalDate.now();
        long daysBetween = birthday.until(now, ChronoUnit.DAYS);
        System.out.println(daysBetween);
    }
}
