package chapterFour;

/** 4.1 **/
/** 4.2 **/
/** 4.3 **/

public class Point{
    protected double x;
    protected double y;

    Point(double х, double у){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString(){
        return "Point{" +
                "x=" + x +
                ", y=" + y + '}';
    }

    public class LabeledPoint {
        String label;
        double x;
        double y;

        LabeledPoint(String label, double x, double y){
            this.label = label;
            this.x = x;
            this.y = y;
        }

        public String getLabel(){
            return label;
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        @Override
        public String toString(){
            return "LabeledPoint{" +
                    "label=" + label +
                    "x=" + x +
                    ", y=" + y + '}';
        }
    }
}
