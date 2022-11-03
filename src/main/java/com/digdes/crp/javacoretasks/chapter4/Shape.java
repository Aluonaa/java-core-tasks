package com.digdes.crp.javacoretasks.chapter4;

/** 4.4 **/
/** 4.5 **/


public abstract class Shape {
      private Point point;

    Shape(){};

    Shape(Point point){
        this.point = point;
    };

    public void moveBy(double dx, double dy){
        point.x += dx;
        point.y += dy;
    }

    public void setPoint(Point point){
        this.point = point;
    }

    public Point getPoint(){
        return this.point;
    }

    public abstract Point getCenter();

}

