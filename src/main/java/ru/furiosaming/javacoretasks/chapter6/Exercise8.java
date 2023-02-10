package main.java.ru.furiosaming.javacoretasks.chapter6;

public class Exercise8 {
    /** Видоизмените класс из предыдущего упражнения, введя методы mах() и min()
    для получения наибольшего и наименьшего из двух элементов.
    Наложите соответствующее ограничение на обобщенный тип Е. **/

    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(1, 17);
        System.out.println(pair.max());
        System.out.println(pair.min());
    }

}
