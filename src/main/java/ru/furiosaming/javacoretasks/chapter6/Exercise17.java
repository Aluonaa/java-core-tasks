package main.java.ru.furiosaming.javacoretasks.chapter6;

public class Exercise17 {
    /** Определите класс Em p lo ye e , реализующий
     * интерфейс C o m p a ra b le < E m p lo y e e > .
    Используя утилиту javap, продемонстрируйте, что
     мостовой метод был синтезирован. Каково его назначение?

     Решение:
     Compiled from "Employee.java"
     public class com.digdes.crp.javacoretasks.chapter6.Employee implements java.lang.Comparable<com.digdes.crp.javacoretasks.chapter6.Employee> {
     java.lang.String name;
     double salary;
     public com.digdes.crp.javacoretasks.chapter6.Employee(java.lang.String, double);
     public double getSalary();
     public java.lang.String getName();
     public int compareTo(com.digdes.crp.javacoretasks.chapter6.Employee);  // Этот метод определен в коде
     public int compareTo(java.lang.Object); // А этот мостовой метод синтезируется компилятором

     мостовой метод синтезируется для поддержки механизма динамического поиска
     методов. Он вызывает первый метод.
     }**/

    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 50000);
    }

}
