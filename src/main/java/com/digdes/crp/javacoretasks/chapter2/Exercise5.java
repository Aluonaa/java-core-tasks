package com.digdes.crp.javacoretasks.chapter2;

public class Exercise5 {
    public static void main(String[] args){
        Plane.Point point = new Plane.Point();
        point.translate(1, 3);
        point.scale(5);
        point.getX();
        point.getY();
        System.out.println(point);
    }
}
