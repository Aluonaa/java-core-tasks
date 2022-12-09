package com.digdes.crp.javacoretasks.chapter3;

import java.util.Iterator;
import java.util.stream.Stream;

public class Exercise6 {
    /** В этом упражнении вам предстоит выяснить, что произойдет, если ввести
    метод в интерфейс. В версии Java 7 создайте класс DigitSequence,
    реализующий интерфейс Iterator<Integer>, а не IntSequence.
    Предоставьте методы hasNext(), next() и ничего не делающий метод remove().
    Напишите программу, выводящую элементы интерфейса. В версии Java 8 интерфейс Iterator был
    дополнен методом forEachRemaining(). Будет ли ваш код по-прежнему компилироваться
    при переходе к версии Java 8? **/

    public static void main(String[] args) {
        Iterator<Integer> sequence = new DigitSequence();
        print(sequence, 10);
        sequence.remove();
    }

    private static void print(Iterator<Integer> sequence, int limit) {
        Stream.generate(sequence::next).limit(limit).forEach(System.out::print);
        System.out.println();
    }
}

