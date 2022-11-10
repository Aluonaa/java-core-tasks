package com.digdes.crp.javacoretasks.chapter1;

public class Exercise16 {

    /** Усовершенствуйте упоминавшийся ранее метод average()
    таким образом, что бы он вызывался хотя бы с одним параметром

    public static double average(double... values) {
        double sum = 0;
        for (double v : values) sum += v;
        return values.length == 0 ? 0 : sum / values.length;
    } **/
    public static void main(String[] args) {
        System.out.println(average(1));
    }

    public static double average(double first, double... values) {
        double sum = 0;
        for (double v : values) sum += v;
        return values.length == 0 ? first : sum / values.length;
    }

}
