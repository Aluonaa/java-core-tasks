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

        StackWithMassOfE<String> stackWithMassOfE = new StackWithMassOfE<>(massOfString);
        stackWithMassOfE.push("f");
        System.out.println(stackWithMassOfE.toString());
        System.out.println(stackWithMassOfE.pop());
        System.out.println(stackWithMassOfE.toString());

        System.out.println("");
        System.out.println("Stack with Object: ");

        StackWithObject<String> stringStackWithObject = new StackWithObject<>(massOfString);
        stringStackWithObject.push("f");
        System.out.println(stringStackWithObject.toString());
        System.out.println(stringStackWithObject.pop());
        System.out.println(stringStackWithObject.toString());


    }
}
