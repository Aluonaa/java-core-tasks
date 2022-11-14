package com.digdes.crp.javacoretasks.chapter3;

public class Exercise8 {
    /** Создайте класс Greeter, реализующий интерфейс Runnable , метод которого
    run() выводит п раз сообщение "Hello," + target, где n и target —
    параметры, устанавливаемые в конструкторе. Получите два экземпляра этого класса с
    разными сообщениями и выполните их параллельно в двух потоках. **/

    public static void main(String[] args) {
        Greeter greeterFirstThread = new Greeter(7, "Первый поток");
        Greeter greeterSecondThread = new Greeter(5, "Второй поток");

        ((Runnable) greeterFirstThread).run();
        ((Runnable) greeterSecondThread).run();

    }
}
