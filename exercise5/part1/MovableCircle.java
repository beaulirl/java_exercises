package FifthExercise;

/**
 * Created by Admin on 09.11.2016.
 */
public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp(){
        this.center.y += this.center.ySpeed;
    }
    public void moveDown(){
        this.center.y -= this.center.ySpeed;
    }

    public void moveRight(){
        this.center.x += this.center.xSpeed;
    }

    public void moveLeft(){
        this.center.x -= this.center.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
