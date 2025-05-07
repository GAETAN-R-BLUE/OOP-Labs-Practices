package Geometry;

public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String name, String color, double side1, double side2, double side3) {
        super(name, color);
        this.side3 = side1;
        this.side2 = side2;
        this.side1 = side3;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if ((side3 <= 0)){
            throw new IllegalArgumentException("Side length must be positive");
        }
        else {
            this.side3 = side3;
        }
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if ((side2 <= 0)){
            throw new IllegalArgumentException("Side length must be positive");
        }
        else {
            this.side2 = side2;
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if ((side1 <= 0)){
            throw new IllegalArgumentException("Side length must be positive");
        }
        else {
            this.side1 = side1;
        }
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {
        double h = (side1 + side2 + side3) / 2;
        return Math.sqrt((h *(h - side1) * (h -side2) * (h - side3)));

    }

    @Override
    public String toString() {
        return super.toString() + "\n Side1: " + side1 + "\n" +
        "Side2: " + side2 + "\n" +
        "Side3: " + side3;
    }
}
