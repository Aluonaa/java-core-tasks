package com.digdes.crp.javacoretasks.chapter10;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Exercise6 {
    /** Повторите предыдущее упражнение, но на этот раз воспользуйтесь методом
    computeIfAbsent(). В чем преимущество такого подхода? **/
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {
        String word = "граница";
        Path pathToRoot1 = Paths.get("C:\\Users\\Strelets.A\\Desktop\\javaTasks\\10.5\\10.5.1.txt");
        Path pathToRoot2 = Paths.get("C:\\Users\\Strelets.A\\Desktop\\javaTasks\\10.5\\10.5.2.txt");
        Path pathToRoot3 = Paths.get("C:\\Users\\Strelets.A\\Desktop\\javaTasks\\10.5\\10.5.3.txt");
        List<Path> pathList = new ArrayList<>();
        pathList.add(pathToRoot1);
        pathList.add(pathToRoot2);
        pathList.add(pathToRoot3);
        ExecutorService exec = Executors.newCachedThreadPool();
        Callable<ConcurrentHashMap<Path, String>> task;

        ConcurrentHashMap<Path, String> concurrentHashMap = new ConcurrentHashMap<>();



        task = () -> {pathList.forEach(path -> {
            try (Scanner scanner = new Scanner(path)) {
                while (scanner.hasNext()) {
                    if (scanner.next().equals(word)) {
                        concurrentHashMap.computeIfAbsent(path, k -> word);
                    }
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });
            return concurrentHashMap;};

        Future<ConcurrentHashMap<Path, String>> future = exec.submit(task);
        exec.shutdown();
        System.out.println(future.get());
        System.out.println();
    }
}

