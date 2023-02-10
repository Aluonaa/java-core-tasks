package main.java.ru.furiosaming.javacoretasks.chapter10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Objects;
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
        final File folder = new File("src/main/resources/textFiles/10.10");

        //Один поток исполнения
        Runnable runnableForOneThread = () -> {
            ConcurrentLinkedDeque<Path> concurrentLinkedDequeForOneThread = new ConcurrentLinkedDeque<>();
            for (File fileEntry : Objects.requireNonNull(folder.listFiles())) {
                if (!fileEntry.isDirectory()) {
                    concurrentLinkedDequeForOneThread.add(fileEntry.toPath());
                }
            }
            System.out.println(concurrentLinkedDequeForOneThread);
        };

        ExecutorService executorService1 = Executors.newFixedThreadPool(1);
        executorService1.execute(runnableForOneThread);
        executorService1.shutdown();


        //Несколько потоков исполнения
        Runnable runnableForMultipleThreads = () -> {
            ConcurrentLinkedDeque<Path> concurrentLinkedDequeForMultipleThreads = new ConcurrentLinkedDeque<>();
            String searchWord = "Hello";
            for (final File fileEntry : Objects.requireNonNull(folder.listFiles())) {
                if (!fileEntry.isDirectory()) {
                    concurrentLinkedDequeForMultipleThreads.add(fileEntry.toPath());
                }
            }
            for(Path fileEntry: concurrentLinkedDequeForMultipleThreads){
                try(Scanner scanner = new Scanner(fileEntry))
                {
                    while(scanner.hasNext())
                    {
                        String wordFromFile = scanner.next();
                        if(wordFromFile.equals(searchWord)){
                            System.out.println("Слово " + searchWord + " найдено в файле: " + fileEntry);
                        }
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
                concurrentLinkedDequeForMultipleThreads.pollFirst();
            }
         };

        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(runnableForMultipleThreads);
        executorService.shutdown();
    }
}
