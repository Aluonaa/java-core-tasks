package com.digdes.crp.javacoretasks.chapter10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Exercise14 {
    /** Повторите предыдущее упражнение, воспользовавшись глобальным отображением
    типа ConcurrentHashMap для накопления частоты, с которой встречается
    каждое слово **/
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        final File folder = new File("src/main/resources/textFiles/10.11");

        ConcurrentHashMap<String, Integer> wordsWithFrequencyOfUse = new ConcurrentHashMap<>();
        Callable<ConcurrentHashMap<String, Integer>> tasks = () -> {
                    for (File f: folder.listFiles()) {
                    try(Scanner scanner1 = new Scanner(Paths.get(String.valueOf(Paths.get(f.getPath())))))
                    {
                        while(scanner1.hasNext())
                        {
                            String currentWord = scanner1.next();
                            currentWord = currentWord.replaceAll("[^A-Za-zА-Яа-я]", "");
                                wordsWithFrequencyOfUse.compute(currentWord, (k, v) -> v == null ? 1 : v + 1);
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
        Future<ConcurrentHashMap<String, Integer>> results = executorService.submit(tasks);
        ConcurrentHashMap<String, Integer> map = results.get();

        executorService.shutdown();

        Comparator<Map.Entry<String, Integer>> valueComparator = Map.Entry.comparingByValue();

        Map<String, Integer> sortedMap =
                map.entrySet().stream().
                        sorted(valueComparator).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMap);
    }
}



