package com.digdes.crp.javacoretasks.chapter10;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicLong;

public class Exercise16 {
    /** Напишите программу для обхода дерева каталогов с формированием
    отдельного потока исполнения для каждого файла. Подсчитайте
    в потоках исполнения количество слов в файлах и, не прибегая к блокировкам, обновите общий
    счетчик, который объявляется следующим образом:
    public static long count = 0
    Выполните эту программу неоднократно. Что при этом происходит и почему

    Решение: Если общие данные обрабатываются в нескольких потоках
    исполнения без синхронизации, то конечный результат непредсказуем.
     **/

    public static long count = 0;

    public static AtomicLong nextNumber = new AtomicLong();

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        final File folder = new File("src/main/resources/textFiles/10.11");

        List<Callable<Long>> tasks = new ArrayList<>();
        for (File f: Objects.requireNonNull(folder.listFiles())) tasks.add(
                () -> {
                    long countForThread = 0;
                    try(Scanner scanner = new Scanner(f))
                    {
                        while(scanner.hasNextLine())
                        {
                            String currentLine = scanner.nextLine();
                            String[] massOfWords = currentLine.split(" ");
                            for(int i=0; i<massOfWords.length; i++) {
                                countForThread = nextNumber.incrementAndGet();
                            }
                        }
                    }
                    catch (IOException io){
                        io.printStackTrace();
                    }
                    return countForThread;
                });

        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<Long>> l = executorService.invokeAll(tasks);

        for (Future<Long> future: l){
            System.out.println(future.get());
            count += future.get();
        }

        executorService.shutdown();

    }
}

