package main.java.ru.furiosaming.javacoretasks.chapter8;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Exercise8 {
    /** Прочитайте слова из файла / u s r / s h a r e / d ic t / w o r d s (или аналогичного списка
            слов) в поток данных и получите массив всех слов, содержащих пять отдельных
    гласных. **/

    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(
                "src/main/resources/textFiles/8.8.txt")), StandardCharsets.UTF_8);

        List<String> listOfWords = Arrays.asList(content.split("\\PL+"));
        System.out.println(listOfWords);
        String[] result = listOfWords.stream().filter(Exercise8::countVowel).toArray(String[]::new);
        for (String currentWord: result){
            System.out.println(currentWord);
        }
    }
    static boolean countVowel(String s) {
        int count=0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='а'|| s.charAt(i)=='е'|| s.charAt(i)=='и'|| s.charAt(i)=='о'|| s.charAt(i)=='у'
                    || s.charAt(i)=='ы' || s.charAt(i)=='ю' || s.charAt(i)=='я') {
                count++;
            }
        }
        return count == 5;
    }
}

