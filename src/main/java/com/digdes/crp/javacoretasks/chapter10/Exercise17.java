package com.digdes.crp.javacoretasks.chapter10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Exercise17 {
    /** Усовершенствуйте программу из предыдущего упражнения, используя блокировки.
     **/

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        final File folder = new File("src/main/resources/textFiles/10.11");

        Callable<Long> task = () -> {
            long countForThread = 0;
            for (File f: Objects.requireNonNull(folder.listFiles())){
                Lock lock = new ReentrantLock();
                try (Scanner scanner = new Scanner(Paths.get(String.valueOf(Paths.get(f.getPath()))))) {
                    while (scanner.hasNextLine()) {
                        String currentLine = scanner.nextLine();
                        String[] massOfWords = currentLine.split(" ");
                        for (int i = 0; i < massOfWords.length; i++) {
                            lock.lock();
                            countForThread = countForThread + 1;
                            lock.unlock();
                        }
                    }
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }
            return countForThread;
        };

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<Long> future = executorService.submit(task);

        System.out.println(future.get());

        executorService.shutdown();

    }
}