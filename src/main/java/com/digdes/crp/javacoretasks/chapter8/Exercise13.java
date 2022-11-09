package com.digdes.crp.javacoretasks.chapter8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Stream;

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

       Stream<ArrayList<Integer>> arrayListStream = Stream.of(list);

       // для Stream<ArrayList<Integer>>
       Optional<Integer> result1 = arrayListStream.flatMap(Collection::stream).reduce(Integer::sum);
//       int result2 = arrayListStream.flatMap(Collection::stream).reduce(0, Integer::sum);
//       int result3 = arrayListStream.flatMap(Collection::stream).reduce(0, (x,y)-> x+y,(x, y)->x+y);

       System.out.println(result1.get());
//       System.out.println(result2);
//       System.out.println(result3);

       // для ArrayList<Integer>
       Optional<Integer> result4 = list.stream().reduce(Integer::sum);
       int result5 = list.stream().reduce(0, Integer::sum);
       int result6 = list.stream().reduce(0, (x,y)-> x+y,(x, y)->x+y);


       System.out.println(result4.get());
       System.out.println(result5);
       System.out.println(result6);

   }



}
