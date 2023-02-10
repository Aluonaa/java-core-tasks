package main.java.ru.furiosaming.javacoretasks.chapter10;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise1 {
    /** Используя параллельные потоки данных, найдите в каталоге все файлы,
    содержащие заданное слово. Как найти только первый файл?
    Действительно ли поиск файлов осуществляется параллельно?
    Не обязательно, если задача небольшая, то поиск совершается в одном потоке**/

    private static final String DIR = System.getProperty("java.io.tmpdir");
    private static final String wordToFind = "daemon";

    public static void main(String[] args) {

        Runnable task = () -> {
            File[] files = new File(DIR).listFiles();
            for(File f: files){
                if(f.getName().contains(wordToFind)){
                    System.out.println(f.getName());
                    break;
                }
            }
        };
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(task);
        exec.shutdown();

    }
}
