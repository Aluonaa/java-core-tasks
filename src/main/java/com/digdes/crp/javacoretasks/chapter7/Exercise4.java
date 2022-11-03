package com.digdes.crp.javacoretasks.chapter7;

public class Exercise4 {
    public static void main(String[] args){
        System.out.println("Воспроизведите ситуацию, когда возникает исключение типа ConcurrentModificationException.\n" +
                "\n" +
                "//        Ответ: Если для обхода структуры данных имеется несколько итераторов и один из них изменяет ее,\n" +
                "//        то другой может стать недействительным. Если же и дальше пользоваться недействительным\n" +
                "//        итератором, он может сгенерировать исключение типа ConcurrentModificationException");
    }
}
