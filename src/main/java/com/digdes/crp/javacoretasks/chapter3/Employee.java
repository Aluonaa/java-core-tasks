package com.digdes.crp.javacoretasks.chapter3;


public class Employee implements Measurable{

    String name;
    double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double average(Measurable[] objects){
        double averageSalary = 0.0;
        for(Measurable object: objects){
            averageSalary += object.getMeasure();
        }
        return averageSalary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }
}
