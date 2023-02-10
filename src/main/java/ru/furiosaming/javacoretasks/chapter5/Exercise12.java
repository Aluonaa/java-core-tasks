package main.java.ru.furiosaming.javacoretasks.chapter5;

import java.util.Arrays;
import java.util.Random;

public class Exercise12 {

    /** Напишите метод int min(int[] values), в котором перед
    возвратом наименьшего значения утверждается, что оно действительно не
    больше всех остальных значений в массиве. Воспользуйтесь вспомогательным
    методом или же методом Stream.allMatch(), если вы уже
    просматривали материал главы 8. Организуйте повторный вызов
    данного метода для обработки крупного массива и
    определите время выполнения кода при разрешении, запрете и исключении
    утверждений. **/
    private static final int ITERATIONS = 10000;

    public static void main(String[] args) {

        int[] values = generateArray(500);
        int counter = 0;

        long start = System.currentTimeMillis();
        for (int i = 0; i < ITERATIONS; i++) {
            try {
                min(values);
                counter++;
            } catch (Throwable e) {e.printStackTrace();}
        }
        System.out.println("" + (System.currentTimeMillis() - start));
    }

    private static int min(int[] values) {
        final int result = Arrays.stream(values).min().getAsInt();

        assert Arrays.stream(values).allMatch(v -> v >= result) : String.format("%s это не минимум", result);

        return result;
    }

    private static int[] generateArray(int length) {
        Random r = new Random();
        int[] values = new int[length];
        for (int i = 0; i < length; i++) {
            values[i] = r.nextInt();
        }
        return values;
    }
}
