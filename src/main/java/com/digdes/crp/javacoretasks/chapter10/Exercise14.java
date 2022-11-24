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

        List<Callable<ConcurrentHashMap<String, Integer>>> tasks = new ArrayList();
        ConcurrentHashMap<String, Integer> wordsWithFrequencyOfUse = new ConcurrentHashMap<>();
        for (File f: folder.listFiles()) tasks.add(
                () -> {
                    try(Scanner scanner1 = new Scanner(Paths.get(String.valueOf(Paths.get(f.getPath())))))
                    {
                        while(scanner1.hasNext())
                        {
                            String currentWord = scanner1.next();
                            currentWord = currentWord.replaceAll("[^A-Za-zА-Яа-я]", "");
                            if(wordsWithFrequencyOfUse.containsKey(currentWord)){
                                wordsWithFrequencyOfUse.put(currentWord, wordsWithFrequencyOfUse.get(currentWord) + 1);
                            }
                            else {
                                wordsWithFrequencyOfUse.put(currentWord, 1);
                            }
                        }
                    }
                    catch (IOException io){
                        io.printStackTrace();
                    }
                    wordsWithFrequencyOfUse.remove("");
                    return wordsWithFrequencyOfUse;

                });

        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<ConcurrentHashMap<String, Integer>>> results = executorService.invokeAll(tasks);

        executorService.shutdown();
        HashMap<String, Integer> allWords = new HashMap<>();
        for (Future<ConcurrentHashMap<String, Integer>> future : results) {
            ConcurrentHashMap<String, Integer> currentHashMap = future.get();
            for(Map.Entry<String, Integer> entry: currentHashMap.entrySet()){
                if(currentHashMap.containsKey(entry.getKey())){
                    allWords.put(entry.getKey(), currentHashMap.get(entry.getKey()) + entry.getValue());
                }
                else {

                    allWords.put(entry.getKey(), entry.getValue());
                }
            }
        }
        Comparator<Map.Entry<String, Integer>> valueComparator = Map.Entry.comparingByValue();

        Map<String, Integer> sortedMap =
                allWords.entrySet().stream().
                        sorted(valueComparator).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));


        for(int i = 1; i<=10; i++) {
            System.out.println(sortedMap.entrySet().toArray()[sortedMap.size() - i]);
        }

    }
}



