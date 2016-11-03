package ForthExercise2;

/**
 * Created by Admin on 03.11.2016.
 */
public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    public Square(){

    }

    public Square(double side, String color, boolean filled){
        super(side, side);
        setColor(color);
        setFilled(filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
    }

    public void setWidth(double side) {
        setWidth(side);
    }

    public void setLength(double side) {
        setLength(side);
    }

    @Override
    public String toString() {
        return "Square{}" + getSide();
    }
}
