package com.digdes.crp.javacoretasks.chapter9;

/** 4.1 **/
/** 4.2 **/

import java.io.Serializable;
import java.util.Objects;

/** 4.3 **/

    public class Point15 implements Serializable {

    static final long SerialVersionUID = 1;
    double[] coordinates;

    public Point15(double x, double y){
        coordinates[0] = x;
        coordinates[1] = y;
    }

    public Point15(){};

    public double getX(){ return coordinates[0]; }
    public double getY(){
        return coordinates[1];
    }


    public void setX(double x) {
        coordinates[0] = x;
    }

    public void setY(double y) { coordinates[1] = y; }



    @Override
    public String toString() {
        return "Point{" +
                "x=" + coordinates[0] +
                ", y=" + coordinates[1] +
                '}';
    }

}
