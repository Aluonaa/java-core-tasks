package com.digdes.crp.javacoretasks.chapter12;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class Exercise11 {

    /** Самолет обратным авиарейсом из Франкфурта вылетает в 14:05 и прибывает в
    Лос-Анджелес в 16:40. Сколько времени длится полет? Напишите программу,
    способную выполнять подобные расчеты времени **/

    public static void main(String[] args) {

        ZoneId zoneIdFrom = ZoneId.of("Europe/Brussels");
        ZoneId zoneIdTo = ZoneId.of("America/Los_Angeles");

        LocalDateTime localDateTimeFrom = LocalDateTime.of(2022, 11, 29, 14, 5, 0);
        LocalDateTime localDateTimeTo = LocalDateTime.of(2022, 11, 29, 16, 40, 0);

        ZonedDateTime zonedDateTimeFrom = localDateTimeFrom.atZone(zoneIdFrom);
        ZonedDateTime zonedDateTimeTo = localDateTimeTo.atZone(zoneIdTo);

        System.out.println(zonedDateTimeDifference(zonedDateTimeFrom, zonedDateTimeTo, ChronoUnit.HOURS));
    }
    static long zonedDateTimeDifference(ZonedDateTime d1, ZonedDateTime d2, ChronoUnit unit){
        return unit.between(d1, d2);
    }
}

