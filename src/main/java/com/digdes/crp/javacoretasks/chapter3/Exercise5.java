package com.digdes.crp.javacoretasks.chapter3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise5 {
    /** Реализуйте статический метод constant() из интерфейса IntSequence,
    возвращающий бесконечную последовательность констант. Например, в результате
    вызова IntSequence.constant(1) возвращается бесконечная
    последовательность 111.... В качестве дополнительного задания сделайте то же самое с
    помощью лямбда-выражения **/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        IntStream.generate(IntSequence.constant(1)).limit(count).forEach(System.out::print);
        System.out.println(" ");
        IntStream.generate(IntSequence.constantWithLambda(1)).limit(count).forEach(System.out::print);
    }
}
