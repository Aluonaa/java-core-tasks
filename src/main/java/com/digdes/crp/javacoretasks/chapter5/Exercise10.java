package com.digdes.crp.javacoretasks.chapter5;

public class Exercise10 {

    /** Напишите рекурсивный метод factorial(), выводящий все кадры стека перед
    возвратом значения. Постройте (но не генерируйте) объект исключения любого типа
    и получите результат трассировки его стека, как пояснялось в разделе 5.1.8. **/

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    private static int factorial(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Введите значение больше нуля");
        } else if (i <= 1) {
            return 1;
        }
        new Throwable().printStackTrace();
        return i * factorial(i - 1);
    }
}