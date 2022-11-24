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
    для этой цели не потребуется отображение типа ConcurrentHashMap? **/

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        final File folder = new File("src/main/resources/textFiles/10.11");

        List<Callable<HashMap<String, Integer>>> tasks = new ArrayList();
        for (File f: folder.listFiles()) tasks.add(
                () -> {
                    HashMap<String, Integer> wordsWithFrequencyOfUse = new HashMap<>();
                    try(Scanner scanner1 = new Scanner(Paths.get(String.valueOf(Paths.get(f.getPath())))))
                    {
                        while(scanner1.hasNext())
                        {
                            String currentWord = scanner1.next();
                            currentWord = currentWord.replaceAll("[^A-Za-zА-Яа-я]", "");
                            if(wordsWithFrequencyOfUse.containsKey(currentWord)){
                                //System.out.println(currentWord);
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
                    return wordsWithFrequencyOfUse;

                });

        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<HashMap<String, Integer>>> results = executorService.invokeAll(tasks);

        executorService.shutdown();
        HashMap<String, Integer> allWords = new HashMap<>();
        for (Future<HashMap<String, Integer>> future : results) {
            HashMap<String, Integer> currentHashMap = future.get();
            for(Map.Entry<String, Integer> entry: currentHashMap.entrySet()){
                if(currentHashMap.containsKey(entry.getKey())){
                    allWords.put(entry.getKey(), currentHashMap.get(entry.getKey()) + entry.getValue());
                }
                else {

                    allWords.put(entry.getKey(), entry.getValue());
                }
            }
        }
        Comparator<Map.Entry<String, Integer>> valueComparator = Comparator.comparing(Map.Entry::getValue);

        Map<String, Integer> sortedMap =
                allWords.entrySet().stream().
                        sorted(valueComparator).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));


        for(int i = 2; i<=11; i++) {
            System.out.println(String.valueOf(sortedMap.entrySet().toArray()[sortedMap.size() - i]));
        }

    }
}

