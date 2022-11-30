package com.digdes.crp.javacoretasks.chapter6;


/** 6.2 **/

public class Stack2 <E> {
    E[] mass;
// ЕЩЕ В ПРОЦЕССЕ РАБОТЫ
    public Stack2(E[] mass){
        this.mass = mass;
    }

    public E[] getMass() {
        return mass;
    }

    public void setMass(E[] mass) {
        this.mass = mass;
    }

    public void push(E element){
//        E[] mass2 = (E[]) new Object();
//        mass2[] = mass.clone();

        mass[mass.length-1] = element;
    }

//    public void push(Object element){
//
//    }
}
