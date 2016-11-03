package ForthExercise2;

/**
 * Created by Admin on 03.11.2016.
 */
public class Main {

    public static void main(String[] args) {
        /*
        * Task e
        * */
        Shape s1 = new Square(5);
        Shape r1 = new Rectangle(6, 7);
        Shape c1 = new Circle(5);
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getArea());
        if(r1 instanceof Square){
             r1.getPerimeter();
        }
        else{
            System.out.println("It is forbidden");
        }

    }
}
