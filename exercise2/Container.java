package SecondExercise;

/**
 * Created by Admin on 17.10.2016.
 */
public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int width;
    private int height;

    public Container(int x, int y, int width, int height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = this.x1 + width;
        this.y2 = this.y1 - height;
        this.width = width;
        this.height = height;
    }

    public int getX(){
        return this.x1;
    }

    public int getY(){
        return this.y1;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public boolean collides(Ball ball){
        if(ball.getX() + ball.getRadius() <= this.width && ball.getY() + ball.getRadius() <= this.height){
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Container{" +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                '}';
    }


}
