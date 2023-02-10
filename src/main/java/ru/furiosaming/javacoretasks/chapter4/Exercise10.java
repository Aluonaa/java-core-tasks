package main.java.ru.furiosaming.javacoretasks.chapter4;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Exercise10 {
    /** Воспользуйтесь примером кода из раздела 4.5.1 для перечисления
    всех методов из класса типа int[] **/
    public static void main(String[] args) {
        printMethods("[I");
    }

    public static void printMethods(String className) {
        Class<?> classForidentificationOfMethods = null;
        try {
            classForidentificationOfMethods = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        while (classForidentificationOfMethods != null) {
            for (Method m : classForidentificationOfMethods.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getCanonicalName()
                                + " " + m.getName() + Arrays.toString(m.getParameters()));
            }
            classForidentificationOfMethods = classForidentificationOfMethods.getSuperclass();
        }
    }
}