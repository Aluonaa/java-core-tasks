package main.java.ru.furiosaming.javacoretasks.chapter8;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise15 {
    /** Найдите 500 простых чисел с 50 десятичными цифрами, используя
    параллельный поток данных типа BigInteger и метод BigInter.isProbablePrime().
    Насколько это делается быстрее, чем при использовании последовательного
    потока данных? **/

    public static void main(String[] args) {

        List<BigInteger> bigs = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(3600).collect(Collectors.toList());

        long startSerialStream = System.currentTimeMillis();
        BigInteger[] bigIntegerStream = bigs.stream().filter(p -> p.isProbablePrime(50)).limit(500).toArray(BigInteger[]::new);
        long endSerialStream = System.currentTimeMillis();
        long startParallelStream = System.currentTimeMillis();
        BigInteger[] bigIntegerParallelStream = bigs.parallelStream().filter(p -> p.isProbablePrime(50)).limit(500).toArray(BigInteger[]::new);
        long endParallelStream = System.currentTimeMillis();
        for(int i = 0; i < bigIntegerStream.length; i++){
            System.out.println(bigIntegerStream[i] + " - " + i);
        }
        System.out.println("Время работы параллельного потока: " + (endParallelStream-startParallelStream));
        System.out.println("Время работы обычного потока: " + (endSerialStream-startSerialStream));
    }


}
