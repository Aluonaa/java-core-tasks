package main.java.ru.furiosaming.javacoretasks.chapter7;

import java.util.Collections;
import java.util.List;

public class Exercise18 {
    public static void main(String[] args){
        System.out.println("В классе Collections имеются статические константы EMPTY_LIST, EMPTY_MAP и\n" +
                "EMPTY_SET. Почему они не так полезны, как методы emptyList (), emptyMap () и\n" +
                "emptySet ()?" +
                "" +
                "Решение: Разница в них в том, что константы не являются безопасными в плане типов\n");

        List<String> b = Collections.emptyList();
        List a = Collections.EMPTY_LIST;
    }
}
