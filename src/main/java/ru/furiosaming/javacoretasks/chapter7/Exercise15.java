package main.java.ru.furiosaming.javacoretasks.chapter7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercise15 {
   /** Обобщите предыдущее упражнение произвольным функциональным
    интерфейсом IntFunction. Имейте в виду, что в конечном итоге
    может получиться бесконечная коллекция, поэтому некоторые
    методы (например, size() и toArray() должны генерировать исключение типа
    UnsupportedOperationException.  **/

   public static void main(String[] args){
       System.out.println(getUnmodifiableList((n) ->  Collections.unmodifiableList(IntStream.range(0, n).boxed().collect(Collectors.toList())),10));
   }

    public static <R> List<Integer> getUnmodifiableList(IntFunction<R> intFunction, int n) {
       @SuppressWarnings("unchecked")
       List<Integer> list = (List<Integer>) intFunction.apply(n);
        return list;
    }

}
