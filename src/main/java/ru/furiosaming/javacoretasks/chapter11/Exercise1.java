package main.java.ru.furiosaming.javacoretasks.chapter11;


public class Exercise1 {

    /** Поясните, каким образом можно изменить метод Object.clone(),
     * чтобы воспользоваться аннотацией @Cloneable вместо маркерного интерфейса Cloneable
     *
     *
     *
     Решение:

     Необходимо сначала создать аннотацию:
     @Target(value = ElementType.TYPE)
     @Retention(value = RetentionPolicy.RUNTIME)
     public @interface Cloneable {}

     Затем аннотировать класс:
     @Cloneable
     class Parent implements MyMark {}

     И в коде выполнить проверку:

     public static void cloneableAnnotation(Object object) {
     if (!object.getClass().isAnnotationPresent(Cloneable.class)) {
     throw new RuntimeException("Объект не аннотирован аннотацией 'Cloneable'");
     }
     System.out.println("Метод 'testAnnotation' успешно завершен!");
     }
     }

    Но так делать не нужно. Чтобы проверить, является ли object экземпляром интерфейса, можно использовать instanceof,
    что в настоящее время является относительно недорогой операцией. Использование аннотаций требует
    Java reflection вызовов и является гораздо более дорогостоящим. Кроме того, проверка наличия маркера
    (аннотации) проводится во время исполнения, а не во время компиляции, что чревато ошибками.**/

}
