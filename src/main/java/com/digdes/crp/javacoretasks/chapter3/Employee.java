package com.digdes.crp.javacoretasks.chapter3;


import java.io.Serializable;

public class Employee implements Measurable, Serializable {

    static final long SerialVersionUID = 1;
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
        averageSalary = averageSalary / objects.length;
        return averageSalary;
    }

    @Override
    public double getMeasure() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
