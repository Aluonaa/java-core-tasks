package main.java.ru.furiosaming.javacoretasks.chapter10;

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
       int countOsNumbers = 1000;
       int[] mass = new int[countOsNumbers];
       for(int i=0; i<countOsNumbers; i++){
           mass[i] = rn.nextInt();
       }
       executorService.execute(() ->{
           LongAccumulator longAccumulatorMax = new LongAccumulator(Long::max, 0L);
           LongAccumulator longAccumulatorMin = new LongAccumulator(Long::min, 0L);
           for(int i =0; i<countOsNumbers; i++) {
               for(int r=0; r<countOsNumbers; r++) {
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
