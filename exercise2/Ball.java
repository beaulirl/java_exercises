package SecondExercise;

/**
 * Created by Admin on 17.10.2016.
 */
public class Ball {
    private float x;
    private float y;
    private int radius;
    private double xDelta;
    private double yDelta;

    public Ball(float x, float y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = speed * Math.cos(direction);
        this.yDelta = -speed * Math.sin(direction);
    }

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getxDelta() {
        return this.xDelta;
    }

    public void setxDelta(double xDelta) {
        this.xDelta = xDelta;
    }

    public double getyDelta() {
        return this.yDelta;
    }

    public void setyDelta(double yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        this.x += this.xDelta;
        this.y += this.yDelta;
    }

    public void reflectHorizontal(){
        this.xDelta = -this.xDelta;
    }

    public void reflectVertical(){
        this.yDelta = -this.yDelta;
    }

    @Override
    public String toString() {
        return "Ball[" + "(" +
                 x +
                ", " + y +
                ", speed=(" + xDelta +
                ", " + yDelta + ')' +
                ']';
    }

}
