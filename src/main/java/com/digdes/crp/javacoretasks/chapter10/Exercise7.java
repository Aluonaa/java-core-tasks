package com.digdes.crp.javacoretasks.chapter10;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;

public class Exercise7 {
    /** Найдите в отображении типа ConcurrentHashMap<String, Long>
    ключ с максимальным значением, произвольно отбрасывая лишнее. Подсказка: воспользуйтесь методом
    reduceEntries(). **/

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        final File folder = new File("src/main/resources/textFiles/10.11");

        ConcurrentHashMap<String, Long> wordsWithFrequencyOfUse = new ConcurrentHashMap<>();
        Callable<ConcurrentHashMap<String, Long>> task = () -> {
            for (File f: Objects.requireNonNull(folder.listFiles())) {
                try(Scanner scanner1 = new Scanner(f))
                {
                    while(scanner1.hasNext())
                    {
                        String currentWord = scanner1.next();
                        currentWord = currentWord.replaceAll("[^A-Za-zА-Яа-я]", "");
                        wordsWithFrequencyOfUse.merge(currentWord, (long) 1, Long::sum);
                    }
                }
                catch (IOException io){
                    io.printStackTrace();
                }
                wordsWithFrequencyOfUse.remove("");

            }
            return wordsWithFrequencyOfUse;
        };

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<ConcurrentHashMap<String, Long>> results = executorService.submit(task);
        ConcurrentHashMap<String, Long> map = results.get();

        executorService.shutdown();

        Map.Entry<String, Long> entry =
                map.reduceEntries(
                        Runtime.getRuntime().availableProcessors(),
                        (v1, v2) -> v1.getValue() > v2.getValue() ? v1 : v2);
        System.out.println(entry);
    }
}

