package com.digdes.crp.javacoretasks.chapter3;

import java.util.Iterator;

public class DigitSequence implements Iterator<Integer> {

    private int value = 0;

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return value++;
    }

    public void remove() {
    }
}
