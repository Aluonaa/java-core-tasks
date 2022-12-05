package com.digdes.crp.javacoretasks.chapter6;

import java.util.*;
import java.util.Arrays;

/** 6.2 **/

public class StackWithMassOfE<E> {
    E[] mass;

    public StackWithMassOfE(E[] mass){
        this.mass = mass;
    }

    public E[] getMass() {
        return mass;
    }

    public void setMass(E[] mass) {
        this.mass = mass;
    }

    public void push(E element){
        ArrayList<E> list = new ArrayList<>(Arrays.asList(mass));
        list.add(element);
        mass = (E[]) list.toArray();
    }

    public E pop(){
        E returnValue = mass[0];
        List<E> list = Arrays.asList(mass);
        list = list.subList(1, list.size());
        mass = (E[]) list.toArray();
        return returnValue;
    }

    @Override
    public String toString() {
        return "StackWithMassOfE{" +
                "mass=" + Arrays.toString(mass) +
                '}';
    }
}
