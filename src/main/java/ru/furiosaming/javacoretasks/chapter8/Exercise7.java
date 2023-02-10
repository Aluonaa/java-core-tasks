package main.java.ru.furiosaming.javacoretasks.chapter8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise7 {
    /** Преобразовав содержимое файла в поток лексем, выведите список первых 100
    лексем, являющихся словами в том смысле, в каком они определены в предыдущем упражнении.
    Прочитайте содержимое файла снова и выведите список
    из 10 наиболее часто употребляемых слов, игнорируя регистр букв. **/

    public static void main(String[] args) throws IOException {
        String text =
                Files.lines(Paths.get("src/main/resources/textFiles/7.7.txt"))
                        .collect(Collectors.joining("\n"));
        String[] listOfWords = text.split(" ");
        int i = 0;
        HashMap<String, Integer> wordsWithFrequencyOfUse = new HashMap<>();
        for(String currentWord: listOfWords){
            if(currentWord.codePoints().allMatch(Character::isAlphabetic)){
                if(i<100) {
                    System.out.println(currentWord);
                }
                wordsWithFrequencyOfUse.merge(currentWord, 1, Integer::sum);
                i++;
            };
        }
        Comparator<Map.Entry<String, Integer>> valueComparator = Map.Entry.comparingByValue();

        Map<String, Integer> sortedMap =
                wordsWithFrequencyOfUse.entrySet().stream().
                        sorted(valueComparator.reversed()).limit(10).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println("10 наиболее часто употребляемых слов:");
        System.out.println(sortedMap);

    }

}
