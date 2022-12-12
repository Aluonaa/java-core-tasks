package com.digdes.crp.javacoretasks.chapter12;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise9 {
    /** Используя снова потоковые операции, выявите все часовые пояса, смещения
    которых не кратны полному часу. **/

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();

        Set<ZonedDateTime> zonedDateTimesStream = ZoneId.getAvailableZoneIds().stream().map(element -> ZonedDateTime.of(
                localDateTime.getYear(), localDateTime.getMonth().getValue(), localDateTime.getDayOfMonth(),
                localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano(),
                ZoneId.of(element))).filter(zonedDateTime -> zonedDateTime.getOffset().getTotalSeconds() % 3600 != 0).collect(Collectors.toSet());

        for(ZonedDateTime z: zonedDateTimesStream){
            System.out.println(z);
        }

    }
}