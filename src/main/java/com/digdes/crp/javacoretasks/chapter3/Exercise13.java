package com.digdes.crp.javacoretasks.chapter3;

public class Exercise13 {
    /** Напишите метод, принимающий массив экземпляров типа
    Runnable и возвращающий экземпляр типа Runnable ,
    метод которого run() выполняет их по порядку. Организуйте возврат лямбда-выражения. **/
    public static void main(String[] args) {
        Greeter greeterFirst = new Greeter(7, "Первый поток");
        Greeter greeterSecond = new Greeter(5, "Второй поток");
        Runnable[] runnableMass = new Runnable[2];
        runnableMass[0] = greeterFirst;
        runnableMass[1] = greeterSecond;
        System.out.println(runnable(runnableMass));
    }
    public static Runnable runnable(Runnable[] runnables){
        return () -> {for(Runnable runnable: runnables){
        runnable.run();}
        };
    }
}
