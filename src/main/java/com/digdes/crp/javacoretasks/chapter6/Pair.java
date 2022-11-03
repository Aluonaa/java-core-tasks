package com.digdes.crp.javacoretasks.chapter6;

//Реализуйте обобщенный класс Pair<E>, позволяющий сохранять пару элементов типа Е
//Предоставьте методы доступа для получения первого и второго элементов.

/** 6.7 **/


//Видоизмените класс из предыдущего упражнения, введя методы mах() и min()
//для получения наибольшего и наименьшего из двух элементов. Наложите
//соответствующее ограничение на обобщенный тип Е

/** 6.8 **/

public class Pair<E extends Number> {

    private E first;
    private E second;


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
        return super.toString();
    }
}
