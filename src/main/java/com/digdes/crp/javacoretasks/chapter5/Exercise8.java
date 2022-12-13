package com.digdes.crp.javacoretasks.chapter5;

import java.util.concurrent.locks.ReentrantLock;

public class Exercise8 {
    /** Разработайте вспомогательный метод, чтобы воспользоваться классом
    ReentrantLock в операторе try с ресурсами. Вызовите метод lоск()
    и возвратите объект класса, который реализует интерфейс AutoCloseable и в методе
    которого close() вызывается метод unlock(), но не генерируется никаких исключений. **/

    public static void main(String[] args) {
        try (ClosableClass lock = getLock()) {
        }
    }

    private static ClosableClass getLock() {
        ClosableClass closableClass = new ClosableClass(new ReentrantLock());
        closableClass.lock();
        return closableClass;
    }

    private static class ClosableClass implements AutoCloseable{
        private ReentrantLock lock;

        ClosableClass(ReentrantLock lock) {
            this.lock = lock;
        }

        @Override
        public void close() {
            try {
                lock.unlock();
                System.out.println("unlock");
            } catch (Exception ignored) {
            }
        }

        void lock(){
            lock.lock();
            System.out.println("lock");
        }

    }

}
