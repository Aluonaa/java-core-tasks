package com.digdes.crp.javacoretasks.chapter10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class Exercise8 {
    /** Сформируйте 1000 потоков исполнения, в которых счетчик
     *  инкрементируется 100000 раз. Сравните производительность
     *  при использовании классов AtomicLong и LongAdder. **/

    public static void main(String[] args) {
        ExecutorService executorServiceAtomicLong = Executors.newFixedThreadPool(1000);
        long startAtomicLong = System.currentTimeMillis();
        executorServiceAtomicLong.execute(() -> {
            for(int i =0; i<100000; i++) {
                AtomicLong nextNumber = new AtomicLong();
                nextNumber.incrementAndGet();
            }
        });
        executorServiceAtomicLong.shutdown();
        long endAtomicLong = System.currentTimeMillis();

        ExecutorService executorServiceLongAdder = Executors.newFixedThreadPool(1000);
        long startLongAdder = System.currentTimeMillis();
        executorServiceLongAdder.execute(() ->{
            for(int i =0; i<100000; i++) {
                LongAdder count = new LongAdder();
                count.increment();
            }
        });
        long endAtomicAdder = System.currentTimeMillis();

        System.out.println(endAtomicLong - startAtomicLong);
        System.out.println(endAtomicAdder - startLongAdder);

    }

}
