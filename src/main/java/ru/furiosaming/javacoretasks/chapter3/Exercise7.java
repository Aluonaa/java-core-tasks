package main.java.ru.furiosaming.javacoretasks.chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Exercise7 {
    /** Реализуйте метод void luckySort(ArrayList<String> strings, Comparator
    <String> comp), вызывающий метод Collections.shuffle() для списочного
    массива до тех пор, пока элементы этого массива располагаются в возрастающем порядке, задаваемом компаратором. **/

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("fg");
        strings.add("j");
        System.out.println(strings);
        luckySort(strings, Comparator.comparing(String::length));
        System.out.println(strings);
    }

    static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (true) {
            Collections.shuffle(strings);
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i + 1), strings.get(i)) < 0) {
                    return;
                }
            }
        }
    }
}

