package chapter4;

import java.util.Objects;

public class LabeledPoint extends Point{

    String label;

    LabeledPoint(double х, double у, String label) {
        super(х, у);
        this.label = label;
    }

    public String getLabel(){
            return label;
        }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public double getY() {
        return super.getY();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LabeledPoint that = (LabeledPoint) o;
        return Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), label);
    }

    @Override
    public String toString() {
        return "LabelPoint{" +
                "label='" + label + '\'' +
                '}';
    }

}
