package main.java.ru.furiosaming.javacoretasks.chapter7;

import java.util.*;

public class Exercise2 {
   /** 2. Сделайте все буквы прописными в символьных строках, содержащихся в массиве.
    С этой целью воспользуйтесь сначала итератором, затем перебором индексных значений
    в цикле и, наконец, методом replaceAll (). **/

    public static void main(String[] args){
        List<String> listString = new ArrayList<>();
        listString.add("Dsffdh");
        listString.add("gjnyuthrg");
        listString.add("ghjhjhj");

        // Метод 1. Итератор
        ListIterator<String> iterator = listString.listIterator();
        while (iterator.hasNext()){
            iterator.set(iterator.next().toUpperCase());
        }
        System.out.println(listString);

        // Метод 2. Перебор индексных значений в цикле
        for(int i = 0; i<listString.size(); i++){
            String s = listString.get(i);
            listString.set(i, s.replace(s, s.toUpperCase()));
        }
        System.out.println(listString);

        // Метод 3. replaceAll()
        listString.replaceAll(String::toUpperCase);
        System.out.println(listString);
    }
}
