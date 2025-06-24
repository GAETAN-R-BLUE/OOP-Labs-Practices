package Geometry;

public class Rectangle extends Shape{
    private double length;
    private  double width;

    public Rectangle(String name, String color, double length, double width) {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if ((length <= 0)){
            throw new IllegalArgumentException("Value must be positive");
        }
        else {
            this.length = length;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if ((width <= 0)){
            throw new IllegalArgumentException("Value must be positive");
        }
        else {
            this.width = width;
        }
    }

    @Override
    public double area() {
        return (length * width);
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString() + "\nRectangle " + "\n"+
                "length=" + length + "\n"+
                " width=" + width;
    }
}
