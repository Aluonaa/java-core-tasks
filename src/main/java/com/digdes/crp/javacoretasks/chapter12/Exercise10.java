package com.digdes.crp.javacoretasks.chapter12;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Exercise10 {
    /** Самолет авиарейсом из Лос-Анджелеса во Франкфурт вылетает в 3:05
    по полудни местного времени и находится в полете 10 часов 50 минут.
    Когда он прибывает во Франкфурт? Напишите программу, способную выполнять подобные
    расчеты времени **/

    public static void main(String[] args) {
        ZoneId zoneIdFrom = ZoneId.of("America/New_York");
        LocalDateTime localDateTime = LocalDateTime.of(2022, 11, 29, 15, 5, 0);
        ZonedDateTime zonedDateTimeFrom = localDateTime.atZone(zoneIdFrom);

        System.out.println(zonedDateTimeFrom);

        ZoneId zoneIdTo = ZoneId.of("Europe/Brussels");
        ZonedDateTime zonedDateTimeTo = zonedDateTimeFrom.withZoneSameInstant(zoneIdTo);
        System.out.println(zonedDateTimeTo.plusHours(10).plusMinutes(50));

    }
}
