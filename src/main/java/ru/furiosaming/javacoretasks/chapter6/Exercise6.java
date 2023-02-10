package main.java.ru.furiosaming.javacoretasks.chapter6;

import java.util.ArrayList;

public class Exercise6 {
    /** Реализуйте обобщенный метод, присоединяющий все элементы из одного
    списочного массива к другому. Воспользуйтесь метасимволом подстановки для
    обозначения одного из аргументов типа. Предоставьте два равнозначных решения:
     одно с подстановочным типом ? extends Е, другое — с подстановочным
    типом ? super Е. **/

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println(copyExtends(list1, list3));
        System.out.println(copySuper(list1, list2));
    }
    public static <T> ArrayList<? extends T> copyExtends(ArrayList<? extends T> list1, ArrayList<T> list3){
        list3.addAll(list1);
        return list1;
    }

    public static <T> ArrayList<? super T> copySuper(ArrayList<? super T> list2, ArrayList<T> list3){
        list2.addAll(list3);
        return list2;
    }


}
