package main.java.ru.furiosaming.javacoretasks.chapter4;

/** 4.4 **/
/** 4.5 **/

public class Rectangle extends Shape{
    double width;
    double height;

    Rectangle(){};

    Rectangle(Point topLeft, double width, double height){
        super(topLeft);
        this.width = width;
        this.height =height;
    }

    @Override
    public Point getCenter() {
        return null;
    }

    @Override
    protected Rectangle clone() {
        Rectangle clone = new Rectangle();
        Point point = new Point(this.getPoint().getX(), this.getPoint().getY());
        clone.width = this.width;
        clone.height = this.height;
        clone.setPoint(point);
        return clone;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
