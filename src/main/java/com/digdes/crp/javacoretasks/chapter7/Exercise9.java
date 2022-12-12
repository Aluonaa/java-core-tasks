package com.digdes.crp.javacoretasks.chapter7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Exercise9 {
    /** Счетчик в отображении счетчиков можно обновить следующим образом:
    counts.merge(word, 1, Integer::sum);
    Сделайте то же самое без метода merge (), воспользовавшись, во-первых,
    методом contains(); во-вторых, методом get() и проверкой пустых значений
    (null); в-третьих, методом getOrDefault() и, в-четвертых, методом putIfAbsent(). **/

    public static void main(String[] args) {
        HashMap<String, Integer> wordsWithFrequencyOfUse = new HashMap<>();
        final File folder = new File("src/main/resources/textFiles/10.11");
        for (File f: Objects.requireNonNull(folder.listFiles())) {
            try(Scanner scanner1 = new Scanner(Paths.get(String.valueOf(Paths.get(f.getPath())))))
            {
                while(scanner1.hasNext())
                {
                    String currentWord = scanner1.next();
                    currentWord = currentWord.replaceAll("[^A-Za-zА-Яа-я]", "");
                    containMethod(wordsWithFrequencyOfUse, currentWord); /** первый метод **/
//                    getAndNullMethod(wordsWithFrequencyOfUse, currentWord); /** второй метод **/
//                    putIfAbsentMethod(wordsWithFrequencyOfUse, currentWord); /** третий метод **/
//                    getOrDefaultMethod(wordsWithFrequencyOfUse, currentWord); /** четвертый метод **/
                }
            }
            catch (IOException io){
                io.printStackTrace();
            }
            wordsWithFrequencyOfUse.remove("");
        }
        System.out.println(wordsWithFrequencyOfUse);
    }

    public static void containMethod(HashMap<String, Integer> wordsWithFrequencyOfUse, String currentWord){
        if(wordsWithFrequencyOfUse.containsKey(currentWord)){
            wordsWithFrequencyOfUse.put(currentWord, wordsWithFrequencyOfUse.get(currentWord) + 1);
        }
        else {
            wordsWithFrequencyOfUse.put(currentWord, 1);
        }
    }

    public static void getAndNullMethod(HashMap<String, Integer> wordsWithFrequencyOfUse, String currentWord){
        if(wordsWithFrequencyOfUse.get(currentWord) == null){ //тут так нужно по заданию
            wordsWithFrequencyOfUse.put(currentWord, 1);
        }
        else wordsWithFrequencyOfUse.put(currentWord, wordsWithFrequencyOfUse.get(currentWord) + 1);
    }
    public static void putIfAbsentMethod(HashMap<String, Integer> wordsWithFrequencyOfUse, String currentWord){
        wordsWithFrequencyOfUse.computeIfPresent(currentWord, (k, v) -> v == null ? 1 : v + 1);
        wordsWithFrequencyOfUse.putIfAbsent(currentWord, 1);
    }

    public static void getOrDefaultMethod(HashMap<String, Integer> wordsWithFrequencyOfUse, String currentWord){
        if(wordsWithFrequencyOfUse.getOrDefault(currentWord, 0) == 0){
            wordsWithFrequencyOfUse.put(currentWord, 1);
        }
        else wordsWithFrequencyOfUse.put(currentWord, wordsWithFrequencyOfUse.get(currentWord) + 1);
    }
}
