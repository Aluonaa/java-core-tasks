package main.java.ru.furiosaming.javacoretasks.chapter6;

import java.util.ArrayList;

public class Exercise1 {
    /** Реализуйте обобщенный класс Stack<E>, управляющий списочным массивом,
    состоящим из элементов типа Е. Предоставьте методы push(), рор() и
    isEmpty() **/
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello1");
        arrayList.add("Hello2");
        arrayList.add("Hello3");
        arrayList.add("Hello4");
        arrayList.add("Hello5");
        Stack<String> stringStack = new Stack<>(arrayList);
        System.out.println(stringStack.isEmpty());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        System.out.println(stringStack.pop());
        stringStack.push("Hello0");

        System.out.println(stringStack);
    }
}
