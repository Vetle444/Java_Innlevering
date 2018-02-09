package Modul1;

public class TriangleExtra extends GeometricObject{

    private double side1, side2, side3;

    public TriangleExtra () {
        super();

        setSidesToValue(1.0, 1.0, 1.0);
    }

    public TriangleExtra (double sideValue)
    {
        super();

        setSidesToValue(sideValue, sideValue, sideValue);
    }

    public TriangleExtra(double side1Value, double side2Value, double side3Value, String color, boolean filled)
    {
        super(color, filled);

        setSidesToValue(side1Value, side2Value, side3Value);
    }

    private void setSidesToValue(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1 () {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1 (double value) {
        side1 = value;
    }

    public void setSide2 (double value) {
        side2 = value;
    }

    public void setSide3 (double value) {
        side3 = value;
    }

    public double getArea () {
        double s = (side1+side2+side3) / 2;
        double area = Math.sqrt(s * ((s - side1) * (s - side2) * (s - side3)));

        return area;
    }

    public double getPerimeter () {
        return (side1+side2+side3);
    }

    public String toString() {
        String text = String.format("Sides: %.2f %.2f %.2f", side1, side2, side3);
        text += String.format("\nCreated on: %tF %<tT.%<tl", super.getDateCreated());
        text += "\nColor: " + super.getColor();
        text += "\nIs filled: "; text += super.isFilled() ? "Yes" : "No";

        return text;
    }

    public boolean equals(java.lang.Object _triangle) {

        TriangleExtra triangle = (TriangleExtra) _triangle;

        if(triangle.getSide1() != getSide1())
            return false;

        if(triangle.getSide2() != getSide2())
            return false;

        if(triangle.getSide3() != getSide3())
            return false;

        return true;
    }
}
