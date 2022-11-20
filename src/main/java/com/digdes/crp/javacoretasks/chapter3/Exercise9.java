package com.digdes.crp.javacoretasks.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise9 {
    /** Реализуйте следующие методы:
    public static void runTogether(Runnable... tasks)
    public static void runlnOrder(Runnable... tasks)
    Первый метод должен выполнять каждую задачу в отдельном потоке и
    возвращать полученный результат, а второй метод — все методы в текущем потоке и
    возвращать полученный результат по завершении последнего метода **/

    public static void main(String[] args) {
        Runnable[] tasksForRunTogether = createTasks(9);
        Runnable[] tasksForRunInOrder = createTasks(5);
        runTogether(tasksForRunTogether);
        runInOrder(tasksForRunInOrder);

    }
    public static Runnable[] createTasks(int count){
        List<Runnable> runnableList = new ArrayList<>();
        runnableList.add(() -> {for(int i=0; i<count;i++){
            System.out.println(i);
        }});
        return runnableList.toArray(new Runnable[]{});
    }
    public static void runTogether(Runnable... tasks){
        ExecutorService executorServiceFixedThreadPool = Executors.newFixedThreadPool(tasks.length);
        for(Runnable task: tasks){
            executorServiceFixedThreadPool.execute(task);
        }
    }
    public static void runInOrder(Runnable... tasks){
        ExecutorService executorServiceSingleThreadExecutor = Executors.newSingleThreadExecutor();
        for(Runnable task: tasks){
            executorServiceSingleThreadExecutor.execute(task);
        }
    }
}
