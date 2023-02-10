package main.java.ru.furiosaming.javacoretasks.chapter8;

import java.util.stream.IntStream;

public class Exercise6 {
    /** Воспользуйтесь методом String.codePoints()
    для реализации метода, проверяющего, является ли символьная
    строка словом, состоящим только из букв.
        (Подсказка: воспользуйтесь методом Character.isAlphabetic().) Реализуйте
    тем же самым способом метод, проверяющий, является ли символьная строка
    достоверным в Java идентификатором **/

    public static void main(String[] args) {
        String a = "Hello234";
        IntStream intStream = a.codePoints();
        boolean b = intStream.allMatch(Character::isAlphabetic);
        System.out.println("Является ли символьная\n" +
                "    строка словом: " + b);

        System.out.println("Проверка идентификаторов: ");
        String id1 = "Hello234";
        String id2 = "13ello234";
        String id3 = "Hello234#%";
        System.out.println(isID(id1));
        System.out.println(isID(id2));
        System.out.println(isID(id3));
    }

    public static boolean isID(String id){
        IntStream intStream = id.codePoints();
        return Character.isJavaIdentifierStart(id.charAt(0)) && intStream.allMatch(Character::isJavaIdentifierPart);
    }
}
