package com.digdes.crp.javacoretasks.chapter6;

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
        устранения ошибки **/

    public static void main(String[] args) {
        Number[] result = swap(0, 1, 1.5, 2, 3);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
        //Double[] result2 = Exercise5.<Double>swap(0, 1, 1.5, 2, 3);
    }
    @SafeVarargs
    public static <Т, K> Т[] swap(int i, int j, K... values) {
        K temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return (Т[]) values;
    }
}
