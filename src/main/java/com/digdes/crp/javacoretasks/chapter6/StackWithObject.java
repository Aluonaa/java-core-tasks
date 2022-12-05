package com.digdes.crp.javacoretasks.chapter6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StackWithObject<E> {

    Object[] mass;

    public StackWithObject(Object[] mass){
        this.mass = mass;
    }

    public Object[] getMass() {
        return mass;
    }

    public void setMass(Object[] mass) {
        this.mass = mass;
    }

    public void push(Object element){
        ArrayList<Object> list = new ArrayList<>(java.util.Arrays.asList(mass));
        list.add(element);
        mass = list.toArray();
    }

    public Object pop(){
        Object returnValue = mass[0];
        List<Object> list = java.util.Arrays.asList(mass);
        list = list.subList(1, list.size());
        mass = list.toArray();
        return returnValue;
    }

    @Override
    public String toString() {
        return "StackWithObject{" +
                "mass=" + Arrays.toString(mass) +
                '}';
    }
}

