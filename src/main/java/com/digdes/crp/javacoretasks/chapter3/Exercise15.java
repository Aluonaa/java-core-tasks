package com.digdes.crp.javacoretasks.chapter3;

import java.util.Random;

public class Exercise15 {
    /** Реализуйте локальный класс RandomSequence , упоминавшийся в разделе 3.9.1,
    как вложенный класс за пределами метода randomInts(). **/

    private final static Random generator = new Random();

    public static void main(String[] args) {

        RandomSequence randomSequence = randomlnts(1, 15);
        for(int i = 0; i<9; i++){
            System.out.println(randomSequence.next());
        }

    }
    public static RandomSequence randomlnts(int low, int high) {
        return new RandomSequence(low, high);
    }
    static class RandomSequence implements IntSequence {
        int low;
        int high;

        public RandomSequence(int low, int high){
            this.low = low;
            this.high = high;
        }

        public int next() { return low + generator.nextInt(high - low +1); }
    }
}
