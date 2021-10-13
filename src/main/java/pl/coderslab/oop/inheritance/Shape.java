package pl.coderslab.oop.inheritance;

public class Shape {

    private int x;
    private int y;
    private String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public String getDescription() {
        return this.x + " " + this.y + " " + this.color;
    }

    public double getDistance(Shape shape) {
        return Math.sqrt(Math.pow(this.x-shape.x, 2)+Math.pow(this.y -shape.y,2));
    }
}
