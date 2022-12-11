package com.digdes.crp.javacoretasks.chapter6;


public class Exercise2 {
    /** Еще раз реализуйте обобщенный класс Stack<E>, используя массив для хранения элементов.
    Если требуется, нарастите массив в методе push(). Предоставьте два решения этой задачи:
    одно — с массивом типа Е[], другое — с массивом
    типа Object[]. Оба решения должны компилироваться без всяких предупреждений.
    Какое из них вы предпочтете сами и почему

     я бы выбрала Object, т.к. с ним меньше проблем при приведении типов**/

    public static void main(String[] args) {
        String[] massOfString = new String[]{"a", "b", "c", "d", "e"};

        System.out.println("Stack with E mass: ");

        StackWithMassOfGenerics<String> stackWithMassOfGenerics = new StackWithMassOfGenerics<>(massOfString);
        stackWithMassOfGenerics.push("f");
        System.out.println(stackWithMassOfGenerics.toString());
        System.out.println(stackWithMassOfGenerics.pop());
        System.out.println(stackWithMassOfGenerics.toString());

        System.out.println("\nStack with Object: ");

        StackWithMassOfObject stringStackWithMassOfObject = new StackWithMassOfObject(massOfString);
        stringStackWithMassOfObject.push("z");
        System.out.println(stringStackWithMassOfObject.toString());
        System.out.println(stringStackWithMassOfObject.pop());
        System.out.println(stringStackWithMassOfObject.toString());


    }
}
