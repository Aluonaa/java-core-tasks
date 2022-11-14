package com.digdes.crp.javacoretasks.chapter3;

import java.util.*;

public class Exercise14 {
    /**Организуйте вызов метода Arrays.sort(), сортирующего работников
    сначала по зарплате, а затем по имени. Воспользуйтесь для этой цели методом
    Comparator.thenComparing(). Затем организуйте сортировку в обратном порядке. **/

    public static void main(String[] args) {
        Employee employee = new Employee("Oleg", 120000);
        Employee employee1 = new Employee("Ivan", 119000);
        Employee employee2 = new Employee("Olga", 230000);
        Employee employee3 = new Employee("Masha", 120000);
        Employee employee4 = new Employee("Petr", 119000);
        Employee employee5 = new Employee("Ksenya", 230000);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        Collections.sort(employeeList, Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
        for(Employee emp: employeeList){
            System.out.println(emp.getName());
        }
    }

}
