package com.digdes.crp.javacoretasks.chapter4;

public class Exercise4 {
    public static void main(String[] args){

        Point pointForShapes = new Point(1, 1);

        Point from = new Point(0, 0);
        Point to = new Point(0, 15);

        Circle circle = new Circle(pointForShapes, 8);
        Circle cloneCircle = circle.clone();

        Line line = new Line(from, to);
        Line cloneLine = line.clone();

        Rectangle rectangle = new Rectangle(pointForShapes, 10, 10);
        Rectangle cloneRectangle = rectangle.clone();

        System.out.println(cloneCircle);
        System.out.println(cloneLine);
        System.out.println(cloneRectangle);

    }
}
