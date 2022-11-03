package com.digdes.crp.javacoretasks.chapter4;

/** 4.4 **/
/** 4.5 **/

public class Circle extends Shape implements Cloneable{

    private double radius;

    Circle(){};

    Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return null;
    }


    @Override
    public Circle clone(){
        Circle cloned = new Circle();
        Point point = new Point(this.getCenter().getX(), this.getCenter().getY());
        cloned.radius = this.radius;
        cloned.setPoint(point);
        return cloned;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}