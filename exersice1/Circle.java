/**
 * Created by Admin on 12.10.2016.
 */
public class Circle {

    private double radius;
    private String color;

    public Circle() {

    }

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public Circle(double radius, String color) {
        this.setRadius(radius);
        this.setColor(color);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getArea() {
        return Math.PI * this.getRadius();
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0, "red");
        System.out.println(circle1.getArea());

    }

}

