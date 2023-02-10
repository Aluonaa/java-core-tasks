package main.java.ru.furiosaming.javacoretasks.chapter6;

public class Exercise5 {
    /** Рассмотрите следующий вариант метода swap (), где массив может быть предоставлен с помощью аргументов переменной длины:
    public static <Т> Т[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values [j];
        values[j] = temp;
        return values; }
        А теперь рассмотрите следующий вызов:
        Double[] result = Arrays.swap(0, 1, 1.5, 2, 3);
        Какое сообщение об ошибке вы получите? Далее сделайте такой вызов:
        Double[] result = Arrays.<Double>swap(0, 1, 1.5, 2, 3);
        Изменилось ли к лучшему сообщение об ошибке? Что нужно сделать для
        устранения ошибки


        Решение: в первом случае: no instance(s) of type variable(s) exist so that Integer conforms to Double
        Второй случай: Error java:
        method swap cannot be applied to given types;
        required: int,int,T[]
        found: int,int,double,int,int
        reason: varargs mismatch; int cannot be converted to java.lang.Double**/

    public static void main(String[] args) {
        Number[] result = swap(0, 1, 1.5, 2, 3);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

    @SafeVarargs
    public static <T> T[] swap(int i, int j, T... values) {
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }
}
