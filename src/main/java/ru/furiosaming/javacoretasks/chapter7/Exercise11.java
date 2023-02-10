package main.java.ru.furiosaming.javacoretasks.chapter7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exercise11 {
    /** Напишите программу для чтения предложения в списочный массив.
    Затем перетасуйте в массиве все слова, кроме первого и последнего, используя метод
    Collections.shuffle(), но не копируя слова в другую коллекцию. **/

    public static void main(String[] args) {
        String words = "Напишите программу для чтения предложения в списочный массив Затем перетасуйте" +
                " в массиве все слова кроме первого и последнего используя метод но не копируя слова в другую коллекцию";
        List<String> arrayList = Arrays.asList(words.split(" "));
        Collections.shuffle(arrayList.subList(1, arrayList.size()-2));

        System.out.println(arrayList);
    }
}
