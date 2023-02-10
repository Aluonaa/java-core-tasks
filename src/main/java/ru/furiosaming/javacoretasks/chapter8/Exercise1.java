package main.java.ru.furiosaming.javacoretasks.chapter8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Exercise1 {

    /** Убедитесь, что запрос первых пяти длинных слов не требует вызова метода
    filter(), если найдено пятое длинное слово. С этой целью
     просто организуйте протоколирование вызова каждого метода **/

    public static void main(String[] args) throws IOException {

        String content = new String(Files.readAllBytes(Paths.get(
                "src/main/resources/textFiles/8.1.txt")), StandardCharsets.UTF_8);

        /** разделитель - все небуквенные символы **/
        List<String> listOfWords = Arrays.asList(content.split("\\PL+"));

        listOfWords.stream().filter(s -> s.length() > 12)
                .limit(5).forEach(System.out::println);

    }
}
