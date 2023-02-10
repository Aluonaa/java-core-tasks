package main.java.ru.furiosaming.javacoretasks.chapter8;

import java.util.ArrayList;
import java.util.Optional;

public class Exercise13 {
   /** Соедините все элементы в потоках данных Stream <ArrayList <T>> и ArrayList <T>.
    Покажите, как добиться этого с помощью каждой из трех форм метода reduce(). **/

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);

       Optional<Integer> result4 = list.stream().reduce(Integer::sum);
       int result5 = list.stream().reduce(0, Integer::sum);
       int result6 = list.stream().reduce(0, (x,y)-> x+y,(x, y)->x+y); // лямбда вместо ссылки на метод по заданию

       result4.ifPresent(System.out::println);
       System.out.println(result5);
       System.out.println(result6);

   }



}
