package Geometry;

public class Shape {
    private String name, color;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public Shape(){
        this.name  = "unknown";
        this.color = "unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double area (){
        return 0.0;
    }

    public double perimeter (){
        return 0.0;
    }

    @Override
    public String toString() {
        return "\nname: " + name + "\n" +
                "color:" + color;
    }

}
