package com.digdes.crp.javacoretasks.chapter6;

import com.digdes.crp.javacoretasks.chapter3.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise13 {
    /** С учетом метода из предыдущего упражнения рассмотрите следующий метод:
    public static <Т> void maxmin(List<T> elements,
                                  Comparator<? super T> comp, List<? super T> result) {
        minmax(elements, comp, result);
    }
    Почему этот метод нельзя скомпилировать без захвата подстановки? Подсказка:
    попробуйте предоставить явный тип Lists.<____>swapHelper(result, 0, 1).

     Решение: метасимвол подстановки ? можно применять как
     аргумент типа, но не как тип. Но это ограничение можно обойти, введя вспомогательный метод
     Вызов метода minmax() оказывается достоверным благодаря специальному
     правилу, называемому захватом подстановки. Компилятору неизвестно, что именно обозначает
     метасимвол подстановки ?, но ведь он обозначает какой-то тип, и
     поэтому вполне допустимо вызвать обобщенный метод. Параметр типа Т в методе
     minmax() "захватывает" подстановочный тип. А поскольку метод minmax()
     является обобщенным, а не обычным методом, объявляемым с метасимволами подстановки типов его
     параметров, то переменную типа Т можно использовать для объявления других переменных.**/

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee = new Employee("Oleg", 120000);
        Employee employee1 = new Employee("Ivan", 119000);
        Employee employee2 = new Employee("Olga", 230000);
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        List<Employee> resultEmployeeList = new ArrayList<>();
        maxmin(employeeList, Comparator.comparing(Employee::getSalary), resultEmployeeList);
    }

    public static <T> void maxmin(List<T> elements,
                                  Comparator<? super T> comp, List<? super T> result) {
        minmax(elements, comp, result);
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
