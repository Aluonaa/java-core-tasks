package main.java.ru.furiosaming.javacoretasks.chapter9;

import java.io.*;

public class Exercise15 {
    /** Продолжите предыдущее упражнение, но измените представление данных
    типа Point таким образом, чтобы хранить координаты точки в массиве. 1) Что
    произойдет при попытке прочитать в новой версии файл, сформированный
    в предыдущей версии? 2) И что произойдет, если исправить идентификатор
    serialVersionUID? 3) Что бы вы сделали, если бы ваша жизнь
    зависела от создания новой версии, совместимой с прежней?

    Решение:
    1) Будет invalidClassException
    2) Тоже вылетит исключение, но уже с различием указанных версий
    3) ничего, я бы умерла
     **/

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

