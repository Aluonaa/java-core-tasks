package main.java.ru.furiosaming.javacoretasks.chapter8;

import java.util.Optional;
import java.util.stream.Stream;

public class Exercise14 {
    /** Организуйте вызов метода reduce() таким образом, чтобы вычислить среднее
    в потоке данных Stream<Double> .
     **/

    public static void main(String[] args) {
        Double[] doubles = new Double[]{3.5, 18.4, 45.3456, 76.57, 114.6};
        Stream<Double> doubleStream = Stream.of(doubles);
        Optional<Double> sum = doubleStream.reduce(Double::sum);
        if(sum.isPresent()){
            System.out.println(sum.get());
            double result = sum.get() / doubles.length;
            System.out.println(result);
        }
    }
}
