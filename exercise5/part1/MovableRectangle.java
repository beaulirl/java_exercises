package FifthExercise;

/**
 * Created by Admin on 09.11.2016.
 */
public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    private MovablePoint topRight;
    private MovablePoint bottomLeft;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        this.topLeft = new MovablePoint(x1, y2, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y1, xSpeed, ySpeed);
        this.topRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        this.bottomLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
    }

    public void moveUp() {
        this.bottomLeft.y += this.bottomLeft.ySpeed;
        this.topLeft.y += this.topLeft.ySpeed;
        this.bottomRight.y += this.bottomRight.ySpeed;
        this.topRight.y += this.topRight.ySpeed;
    }

    public void moveDown(){
        this.bottomLeft.y -= this.bottomLeft.ySpeed;
        this.topLeft.y -= this.topLeft.ySpeed;
        this.bottomRight.y -= this.bottomRight.ySpeed;
        this.topRight.y -= this.topRight.ySpeed;
    }

    public void moveRight(){
        this.bottomLeft.x += this.bottomLeft.xSpeed;
        this.topLeft.x += this.topLeft.xSpeed;
        this.bottomRight.x += this.bottomRight.xSpeed;
        this.topRight.x += this.topRight.xSpeed;
    }

    public void moveLeft(){
        this.bottomLeft.x -= this.bottomLeft.xSpeed;
        this.topLeft.x -= this.topLeft.xSpeed;
        this.bottomRight.x -= this.bottomRight.xSpeed;
        this.topRight.x -= this.topRight.xSpeed;
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                ", topRight=" + topRight +
                ", bottomLeft=" + bottomLeft +
                '}';
    }
}
