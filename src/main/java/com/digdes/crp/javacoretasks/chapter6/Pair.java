package com.digdes.crp.javacoretasks.chapter6;

public class Pair<E extends Number> {

    private final E first;
    private final E second;


    public Pair(E first, E second){
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public E max(){
        return first.doubleValue() >= second.doubleValue() ? first : second;
    }

    public E min(){
        return first.doubleValue() <= second.doubleValue() ? first : second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
