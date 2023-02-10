package main.java.ru.furiosaming.javacoretasks.chapter6;

import java.util.Arrays;
import java.util.function.IntFunction;

public class Exercise18 {

    /** Рассмотрите следующий метод, представленный в разделе 6.6.3:
    public static <Т> Т[] repeat(int n, Т obj, IntFunction<T[]> constr)
    Почему исход вызова Arrays.repeat(10, 42, int[]::new)
    окажется неудачным? Как устранить этот недостаток?
    Что нужно сделать для применения других примитивных типов?

    Решение: Универсальные шаблоны в Java представляют собой полностью
    конструкцию времени компиляции - компилятор превращает все универсальные
    использования в приведения к правильному типу. Это необходимо для
    поддержания обратной совместимости с предыдущими средами выполнения JVM.
    все, что используется в качестве универсальных шаблонов, должно быть
    конвертируемым в Object, а примитивные
    типы — нет. Поэтому они не могут быть использованы в дженериках.
    Для них можно использовать обертки, как показано ниже**/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(repeat(10, 42, Integer[]::new)));
    }

    public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
        T[] result = constr.apply(n);
        for (int i = 0; i < n; i++) result[i] = obj;
        return result;
    }
}
