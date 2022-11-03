package com.digdes.crp.javacoretasks.chapter2;

public class Exercise9 {
    public static void main(String[] args){
        Car car = new Car(20);
        car.refueling(100);
        car.getFuelTank();
        car.ride(600);
        System.out.println(car.getDistance());
    }
}
