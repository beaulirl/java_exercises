package ForthExercise;

import java.util.Arrays;

/**
 * Created by Admin on 28.10.2016.
 */
public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    private float[] arr_speed = new float[2];

    public MovablePoint(){

    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        setX(x);
        setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        setSpeed(xSpeed, ySpeed);
    }

    public float getxSpeed() {
        return this.xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return this.ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        return this.arr_speed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.arr_speed[0] = xSpeed;
        this.arr_speed[1] = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", arr_speed=" + Arrays.toString(arr_speed) +
                '}';
    }

    public MovablePoint move(){
        float x = getX() + this.xSpeed;
        setX(x);
        float y = getX() + this.xSpeed;
        setY(y);
        return this;
    }
}
