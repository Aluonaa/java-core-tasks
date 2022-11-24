package com.digdes.crp.javacoretasks.chapter9;


import java.io.*;

public class Exercise14 {
    /** Реализуйте сериализируемый класс Point с переменными экземпляра для хранения координат
     *  точки х и у. Напишите одну программу для сериализации
    массива объектов типа Point в файл, а другую — для чтения из файла. **/

    public static void main(String[] args) {
        Point point = new Point(1.4, 1.8);
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("src/main/resources/textFiles/9.14.bin")))
        {
            objectOutputStream.writeObject(point);
        } catch (IOException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("src/main/resources/textFiles/9.14.bin")))
        {
            Point newPoint = (Point) objectInputStream.readObject();
            System.out.println(newPoint.toString());
        } catch (IOException | ClassNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }
}
