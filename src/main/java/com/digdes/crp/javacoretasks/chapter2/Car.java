package com.digdes.crp.javacoretasks.chapter2;

import static java.lang.System.out;

/**
 * теперь можно воспользоваться статическими методами и переменными из класса
 * System, не указывая имя этого класса в качестве префикса.
 **/

public class Car {

    /** 2.9 **/
    /** 2.11 **/
    private int distance; // Расстояние
    private int fuelTank; // Топливный бак
    private int fuelСonsumption; //Потребление топлива

    public Car(int fuelСonsumption) {
        this.fuelСonsumption = fuelСonsumption;
        fuelTank = 0;
        distance = 0;
    }

    public void ride(int kilometers) {
        if(fuelСonsumption * kilometers > fuelTank) { // проверка на то, хватит ли бензина на необходимый путь
            distance += fuelTank / fuelСonsumption;
            fuelTank = 0;
            out.println("Для дальнейшей поездки ваше корыто необходимо заправить");
        }
        else {
            distance += kilometers;
            fuelTank = fuelTank - fuelСonsumption * kilometers;
            /**Из-за статического импорта System теперь можно не указывать**/
            out.println("Поздравляю, вы доехали!");
        }
    }

    public void refueling(int liters) {
        fuelTank += liters;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "distance=" + distance +
                ", fuelTank=" + fuelTank +
                ", fuelСonsumption=" + fuelСonsumption +
                '}';
        }
    }
