package pl.coderslab.oop.inheritance;

public class Circle extends Shape{
    private int radius;

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " radius = " + radius;
    }

    public double getArea () {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
    public double getCircuit() {
        double lenght = 2 * Math.PI * radius;
        return lenght;
    }
}
