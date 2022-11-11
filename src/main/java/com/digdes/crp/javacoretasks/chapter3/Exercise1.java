package com.digdes.crp.javacoretasks.chapter3;

public class Exercise1 {
    /** Предоставьте интерфейс Measurable с методом
    doublegetMeasure(), измеряющим объект
    определенным образом. Создайте класс Employee,
    реализующий интерфейс Measurable . Предоставьте
    метод double average(Measurable[] objects), вычисляющий среднюю меру.
    Воспользуйтесь им для расчета средней зарплаты в массиве работников. **/

    public static void main(String[] args) {
        Employee employee = new Employee("Oleg", 120000);
        Employee employee1 = new Employee("Ivan", 119000);
        Employee employee2 = new Employee("Olga", 230000);

        Measurable[] employees = {employee, employee1, employee2};
        System.out.println("Средняя зп: " + Employee.average(employees));

    }
}
