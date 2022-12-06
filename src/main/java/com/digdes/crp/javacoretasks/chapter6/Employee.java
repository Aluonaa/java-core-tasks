package com.digdes.crp.javacoretasks.chapter6;


public class Employee implements Comparable<Employee> {

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

    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }
}