package com.digdes.crp.javacoretasks.chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise14 {
    /**Напишите программу, вводящую двумерный массив целочисленных значений
    и определяющую, содержится ли в нем магический квадрат (т.е. одинаковая
    сумма значений во всех строках, столбцах и диагоналях). Принимая строки
    вводимых данных, разбивайте их на отдельные целочисленные значения,
     прекратив этот процесс, когда пользователь введет пустую строку. Например, на
    следующие вводимые данные:
            2 7 6
            9 5 1
            4 3 8
            (Пустая строка)
    программа должна ответить утвердительно **/

    public static void main(String[] args) {
        System.out.println(magicSquareCheck());
    }

    public static boolean magicSquareCheck(){

        Scanner scanner = new Scanner(System.in);
        String input;
        List<String> stringListOfNumbersFromInput = new ArrayList<>();
        while (scanner.hasNextLine()){
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                break;
            }
            stringListOfNumbersFromInput.add(input);
        }

        System.out.println(stringListOfNumbersFromInput);

        //Это значение необходимо, чтобы указать размер массива
        int lengthOfEachRowOfTheArray = stringListOfNumbersFromInput.get(0).split(" ").length;
        //Объявляем и инициализируем массив
        int[][] mass = new int[stringListOfNumbersFromInput.size()][lengthOfEachRowOfTheArray];

        //Заполнение массива из List<String>
        for(int i=0; i<stringListOfNumbersFromInput.size(); i++){
            String[] currentString = stringListOfNumbersFromInput.get(i).split(" ");

            for(int j=0; j<currentString.length; j++){
                int num = Integer.parseInt(currentString[j]);
                mass[i][j] = num;
            }
        }

        //Считаем суммы строк
        int[] summStroka = new int[mass.length];
        for(int i=0; i<mass.length; i++){
            for(int j=0;j<mass.length;j++){
                summStroka[i] += mass[i][j];
            }
        }
        for(int i=0; i<summStroka.length-1; i++){
            if(summStroka[i] != summStroka[i+1]){
                return false;
            }
        }

        //Считаем суммы столбцов
        int[] summColumns = new int[mass[0].length];
        for(int i=0; i<mass[0].length; i++){
            for(int j=0;j<mass[i].length;j++){
                summColumns[j] += mass[j][i];
            }
        }
        for(int i=0; i<summColumns.length-1; i++){
            if(summColumns[i] != summColumns[i+1]){
                return false;
            }
        }

        //Проверка на равенство сумм столбцов и строк
        if(summStroka[0] != summColumns[0]){
            return false;
        }

        int firstDiagonal = 0;
        int secondDiagonal = 0;

        //Сумма первой диагонали
        for(int i=0; i<mass.length; i++){
            for(int j=0;j<mass[i].length;j++){
                if(i==j){
                    firstDiagonal += mass[i][j];
                }
            }
        }

        //Сумма второй диагонали
        for(int i=0; i<mass.length; i++){
                secondDiagonal += mass[i][mass[0].length-i-1];
        }

        //Проверка на равенство длиагоналей
        if(firstDiagonal != secondDiagonal){
            return false;
        }

        //Проверка на равенство диагоналей со строками и столбцами
        if(firstDiagonal != summColumns[0]){
            return false;
        }

        return true;
    }
}
