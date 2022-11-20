package com.digdes.crp.javacoretasks.chapter3;

import java.util.Comparator;
import java.util.stream.Stream;

public class Exercise2 {
    /** Продолжите предыдущее упражнение, предоставив метод Measurable
    largest(Measurable[] objects). Воспользуйтесь им,
    чтобы выяснить имя работника с самой высокой зарплатой. Зачем требуется приведение типов?

     Решение:
     Неявное приведение типов
     Тип приведения, когда два типа данных автоматически конвертируются. Также известно как неявное
     преобразование. Происходит, когда два типа данных совместимы,
     а также когда мы присваиваем значение меньшего типа данных большему типу данных.
     Явное приведение типов
     В этом случае, если вы хотите присвоить значение большего типа
     данных меньшему типу данных, вы можете выполнить явное приведение или сужение типов.
     Это полезно для несовместимых типов данных, где автоматическое преобразование невозможно.
     **/
    public static void main(String[] args) {

        Employee employee = new Employee("Oleg", 100000);
        Employee employee1 = new Employee("Ivan", 110000);
        Employee employee2 = new Employee("Olga", 120000);
        Measurable[] employees = {employee, employee1, employee2};
        Employee maxSalary = (Employee) largest(employees);
        System.out.println(maxSalary.getName());
    }

        public static Measurable largest (Measurable[]objects){
            return Stream.of(objects).max(Comparator.comparing(Measurable::getMeasure)).orElse(null);
        }

}
