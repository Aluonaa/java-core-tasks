package com.digdes.crp.javacoretasks.chapter6;

import com.digdes.crp.javacoretasks.chapter3.Employee;

import java.util.*;

public class Exercise12 {
    /** Реализуйте следующий метод, сохраняющий наименьший и наибольший элементы
    из массива elements в списке result:
    public static <Т> void minmax(List<T> elements,
    Comparator<? super T> comp, List<? super T> result)
    Обратите внимание на подстановочный тип в последнем параметре.
   Для хранения полученного результата подойдет любой супертип обобщенного типа **/

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee("Oleg", 120000);
        Employee employee1 = new Employee("Ivan", 119000);
        Employee employee2 = new Employee("Olga", 230000);
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        List<Employee> resultEmployeeList = new ArrayList<>();
        minmax(employeeList, Comparator.comparing(Employee::getSalary), resultEmployeeList);
    }

    public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result){
        Employee max = (Employee) Collections.max(elements, comp);
        Employee min = (Employee) Collections.min(elements, comp);
        result.add((T) max);
        result.add((T) min);

        System.out.println(result.get(0).toString());
        System.out.println(result.get(1).toString());
    }
}
