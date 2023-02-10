package main.java.ru.furiosaming.javacoretasks.chapter3;

import java.util.Random;

public class RandomSequence implements IntSequence {
    private final static Random generator = new Random();
    int low;
    int high;

    public RandomSequence(int low, int high){
        this.low = low;
        this.high = high;
    }

    public int next() { return low + generator.nextInt(high - low +1); }
}
