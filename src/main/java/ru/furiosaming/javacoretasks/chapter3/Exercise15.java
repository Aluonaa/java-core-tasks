package main.java.ru.furiosaming.javacoretasks.chapter3;


public class Exercise15 {
    /** Реализуйте локальный класс RandomSequence , упоминавшийся в разделе 3.9.1,
    как вложенный класс за пределами метода randomInts(). **/

    public static void main(String[] args) {
        RandomSequence randomSequence = randomlnts(1, 15);
        for(int i = 0; i<9; i++){
            System.out.println(randomSequence.next());
        }

    }
    public static RandomSequence randomlnts(int low, int high) {
        return new RandomSequence(low, high);
    }
}
