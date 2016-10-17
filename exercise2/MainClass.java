package SecondExercise;

/**
 * Created by Admin on 17.10.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        MyComplex complex1 = new MyComplex(3.0, 5.7);
        MyComplex complex2 = new MyComplex(7.0, 3.9);
        System.out.println(complex1.magnitude());
        System.out.println(complex1.addNew(complex2));
        System.out.println(complex1.conjugate(complex2));

        double[] arr = {5.0, 6.0, 9.0, 10.0};
        double[] arr2 = {1.0, 4.0, 2.0, 3.0, 5.0};
        MyPolinomial polinom1 = new MyPolinomial(arr);
        MyPolinomial polinom2 = new MyPolinomial(arr2);
        System.out.println(polinom1.toString());
        System.out.println(polinom1.getDegree());
        System.out.println(polinom1.add(polinom2));
        System.out.println(polinom1.multiply(polinom2));
        System.out.println(polinom1.evaluate(2.0));

        Container container1 = new Container(0, 4, 6, 4);
        Ball ball1 = new Ball(3, 2, 2, 1, 30);
        System.out.println(container1.collides(ball1));
        System.out.println(ball1);
        ball1.move();
        System.out.println(ball1);

    }
}
