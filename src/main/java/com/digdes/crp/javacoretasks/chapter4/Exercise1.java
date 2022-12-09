package com.digdes.crp.javacoretasks.chapter4;

public class Exercise1 {
    /** Определите класс Point с конструктором Point(double х, double у) и методами
    доступа getX(), getY(). Определите также подкласс LabeledPoint с конструктором
    LabeledPoint(String label , double x , double y) и методом
    доступа getLabel(). **/
    public static void main(String[] args){
        Point point = new Point(3, 8);
        Point point1 = new Point(3, 8);
        Point point2 = new Point(12, 9);
        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.equals(point1));
        System.out.println(point.equals(point2));

        LabeledPoint labeledPoint = new LabeledPoint( 0, 0, " Начало");
        System.out.println(labeledPoint.getX());
        System.out.println(labeledPoint.getY());
        System.out.println(labeledPoint.getLabel());
    }
}
