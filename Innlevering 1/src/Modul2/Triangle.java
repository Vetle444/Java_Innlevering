package Modul2;

public class Triangle extends GeometricObject{

    private double side1, side2, side3;



    public Triangle(double side1Value, double side2Value, double side3Value) throws IllegalTriangleException
    {
        super();
        System.out.println("Creating triangle with sides: " + side1Value + ", " + side2Value + ", " + side3Value);
        try {
            if(!checkNegativeLength(side1Value, side2Value, side3Value)){
                throw new IllegalTriangleException("One side has negative length", side1Value, side2Value, side3Value);
            }

            if(!checkSideLength(side1Value, side2Value, side3Value))
            {
                throw new IllegalTriangleException("One side is too long", side1Value, side2Value, side3Value);
            }


            setSidesToValue(side1Value, side2Value, side3Value);
            System.out.println(String.format("Perimeter: %.1f", getPerimeter()));
            System.out.println(String.format("Area: %.1f", getArea()));

        }
        catch (IllegalTriangleException e){
            System.out.println(e.getMessage() + "\nSide1: " + e.getSide1() + "\nSide2: " + e.getSide2() + "\nSide3: " + e.getSide3());
        }
    }

    public boolean checkSideLength(double side1, double side2, double side3)
    {
        if(side1 < (side2 + side3) && side2 < (side1 + side3) && side3 < (side1 + side2))
            return true;
        return false;
    }

    public boolean checkNegativeLength (double side1, double side2, double side3){

        if(side1 > 0 && side2 > 0 && side3 > 0)
            return true;
        return false;
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




}
