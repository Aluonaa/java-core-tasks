package com.digdes.crp.javacoretasks.chapter6;

public class Exercise19 {
    /** Рассмотрите следующий метод, представленный в разделе 6.6.3:
    public static <Т> ArrayList<T> repeat(int n, T obj)
    Этот метод без особых хлопот составляет списочный массив типа ArrayList<T>
    из элементов обобщенного типа Т. Можно ли получить массив типа Т[] из
    этого списочного массива, не пользуясь объектом типа Class или ссылкой на
    конструктор? Если нельзя, то почему?

    Решение: Обобщенные типы нельзя употреблять в таких выражениях, как, например, new
     Т(...) или new Т[...]. Подобные формы запрещены, поскольку они не воплощают
     того, что намеревается сделать программист, когда стирается обобщенный тип Т.
     Если нужно получить обобщенный экземпляр или массив, то для этого придется
     больше потрудиться. Допустим, что требуется предоставить метод repeat(), чтобы в
     результате вызова Arrays.repeat(n, obj) был создан массив, содержащий п копий
     объекта obj. Разумеется, тип элементов такого массива должен быть таким же, как и
     тип объекта obj. Следующая попытка написать метод repeat() не пройдет.


     public static <T> T[] repeat(int n, T obj) {
     T [] result = new T[n]; // ОШИБКА: построить массив new T[...] нельзя!
     for (int i = 0; i < n; i++) result[i] = obj;
     return result;
     }

     В качестве выхода из этого положения у вызывающего кода можно запросить конструктор
     массивов в виде ссылки на метод, как выделено ниже полужирным.
     String[] greetings = Arrays.repeat(10, "Hi", String[]::new);

     **/
    public static void main(String[] args) {

    }
}
