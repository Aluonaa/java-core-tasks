package com.digdes.crp.javacoretasks.chapter10;


import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise10 {

    /** Воспользуйтесь блокирующей очередью для обработки файлов в каталоге.
    В одном потоке исполнения организуйте обход дерева каталога и ввод файлов
    в очередь, а в нескольких потоках исполнения — удаление файлов и поиск в
    каждом из них заданного ключевого слова с выводом любых совпадений. **/

    public static void main(String[] args) {
        //Один поток исполнения
        Runnable runnableForOneThread = () -> {
            final File folder = new File("src/main/resources/textFiles/10.10");
            ConcurrentLinkedDeque<File> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
            for (final File fileEntry : folder.listFiles()) {
                if (fileEntry.isDirectory()) {

                } else {
                    concurrentLinkedDeque.add(fileEntry);
                    System.out.println(fileEntry.getName());
                }
            }
        };

        ExecutorService executorService1 = Executors.newFixedThreadPool(1);
        executorService1.execute(runnableForOneThread);
        executorService1.shutdown();


        Runnable runnableForMultipleThreads = () -> {
            final File folder = new File("src/main/resources/textFiles/10.10");
            ConcurrentLinkedDeque<File> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();
            String word = "Hello";
            for (final File fileEntry : folder.listFiles()) {
                if (fileEntry.isDirectory()) {

                } else {
                    concurrentLinkedDeque.add(fileEntry);
                }
            }
            for(final File fileEntry: concurrentLinkedDeque){
                try(Scanner scanner = new Scanner(Paths.get(fileEntry.getPath())))
                {
                    while(scanner.hasNext())
                    {
                        String wordFromFile = scanner.next();
                        if(wordFromFile.equals(word)){
                            System.out.println(fileEntry.getPath());
                        }
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                concurrentLinkedDeque.pollFirst();
            }
         };

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.execute(runnableForMultipleThreads);
        executorService.shutdown();
    }
}
