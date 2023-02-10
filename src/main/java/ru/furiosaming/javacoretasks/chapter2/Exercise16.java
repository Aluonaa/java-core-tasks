package main.java.ru.furiosaming.javacoretasks.chapter2;


public class Exercise16 {

    /** Реализуйте в классе Queue неограниченную очередь символьных строк.
    Предоставьте метод add () для ввода элемента в хвост очереди и метод remove ()
    для удаления элемента из головы очереди. Организуйте хранение элементов
    в виде связного списка узлов, создав вложенный класс Node. Должен ли этот
    класс быть статическим

    Решение: внутренний класс отличается от статического вложенного класса тем, что
    у каждого объекта внутреннего класса имеется ссылка на объект объемлющего его
    класса. В данном случае она не нужна, по существу, этот вложенный класс  мало чем отличается от класса
    объявляемого за пределами любого другого класса. Вложение класса
     лишь делает очевидным тот факт, что класс Node представляет узел в очереди**/
    public static void main(String[] args) {
        Queue queue = new Queue()
                .add("hello1")
                .add("hello2")
                .add("hello3")
                .add("hello4")
                .add("hello5")
                .add("hello6")
                .add("hello7");

        printQueue(queue);

    }

    private static void printQueue(Queue q) {
        for (Queue.Node node = q.first; node != null; node = node.next) {
            System.out.print(node.item + " ");
        }
        System.out.println();
    }

}

