package main.java.ru.furiosaming.javacoretasks.chapter10;

public class Exercise19 {
    /** Рассмотрите следующую реализацию стека:
    public class Stack {
        class Node { Object value; Node next; };
        private Node top;
        public void push(Object newValue) {
            Node n = new Node();
            n.value = newValue;
            n.next = top;
            top = n;
        }
        public Object pop() {
            if (top == null) return null;
            Node n = top;
            top = n.next;
            return n.value;
        }
    }
    Опишите два разных пути, приводящих к тому, что данная структура данных
    может содержать неверные элементы

    Решение: тут те же самые проблемы, что и в упражнении 21 (и 20)
    1. Состояние гонок. Возникает в любых общих переменных, которые
     изменяются в ходе параллельных вычислений. Например, код для постановки
     значения в голову очереди может выглядеть следующим образом:
     NoFde n = new Node();
     if (head == null) head = n;
     else tail.next = n;
     tail = n;
     tail.value = newValue;
     Если выполнение сложной последовательности инструкций приостановится
     в самый неподходящий момент и другая задача получит управление для доступа
     к очереди, когда она находится в неустойчивом состояния, то многое может пойти не так,
     как предполагалось

     Также при работе нескольких потоков при попытке получить данные может возникнуть проблема в связи с
     особенностями работы оперативной памяти, а также кешированием значений. Говоря простым языком:
     у одного из потока может не быть доступа к верным значениям.

     А теперь допустим, что метод remove() требуется превратить в метод take(),
     который блокируется, если очередь пуста. Проверка на пустоту должна непременно
     присутствовать в теле синхронизированного метода, как показано ниже. В противном
     случае она не имеет смысла, поскольку очередь может быть тем временем опустошена.
     public synchronized Object take() {
     if (head == null) ... / / А теперь что?
     Node n = head;
     head = n.next;
     return n.value;
     }
     Но что произойдет, если очередь окажется пустой? Ни в одном другом потоке
     исполнения нельзя будет ввести элементы до тех пор, пока в текущем потоке
     исполнения удерживается блокировка. Именно здесь и требуется метод wait().
     Если оказывается, что выполнение метода take() не может быть продолжено,
     то в нем вызывается метод wait(), как показано ниже.
     public synchronized Object take() throws InterruptedException {
     while (head == null) wait();
     }
     Текущий поток исполнения теперь деактивизируется, отдавая блокировку.
     Благодаря этому в другом потоке исполнения появляется возможность вводить элементы
     в очередь. Это так называемое ожидание по условию.**/
}
