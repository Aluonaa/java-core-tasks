package com.digdes.crp.javacoretasks.chapter10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class Exercise13 {
    /** Повторите предыдущее упражнение, воспользовавшись на этот раз интерфейсом
    ExecutorCompletionService и объединив полученные результаты, как
    только все они будут доступны **/

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        final File folder = new File("src/main/resources/textFiles/10.11");

        List<Callable<HashMap<String, Integer>>> tasks = new ArrayList<>();
        for (File f: Objects.requireNonNull(folder.listFiles())) tasks.add(
                () -> {
                    HashMap<String, Integer> wordsWithFrequencyOfUse = new HashMap<>();
                    try(Scanner scanner1 = new Scanner(Paths.get(String.valueOf(Paths.get(f.getPath())))))
                    {
                        while(scanner1.hasNext())
                        {
                            String currentWord = scanner1.next();
                            currentWord = currentWord.replaceAll("[^A-Za-zА-Яа-я]", "");
                            wordsWithFrequencyOfUse.merge(currentWord, 1, Integer::sum);
                        }
                    }
                    catch (IOException io){
                        io.printStackTrace();
                    }
                    wordsWithFrequencyOfUse.remove("");
                    return wordsWithFrequencyOfUse;

                });

        Executor exec = Executors.newCachedThreadPool();
        ExecutorCompletionService<HashMap<String, Integer>> executorCompletionService = new ExecutorCompletionService<>(exec);
        for (Callable<HashMap<String, Integer>> task : tasks) executorCompletionService.submit(task);

        HashMap<String, Integer> allWords = new HashMap<>();
        for (int i = 0; i < tasks.size(); i++) {
            HashMap<String, Integer> currentHashMap = executorCompletionService.take().get();
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
