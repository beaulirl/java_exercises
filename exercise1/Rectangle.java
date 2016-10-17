/**
 * Created by Admin on 12.10.2016.
 */
public class Rectangle {

    private float length;
    private float width;

    public Rectangle(){

    }

    public Rectangle(float length, float width){
        this.setLength(length);
        this.setWidth(width);
    }

    public void setLength(float length){
        this.length = length;
    }

    public float getLength(){
        return this.length;
    }

    public void setWidth(float width){
        this.width = width;
    }

    public float getWidth(){
        return this.width;
    }

    public double getArea(){
        return getLength()*getWidth();
    }

    public double getPerimeter(){
        return (getLength()+getWidth())*2;
    }


}
