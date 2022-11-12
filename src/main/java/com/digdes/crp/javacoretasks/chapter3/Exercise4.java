package com.digdes.crp.javacoretasks.chapter3;

public class Exercise4{
    /** Реализуйте статический метод o f () из интерфейса IntSequence,
    возвращающий последовательность из передаваемых ему аргументов. Например, в результате вызова
    метода IntSequence.of(3, 1, 4, 1, 5, 9) возвращается последовательность из шести значений. **/
    public static void main(String[] args) {
        int[] sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        for(int i = 0; i<sequence.length; i++) {
            System.out.println(sequence[i]);
        }
    }
}
