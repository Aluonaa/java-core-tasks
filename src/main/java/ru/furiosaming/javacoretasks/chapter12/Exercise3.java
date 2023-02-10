package main.java.ru.furiosaming.javacoretasks.chapter12;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.util.function.Predicate;

public class Exercise3 {
    /** Реализуйте метод next(), принимающий в качестве параметра местную
    дату типа Predicate<LocalDate> и возвращающий корректор дат, который
    получает следующую дату выполнения предиката. Например, в результате
    приведенного ниже вызова вычисляется следующий рабочий день. **/

    public static void main(String[] args) {
        //Дата ниже - суббота. Следующий рабочий день должен быть 12 числа
        LocalDate localDate = LocalDate.of(2022, 12, 10);
        Predicate<LocalDate> predicate = w -> w.getDayOfWeek().getValue() < 6;
        LocalDate backToWork = localDate.with(next(predicate, localDate));
        System.out.println(backToWork);
    }

    public static TemporalAdjuster next(Predicate<LocalDate> predicate, LocalDate localDate){
        boolean f = false;
        while (!f) {
            f = predicate.test(localDate);
            if(!f) {
                localDate = localDate.plusDays(1);
            }
         }
        LocalDate finalLocalDate = localDate;
        return temporal -> finalLocalDate;
    }
}
