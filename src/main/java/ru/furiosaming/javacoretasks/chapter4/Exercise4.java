package main.java.ru.furiosaming.javacoretasks.chapter4;

public class Exercise4 {
    /** Определите абстрактный класс Shape с переменной экземпляра класса Point ;
    конструктором и конкретным методом public void moveBy(double d x, double dy), перемещающим
    точку на заданное расстояние; а также абстрактным классом public Point getCenter(). Предоставьте конкретные подклассы Circle,
    Rectangle , Line с конструкторами public Circle(Point center, double
    radius), public Rectangle(Point topLeft, double width, double height) и
    public Line(Point from, Point to) **/

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
