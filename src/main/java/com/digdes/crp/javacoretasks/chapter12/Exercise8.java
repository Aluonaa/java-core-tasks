package com.digdes.crp.javacoretasks.chapter12;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise8 {
   /** Получите смещения текущей даты во всех поддерживаемых часовых поясах
    для текущего момента времени, преобразовав результат вызова метода Zoneld.
    getAvailableZoneIds() в поток данных и используя потоковые операции **/

   public static void main(String[] args) {

       LocalDateTime localDateTime = LocalDateTime.now();

       Set<ZonedDateTime> zonedDateTimesStream = ZoneId.getAvailableZoneIds().stream().map(element -> ZonedDateTime.of(
           localDateTime.getYear(), localDateTime.getMonth().getValue(), localDateTime.getDayOfMonth(),
           localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond(), localDateTime.getNano(),
           ZoneId.of(element))).collect(Collectors.toSet());

       for(ZonedDateTime z: zonedDateTimesStream){
           System.out.println(z);
       }

   }
}
