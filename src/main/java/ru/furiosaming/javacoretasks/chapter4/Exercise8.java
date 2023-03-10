package main.java.ru.furiosaming.javacoretasks.chapter4;

import java.util.HashSet;
import java.util.Set;

public class Exercise8 {
    /** В классе Class имеются шесть методов, возвращающих строковое представление типа,
    описываемого объектом типа Class. Чем отличается их применение
    к массивам, обобщенным типам, внутренним классам и примитивным типам? **/
    public static void main(String[] args){
        System.out.println(void.class.getName());
        System.out.println(int.class.getName());
        System.out.println(double.class.getName());
        System.out.println(double[].class.getName());
        System.out.println(byte[].class.getName());
        System.out.println(boolean[].class.getName());
        System.out.println(String.class.getName());
        System.out.println(Object[].class.getName());
        System.out.println(int[][][][][][][].class.getName());
        System.out.println(Set.class.getName());
        System.out.println(Set.class);
        System.out.println(HashSet.class.getName());
        System.out.println(Rectangle.class.getName());
    }
}
