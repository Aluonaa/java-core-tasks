package com.digdes.crp.javacoretasks.chapter2;

public final class ImmutablePoint {

        /**
         * Координаты точки на плоскости
         **/
        private double x;
        private double y;

        /**
         * Конструктор без параметров
         **/
        public ImmutablePoint() {
            x = 0;
            y = 0;
        }

        /**
         * Конструктор Point с предоставлением начальных точек
         **/
        public ImmutablePoint(int x, int y) {
            this.x = x;
            this.y = y;
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

        /**
         * Метод для перемещения точки
         **/
        public void translate(double newX, double newY) {
            x = x + newX;
            y = y + newY;
        }

        /**
         * Метод для изменения масштаба по обеим координатам на заданный коэффициент
         **/
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
