package com.digdes.crp.javacoretasks.chapter5;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise4 {
    /** Повторите предыдущее упражнение, но на этот раз не пользуйтесь
    исключениями. Вместо этого организуйте возврат кодов ошибок из
    методов readValues() и sumOfValues(). **/

    public static void main(String[] args) {
        String filename = "src/main/resources/textFiles/5.1.txt";
        System.out.println(sumOfValues(filename));
    }
    public static Result readValues(String filename, ArrayList<Double> doubleArrayList){

        try(Scanner scanner = new Scanner(Paths.get(filename))){
            while(scanner.hasNext()){
                doubleArrayList.add(Double.parseDouble(scanner.next()));
            }
        } catch (IOException fileNotFoundException){
            return Result.FILE_NOT_FOUND;

        } catch (NumberFormatException numberFormatException){
            return Result.NUMBER_FORMAT_EXCEPTION;
        }
        return Result.OK;
    }

    public static Result sumOfValues (String filename){
        Double sum = 0.0;
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        Result result = readValues(filename, doubleArrayList);
        if(result != Result.OK){
            return result;
        }
        for (Double d : doubleArrayList) {
            sum += d;
        }
        System.out.println(sum);
        return result;
    }

    public enum Result {OK, FILE_NOT_FOUND, NUMBER_FORMAT_EXCEPTION}

}
