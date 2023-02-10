package main.java.ru.furiosaming.javacoretasks.chapter10;

import java.nio.file.Paths;
import java.util.Scanner;
import java.util.concurrent.*;

public class Exercise3 {
    /** Реализуйте метод, возвращающий задачу для чтения всех слов из файла
     *  с целью найти в нем заданное слово. Если задача прерывается,
     *  она должна быть завершена немедленно с выдачей отладочного сообщения.
     *  Запланируйте выполнение этой задачи для каждого файла в каталоге.
     *  Как только одна из задач завершится успешно, все остальные задачи
     *  должны быть немедленно прерваны. **/

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService exec = Executors.newCachedThreadPool();
        Callable<String> task = () -> {
            String word = null;
            try(Scanner scanner = new Scanner(Paths.get("src/main/resources/textFiles/voyna-i-mir-tom-1.txt"))) {
                while (scanner.hasNext()) {
                    if (Thread.currentThread().isInterrupted()) return "Выполнение прервано";
                    if(scanner.next().equals("сказал")){
                        word = "сказал";
                        return word;
                    }
                }
            }
            return word;
        };
        Future<String> future = exec.submit(task);
        exec.shutdown();
        System.out.println(future.get());
    }
}
