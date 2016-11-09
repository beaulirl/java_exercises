package FifthExercise;

/**
 * Created by Admin on 09.11.2016.
 */
public class Main {
    public static void main(String[] args) {

        /*
        * Test hashCode and equals for Author and Book
        * */
        System.out.println("-------------------");
        Author [] authors = new Author[2];
        authors[0] = new Author();
        authors[1] = new Author();
        authors[0].setName("Bill");
        authors[1].setName("Joye");
        Book book1 = new Book("Head First Java", authors, 700);
        Author authors1 = new Author();
        authors1.setName("Pam Watson");
        Author authors2 = new Author();
        authors2.setName("Pam Watson");
        Author authors3 = authors1;
        System.out.println(authors1.equals(authors2));
        System.out.println(authors1 == authors2);
        System.out.println(authors1.equals(authors3));
        System.out.println(authors1 == authors3);
        System.out.println("-------------------");
        Book book2 = new Book("The girl on the train", authors, 600);
        Book book3 = new Book("The girl on the train", authors, 600);
        Book book4 = book2;
        System.out.println(book2.equals(book1));
        System.out.println(book2 == book1);
        System.out.println(book3.equals(book2));
        System.out.println(book3 == book2);
        System.out.println(book4.equals(book2));
        System.out.println(book4 == book2);


        /*
        * Test hashCode and equals for MyTriangle and MyPoint
        * */
        System.out.println("-------------------");
        MyPoint myPoint2 = new MyPoint(2,6);
        MyPoint myPoint3 = new MyPoint(2,6);
        MyPoint myPoint4 = new MyPoint(6,2);
        MyPoint myPoint5 = myPoint3;
        System.out.println(myPoint2.equals(myPoint3));
        System.out.println(myPoint2 == myPoint3);
        System.out.println(myPoint3.equals(myPoint4));
        System.out.println(myPoint3 == myPoint4);
        System.out.println(myPoint5.equals(myPoint3));
        System.out.println(myPoint3 == myPoint5);
        System.out.println("-------------------");
        MyTriangle myTriangle2 = new MyTriangle(myPoint2, myPoint3, myPoint4);
        MyTriangle myTriangle3 = new MyTriangle(myPoint2, myPoint3, myPoint4);
        MyTriangle myTriangle4 = myTriangle3;
        System.out.println(myTriangle2.equals(myTriangle3));
        System.out.println(myTriangle3 == myTriangle2);
        System.out.println(myTriangle4.equals(myTriangle2));
        System.out.println(myTriangle4 == myTriangle3);

        /*
        *  Test hashCode and equals for Ball
        * */
        System.out.println("--------------");
        Ball ball2 = new Ball(3, 4, 7, 2, 7);
        Ball ball3 = new Ball(3, 4, 7, 2, 7);
        Ball ball4 = new Ball(3, 4, 2, 7, 7);
        Ball ball5 = ball3;
        System.out.println(ball2.equals(ball3));
        System.out.println(ball2 == ball3);
        System.out.println(ball4.equals(ball5));
        System.out.println(ball4 == ball5);
        System.out.println(ball3.equals(ball5));
        System.out.println(ball3 == ball5);

        /*
        *  Test hashCode and equals for Person, Staff, Student
        * */
        System.out.println("--------------");
        Person person1 = new Staff("Alla", "Glinky 56", "45", 800);
        Person person2 = new Staff("Alla", "Glinky 56", "45", 800);
        System.out.println(person1.equals(person2));
        System.out.println(person1 == person2);
        Person person3 = new Student("Dmitry", "Borisovo 89", "Drum", 4, 150);
        Person person4 = new Student("Dmitry", "Borisovo 89", "Drum", 4, 150);
        System.out.println(person3.equals(person4));
        System.out.println(person3 == person4);

        /*
        *  Test hashCode and equals for MyDate
        * */
        System.out.println("--------------");
        MyDate date1 = new MyDate(1994, 03, 26);
        MyDate date2 = new MyDate(1990, 10, 25);
        MyDate date3 = new MyDate(1990, 10, 25);
        MyDate date4 = date1;
        System.out.println(date1.equals(date4));
        System.out.println(date1 == date4);
        System.out.println(date2.equals(date3));
        System.out.println(date2 == date3);


        /*
        * Test Movable Classes
        * */
        System.out.println("--------------");
        MovablePoint point1 = new MovablePoint(2, 4, 6, 7);
        System.out.println(point1);
        point1.moveLeft();
        point1.moveDown();
        System.out.println(point1);
        MovableCircle circle1 = new MovableCircle(4, 5, 3, 6, 4);
        System.out.println(circle1);
        circle1.moveRight();
        circle1.moveUp();
        System.out.println(circle1);
        MovableRectangle rectangle1 = new MovableRectangle(4, 6, 3, 9, 2, 3);
        System.out.println(rectangle1);
        rectangle1.moveDown();
        rectangle1.moveLeft();
        System.out.println(rectangle1);

        /*
        * Test Resizable Classes
        * */
        System.out.println("------------");
        Circle circle3 = new ResizableCircle(5);
        System.out.println(circle3.getArea());
        System.out.println(circle3.getPerimeter());
        ((ResizableCircle)circle3).resize(5);
        System.out.println(circle3.getArea());
        System.out.println(circle3.getPerimeter());




    }
}
