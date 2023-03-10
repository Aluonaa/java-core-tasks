package main.java.ru.furiosaming.javacoretasks.chapter3;

public class Exercise4{
    /** Реализуйте статический метод of() из интерфейса IntSequence,
    возвращающий последовательность из передаваемых ему аргументов. Например, в результате вызова
    метода IntSequence.of(3, 1, 4, 1, 5, 9) возвращается последовательность из шести значений. **/

    public static void main(String[] args) {

        int[] sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        for (int value : sequence) {
            System.out.println(value);
        }
    }

}
