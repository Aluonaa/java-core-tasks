package com.digdes.crp.javacoretasks.chapter7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        List<String> listString = new ArrayList<>();
        System.out.println("Задание 7.2. Введите строку");
        //Это просто для ввода нескольких строк, можно было вообще их в коде задать
        for(int i = 0; i<3; i++) {
            listString.add(scanner.next());
        }

        // Метод 1
        ListIterator<String> iterator = listString.listIterator();
        while (iterator.hasNext()){
            iterator.set(iterator.next().toUpperCase());
        }

        // Метод 2
        for(int i = 0; i<listString.size(); i++){
            String s = listString.get(i);
            listString.set(i, s.replace(s, s.toUpperCase()));
        }

        // Метод 3
        listString.replaceAll(String::toUpperCase);


        //Вывод результата
        System.out.println(listString);
    }
}
