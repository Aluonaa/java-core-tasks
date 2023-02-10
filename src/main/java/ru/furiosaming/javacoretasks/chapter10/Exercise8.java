package main.java.ru.furiosaming.javacoretasks.chapter10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAdder;

public class Exercise8 {
    /** Сформируйте 1000 потоков исполнения, в которых счетчик
     *  инкрементируется 100000 раз. Сравните производительность
     *  при использовании классов AtomicLong и LongAdder. **/

    public static LongAdder count = new LongAdder();
    public static void main(String[] args) {
        ExecutorService executorServiceAtomicLong = Executors.newFixedThreadPool(1000);
        long startAtomicLong = System.currentTimeMillis();
        executorServiceAtomicLong.execute(() -> {
            AtomicLong nextNumber = new AtomicLong();
            for(int i =0; i<100000; i++) {
                nextNumber.incrementAndGet();
            }
        });
        executorServiceAtomicLong.shutdown();
        long endAtomicLong = System.currentTimeMillis();

        ExecutorService executorServiceLongAdder = Executors.newFixedThreadPool(1000);
        long startLongAdder = System.currentTimeMillis();
        executorServiceLongAdder.execute(() ->{
            LongAdder count = new LongAdder();
            for(int i =0; i<100000; i++) {
                count.increment();
            }
        });
        long endLongAdder = System.currentTimeMillis();
        executorServiceAtomicLong.shutdown();
        executorServiceLongAdder.shutdown();

        System.out.println("AtomicLong: " + (endAtomicLong - startAtomicLong));
        System.out.println("LongAdder: " + (endLongAdder - startLongAdder));

    }

}
