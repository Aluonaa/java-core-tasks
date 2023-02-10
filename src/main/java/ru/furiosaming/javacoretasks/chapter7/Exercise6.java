package main.java.ru.furiosaming.javacoretasks.chapter7;


public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("Предположим, у вас есть параметр метода type Map<String," +
                " Set<Integer>>, и кто-то вызывает ваш метод с помощью a HashMap<String," +
                " HashSet<Integer>>. Что происходит? Какой тип параметра вы можете" +
                " использовать вместо этого?" +
                "" +
                "Решение: в этом случае следует использовать подстановочный знак типа:" +
                " Map<String, ? extends Set<Integer>>");
    }
}
