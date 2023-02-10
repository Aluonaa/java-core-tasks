package main.java.ru.furiosaming.javacoretasks.chapter2;

public class Exercise17 {
    /** Предоставьте итератор — объект, извлекающий по порядку элементы очереди
    из предыдущего упражнения. Сделайте класс Iterator вложенным и определите в
    нем методы next () и hasNext (). Определите в классе Queue метод
    iterator(), возвращающий ссылку на объект Queue.Iterator.
    Должен ли внутренний класс Iterator быть статическим? нет **/

    public static void main(String[] args) {
        Queue queue = new Queue()
                .add("hello1")
                .add("hello2")
                .add("hello3")
                .add("hello4")
                .add("hello5");
        queue.printQueue();

    }



}
