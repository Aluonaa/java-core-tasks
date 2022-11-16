package com.digdes.crp.javacoretasks.chapter6;

import java.util.ArrayList;

public class Exercise6 {
    /** Реализуйте обобщенный метод, присоединяющий все элементы из одного
    списочного массива к другому. Воспользуйтесь метасимволом подстановки для
    обозначения одного из аргументов типа. Предоставьте два равнозначных решения:
     одно с подстановочным типом ? extends Е, другое — с подстановочным
    типом ? super Е. **/

    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        System.out.println(copyExtends(numbers1));
        System.out.println(copySuper(numbers1));
    }
    public static ArrayList<? extends Number> copyExtends(ArrayList<? extends Integer> numbers1){
        return new ArrayList<Integer>(numbers1);
    }

    public static ArrayList<? super Number> copySuper(ArrayList<? super Integer> numbers1){
        return new ArrayList<>(numbers1);
    }


}
