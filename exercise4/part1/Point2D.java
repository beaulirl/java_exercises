package ForthExercise;

import java.util.Arrays;

/**
 * Created by Admin on 28.10.2016.
 */
public class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;
    private float[] arr_xy = new float[2];

    public Point2D(){

    }
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
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

    public float[] getXY() {
        return this.arr_xy;
    }

    public void setXY(float x, float y){
        this.arr_xy[0] = x;
        this.arr_xy[1] = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                ", arr_xy=" + Arrays.toString(arr_xy) +
                '}';
    }
}
