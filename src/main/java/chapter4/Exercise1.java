package chapter4;

public class Exercise1 {
    public static void main(String[] args){
        Point point = new Point(3, 8);
        Point point1 = new Point(3, 8);
        Point point2 = new Point(12, 9);
        System.out.println(point.getX());
        System.out.println(point.getY());
        System.out.println(point.equals(point1));
        System.out.println(point.equals(point2));

        LabeledPoint labeledPoint = new LabeledPoint( 0, 0, " Начало");
        labeledPoint.getX();
        labeledPoint.getY();
    }
}
