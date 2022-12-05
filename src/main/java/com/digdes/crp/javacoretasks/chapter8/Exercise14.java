package com.digdes.crp.javacoretasks.chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Exercise14 {
    /** Организуйте вызов метода reduce() таким образом, чтобы вычислить среднее
    в потоке данных Stream<Double> .
     **/

    public static void main(String[] args) {
        List<Double> values = new ArrayList<>();
        values.add(3.5);
        values.add(18.6);
        values.add(14.9);
        values.add(37.2);
        values.add(32.44);
        values.add(97.87);
        Optional<Double> sum = values.stream().reduce(Double::sum);
        if(sum.isPresent()){
            System.out.println(sum.get());
            double result = sum.get() / values.size();
            System.out.println(result);
        }
    }
}
