package com.digdes.crp.javacoretasks.chapter6;

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello1");
        arrayList.add("Hello2");
        arrayList.add("Hello3");
        arrayList.add("Hello4");
        arrayList.add("Hello5");
        Stack<String> stringStack = new Stack<String>(arrayList);
        System.out.println(stringStack.isEmpty());
        System.out.println(stringStack.pop());
        stringStack.push("Hello0");

        System.out.println(stringStack);
    }
}
