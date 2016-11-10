package FifthExercise;

/**
 * Created by Admin on 09.11.2016.
 */
public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius){
        super(radius);
    }

    public void resize(int percent){
        this.radius = this.radius * (percent + 100) / 100;
    }

}
