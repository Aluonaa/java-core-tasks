package main.java.ru.furiosaming.javacoretasks.chapter3;

import java.io.Serializable;
import java.util.Comparator;
import java.util.stream.Stream;

public class Employee implements Measurable, Serializable{

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
        return averageSalary / objects.length;
    }

    public static Measurable largest (Measurable[]objects){
        return Stream.of(objects).max(Comparator.comparing(Measurable::getMeasure)).orElse(null);
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
