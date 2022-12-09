package com.digdes.crp.javacoretasks.chapter4;

import java.lang.reflect.Method;

public class Exercise13 {
    /** Напишите метод, выводящий таблицу значений из любого объекта типа Method,
    описывающего метод с параметром типа double или Double. Помимо
    объекта типа Method, этот метод должен принимать нижний и верхний предел,
    а также величину шага. Продемонстрируйте свой метод, выведя таблицы для
    методов Math.sqrt() и Double.toHexString(). **/

    public static void main(String[] args) throws Exception {
        print(Math.class.getMethod("sqrt", double.class), 1, 15, 0.45);
        print(Double.class.getMethod("toHexString", double.class), 1, 15, 0.45);
    }

    public static void print(Method method, double lowerBound, double upperBound, double counterStep) throws Exception {
        System.out.println(method.getDeclaringClass().getCanonicalName() + "." + method.getName());
        for (double i = lowerBound; i <= upperBound; i += counterStep) {
            System.out.println("Текущее значение:  " + i + "  Результат: " + method.invoke(null, i));
        }
    }
}

