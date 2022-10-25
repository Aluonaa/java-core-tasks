package chapter2;

public class Plane {

/** 2.5 **/

    public static class Point {
        private double x;
        private double y;

        /**
         * Конструктор Point
         **/
        public Point() {
            x = 0;
            y = 0;
        }

        /**
         * Геттеры
         **/
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public void translate(double newX, double newY) {
            x = x + newX;
            y = y + newY;
        }

        public void scale(double s) {
            x = x * s;
            y = y * s;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
}

}