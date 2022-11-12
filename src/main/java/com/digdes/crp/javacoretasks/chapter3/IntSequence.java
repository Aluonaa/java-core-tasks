package com.digdes.crp.javacoretasks.chapter3;

import java.util.function.IntSupplier;

public interface IntSequence {


    static int[] of(int... values){
        int[] mass = new int[values.length];
        System.arraycopy(values, 0, mass, 0, values.length);
        return mass;
    }

    static IntSupplier constant(int i){
        return new IntSupplier() {
            @Override
            public int getAsInt() {
                return i;
            }
        };
    }

    static IntSupplier constantWithLambda(int i){
        return () -> i;
    }

}
