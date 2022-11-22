package com.digdes.crp.javacoretasks.chapter10;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAccumulator;

public class Exercise9 {
   /** Воспользуйтесь классом LongAccumulator для вычисления максимального и
    минимального накапливаемых элементов **/
   public static void main(String[] args) {

       ExecutorService executorService = Executors.newFixedThreadPool(1000);
       Random rn = new Random();
       int[] mass = new int[100];
       for(int i=0; i<100; i++){
           mass[i] = rn.nextInt();
       }
       executorService.execute(() ->{
           LongAccumulator longAccumulatorMax = new LongAccumulator(Long::max, 0L);
           LongAccumulator longAccumulatorMin = new LongAccumulator(Long::min, 0L);
           for(int i =0; i<100; i++) {
               for(int r=0; r<100; r++) {
                   longAccumulatorMax.accumulate(mass[i]);
                    longAccumulatorMin.accumulate(mass[i]);
               }
           }
           long max = longAccumulatorMax.get();
           long min = longAccumulatorMin.get();
           System.out.println(max);
           System.out.println(min);
       });
       executorService.shutdown();
   }
}