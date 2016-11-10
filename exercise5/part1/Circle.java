package FifthExercise;

/**
 * Created by Admin on 09.11.2016.
 */
public class Circle implements GeometricObject {

    protected double radius = 1.0;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
}
