package com.digdes.crp.javacoretasks.chapter8;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class Exercise15 {
    /** Найдите 500 простых чисел с 50 десятичными цифрами, используя
    параллельный поток данных типа BigInteger и метод BigInter.isProbablePrime().
    Насколько это делается быстрее, чем при использовании последовательного
    потока данных? **/

    public static void main(String[] args) {

        BigInteger[] bigs = Stream.iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE)).limit(800).toArray(BigInteger[]::new);

        BigInteger[] bigIntegerFilter = Arrays.stream(bigs).filter(p -> p.isProbablePrime(50)).limit(50).toArray(BigInteger[]::new);
        for(int i = 0; i < bigIntegerFilter.length; i++){
            System.out.println(bigIntegerFilter[i] + " - " + i);
        }
    }


}
