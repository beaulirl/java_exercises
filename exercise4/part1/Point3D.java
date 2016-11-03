package ForthExercise;

import java.util.Arrays;

/**
 * Created by Admin on 28.10.2016.
 */
public class Point3D extends Point2D {

    private float z = 0.0f;
    private float[] arr_xyz = new float[3];


    public Point3D(){

    }

    public Point3D(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
        setXYZ(x, y, z);
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return this.arr_xyz;
    }

    public void setXYZ(float x, float y, float z){
        this.arr_xyz[0] = x;
        this.arr_xyz[1] = y;
        this.arr_xyz[2] = z;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + getX() + "y=" + getY() +
                "z=" + z +
                ", arr_xyz=" + Arrays.toString(this.arr_xyz) +
                '}';
    }
}
