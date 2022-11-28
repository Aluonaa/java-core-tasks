package com.digdes.crp.javacoretasks.chapter12;

import java.time.LocalDate;
import java.time.Period;

public class Exercise1 {

    /**Рассчитайте дату, на которую приходится День программиста, не пользуясь
    методом plusDays(). **/

    public static void main(String[] args) {
        LocalDate programmersDay = LocalDate.of (2022, 1, 1).plus(Period.ofDays(255));
        System.out.println(programmersDay);
    }
}
