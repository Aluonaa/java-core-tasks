package com.digdes.crp.javacoretasks.chapter10;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.*;
import java.util.concurrent.atomic.LongAdder;

public class Exercise18 {
    /** Усовершенствуйте программу из предыдущего упражнения, используя класс
    LongAdder. **/

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        final File folder = new File("src/main/resources/textFiles/10.11");

        Callable<LongAdder> task = () -> {
            LongAdder countForThread = new LongAdder();
            for (File f: Objects.requireNonNull(folder.listFiles())){
                try (Scanner scanner = new Scanner(f)) {
                    while (scanner.hasNextLine()) {
                        String currentLine = scanner.nextLine();
                        String[] massOfWords = currentLine.split(" ");
                        for (int i = 0; i < massOfWords.length; i++) {
                            countForThread.increment();
                        }
                    }
                } catch (IOException io) {
                    io.printStackTrace();
                }
            }
            return countForThread;
        };

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<LongAdder> future = executorService.submit(task);

        System.out.println(future.get());

        executorService.shutdown();

    }
}