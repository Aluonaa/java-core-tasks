package com.digdes.crp.javacoretasks.chapter4;

public class Exercise7 {
    /** Определите перечислимый тип для восьми комбинаций основных цветов —
    BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, W H ITE — с методами getRed(),
    getGreen() и getBlue(). **/
    public static void main(String[] args){
        Colors colors = Colors.RED;
        System.out.println(colors.getBlue());
        System.out.println(colors.getGreen());
        System.out.println(colors.getRed());
    }
}
