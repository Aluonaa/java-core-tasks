package chapter3;

import java.util.Scanner;

public class Chapter3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Выбор задания главы 3
        System.out.println("Введите номер задания (в данный момент выполнены: 3):");
        int numberOfExercise = scanner.nextInt();

        switch (numberOfExercise) {
            case (3):
                System.out.println("Каковы все супертипы для типа String , Scanner или\n" +
                        "//        ImageOutputStream?" +
                        "          Следует иметь в виду, что у\n" +
                        "//        каждого типа имеется свой супертип. Класс или ин\u0002терфейс без явно\n" +
                        "//        объявленного супертипа имеет супертип Object.\n" +

                        "//        Решение: у String Object\n" +
                        "//        У Scanner Iterator<String>(у него Object), Closeable(у него AutoCloseable, у которого,\n" +
                        "//        в свою очередь, Object)\n" +
                        "//        У ImageOutputStream ImageInputStream(у него DataInput, Closeable(у него AutoCloseable) и\n" +
                        "//        далее у них Object), DataOutput(у него только Object)");
        }
    }
}
