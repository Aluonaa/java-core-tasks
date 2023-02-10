package main.java.ru.furiosaming.javacoretasks.chapter10;

public class Exercise23 {
    /** Найдите ошибку в следующем фрагменте кода:
    public class Stack {
        public void push(Object newValue) {
            synchronized (new ReentrantLock()) {
            }
        }
    }
     Решение: в блок synchronized незачем передавать блокировку, так
     как эту функцию берет на себя сам synchronized **/
}
