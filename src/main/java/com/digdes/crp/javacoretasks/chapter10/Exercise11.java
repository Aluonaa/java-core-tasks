package com.digdes.crp.javacoretasks.chapter10;


import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Exercise11 {
    /** Повторите предыдущее упражнение, но на этот раз сформируйте в задаче
    потребителя отображение слов и частоты, с которой они вводятся во вторую
    очередь. В последнем потоке исполнения полученные словари должны быть
    объединены, а затем выведены десять наиболее употребительных слов. Почему
    для этой цели не потребуется отображение типа ConcurrentHashMap?

    Решение: потому что у каждого потока своя коллекция, а объединяются они в main**/

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        final File folder = new File("src/main/resources/textFiles/10.11");

        List<Callable<HashMap<String, Integer>>> tasks = new ArrayList<>();
        for (File f: Objects.requireNonNull(folder.listFiles())) tasks.add(
                () -> {
                    HashMap<String, Integer> wordsWithFrequencyOfUse = new HashMap<>();
                    try(Scanner scanner = new Scanner(Paths.get(String.valueOf(Paths.get(f.getPath())))))
                    {
                        while(scanner.hasNext())
                        {
                            String currentWord = scanner.next();
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
        List<Future<HashMap<String, Integer>>> results = executorService.invokeAll(tasks);
        executorService.shutdown();
        ConcurrentHashMap<String, Integer> allWords = new ConcurrentHashMap<>();

        for (Future<HashMap<String, Integer>> future : results) {
            HashMap<String, Integer> currentHashMap = future.get();
            currentHashMap.forEach((key, value) ->
                    allWords.merge(key, value, Integer::sum) );

        }

        Comparator<Map.Entry<String, Integer>> valueComparator = Map.Entry.comparingByValue();

        Map<String, Integer> sortedMap =
                allWords.entrySet().stream().
                        sorted(valueComparator.reversed()).limit(10).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));

            System.out.println(sortedMap);
    }
}

