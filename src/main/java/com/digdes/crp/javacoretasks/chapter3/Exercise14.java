package com.digdes.crp.javacoretasks.chapter3;

import java.util.*;

public class Exercise14 {
    /**Организуйте вызов метода Arrays.sort(), сортирующего работников
    сначала по зарплате, а затем по имени. Воспользуйтесь для этой цели методом
    Comparator.thenComparing(). Затем организуйте сортировку в обратном порядке. **/

    public static void main(String[] args) {
        Employee employee = new Employee("Oleg", 12);
        Employee employee1 = new Employee("Ivan", 119);
        Employee employee2 = new Employee("Olga", 230000);
        Employee employee3 = new Employee("Masha", 12);
        Employee employee4 = new Employee("Petr", 119);
        Employee employee5 = new Employee("Ksenya", 230000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        for(Employee emp: employeeList){
            System.out.println(emp.getName());
        }
        System.out.println("\nОбратный порядок: \n");
        employeeList.sort(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName).reversed());
        for(Employee emp: employeeList){
            System.out.println(emp.getName());
        }
    }

}
