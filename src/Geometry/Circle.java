package Geometry;

public  class Circle extends Shape{
    private double radius;

    public Circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if ((radius <= 0)){
            throw new IllegalArgumentException("Value must be positive");
        }
        else {
            this.radius = radius;
        }
    }

    @Override
    public double area() {
        return(Math.PI * Math.pow(radius,2));
    }

    @Override
    public double perimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public String toString() {
        return super.toString() + "\nCircle: " + "\n"+
                "radius:" + radius ;
    }
}
