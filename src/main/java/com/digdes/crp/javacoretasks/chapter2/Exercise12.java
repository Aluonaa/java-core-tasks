package com.digdes.crp.javacoretasks.chapter2;

public class Exercise12 {
    /** Создайте исходный файл HelloWorld.java , где класс HelloWorld
    объявляется в пакете chOl.secOl. Разметите его в каком-нибудь каталоге,
    но только не в подкаталоге chOl/secOl. Выполните из этого каталога команду javac
    HelloWorld.java. Получите ли вы в итоге файл класса и где именно? Затем
    выполните команду javaHelloWorld. Что при этом произойдет?


     Решение:
      java HelloWorld
      Error: Could not find or load main class HelloWorld
      Caused by: java.lang.NoClassDefFoundError: chOl/secOl/HelloWorld (wrong name: HelloWorld)

      javap HelloWorld
      Warning: File .\HelloWorld.class does not contain class HelloWorld
      Compiled from "HelloWorld.java"
      public class chOl.secOl.HelloWorld {
      public chOl.secOl.HelloWorld();
      public static void main(java.lang.String...);**/
}
