package FifthExercise;

import java.util.Arrays;
import java.util.Objects;

/**
 * Created by Admin on 09.11.2016.
 */
public class MyPoint {

    private int x = 0;
    private int y = 0;
    private int[] arr_xy = new int[2];

    public MyPoint() {
    }

    public MyPoint(int x, int y){
        this.x = x;
        this.y = y;
        this.arr_xy[0] = x;
        this.arr_xy[1] = y;
    }

    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int[] getXY() {
        return this.arr_xy;
    }

    public void setXY(int x, int y){
        this.arr_xy[0] = x;
        this.arr_xy[1] = y;
    }

    @Override
    public String toString() {
        return "FirstExercise.MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public double distance(int x, int y){
        double result;
        result = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        return result;
    }

    public double distance(MyPoint mypoint){
        double result;
        result = Math.sqrt(Math.pow(this.x - mypoint.x, 2) + Math.pow(this.y - mypoint.y, 2));
        return result;
    }

    public double distance(){
        double result;
        result = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return x == myPoint.x &&
                y == myPoint.y &&
                Arrays.equals(arr_xy, myPoint.arr_xy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, arr_xy);
    }
}
