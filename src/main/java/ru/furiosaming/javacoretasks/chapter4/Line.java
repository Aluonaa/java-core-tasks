package main.java.ru.furiosaming.javacoretasks.chapter4;


public class Line extends Shape implements Cloneable {

    Point to;

    Line(){}
    Line(Point from, Point to){
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return null;
    }



    @Override
    protected Line clone() {
        Line clone = new Line();
        Point point = new Point(this.getPoint().getX(), this.getPoint().getY());
        clone.to = this.to;
        clone.setPoint(point);
        return clone;
    }

    @Override
    public String toString() {
        return "Line{" +
                "to=" + to +
                '}';
    }
}
