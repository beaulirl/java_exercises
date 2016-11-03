package ForthExercise;

import java.util.Arrays;

/**
 * Created by Admin on 31.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        /*
        * Task a
        * */
        Person person1 = new Staff("Mary", "Pokrovskaya, 14", "74D", 2500);
        double value = ((Staff)person1).getPay();
        System.out.println("Pay is: " + value);

        Person person2 = new Person("Anna", "Srednaya, 45");
        if(person2 instanceof Student){
            ((Student)person2).getProgram();
        }
        else{
            System.out.println("It is forbidden");
        }

        Person person3 = new Student("Artem", "Fedorovskogo, 78", "Literature", 1998, 450);
        System.out.println("The fee is: " + ((Student)person3).getFee());

        /*
        * Task b
        * */
        Point2D point1 = new Point2D(4,6);
        Point2D point2 = new Point3D(6, 5, 8);
        System.out.println(Arrays.toString(((Point3D) point2).getXYZ()));
        if(point1 instanceof Point3D){
            ((Point3D)point1).getXYZ();
        }
        else{
            System.out.println("It is forbidden");
        }

        /*
        * Task c
        * */
        Point point_1 = new Point(4,6);
        Point point_2 = new MovablePoint(3, 6, 2, 4);
        System.out.println(((MovablePoint)point_2).move());
        if(point_1 instanceof MovablePoint){
            ((MovablePoint)point_1).getSpeed();
        }
        else{
            System.out.println("It is forbidden");
        }


        /*
        * Task d
        * */
        Shape shape1 = new Circle(7);
        Shape shape2 = new Rectangle(3, 6);
        Shape shape3 = new Shape();
        Shape shape4 = new Square(6);
        System.out.println(((Circle)shape1).getPerimeter());
        System.out.println(((Rectangle)shape2).getArea());
        System.out.println(((Square)shape4).getArea());
        System.out.println(((Rectangle)shape4).getPerimeter());
        if(shape3 instanceof Rectangle){
            ((Rectangle)shape3).getPerimeter();
        }
        else{
            System.out.println("It is forbidden");
        }
        if(shape2 instanceof Square){
            ((Square)shape2).getPerimeter();
        }
        else{
            System.out.println("It is forbidden");
        }









    }
}
