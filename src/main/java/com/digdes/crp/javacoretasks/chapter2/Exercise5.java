package com.digdes.crp.javacoretasks.chapter2;

public class Exercise5 {

/**     5. Реализуйте неизменяемый класс Point , описывающий точку на плоскости.
            Предоставьте его конструктор, чтобы задать конкретную точку; конструктор
            без аргументов, чтобы задать точку в начале координат; а также методы getX(),
            getY(), translate() и scale(). В частности, метод translate()
            должен перемещать точку на определенное расстояние в направлении координат х и у, а
            метод scale() — изменять масштаб по обеим координатам на заданный коэффициент.
            Реализуйте эти методы таким образом, чтобы они возвращали новые
            точки в качестве результата. Например, в следующей строке кода:
            Point р = new Point(3, 4).translate(1, 3).scale(0.5);
            в переменной р должна быть установлена точка с координатами (2, 3,5). **/

    public static void main(String[] args){
        Plane.Point point = new Plane.Point();
        System.out.println(point.getX());
        System.out.println(point.getY());
        point.translate(1, 3);
        point.scale(5);
        System.out.println(point);

    }
}
