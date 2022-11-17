package com.digdes.crp.javacoretasks.chapter9;

import com.digdes.crp.javacoretasks.chapter3.Employee;

import java.io.*;

public class Exercise13 {
    /** Реализуйте метод для получения клона любого объекта сериализируемого
     * сначала в массив байтов и затем десериализируемого оттуда **/

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100000);
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\Strelets.A\\Desktop\\javaTasks\\Serialization.bin")))
        {
            objectOutputStream.writeObject(emp1);
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("C:\\Users\\Strelets.A\\Desktop\\javaTasks\\Serialization.bin")))
        {
            Employee newEmployee = (Employee) objectInputStream.readObject();
            System.out.println(newEmployee.toString());
        } catch (IOException | ClassNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }


    }
}
