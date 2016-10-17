import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Admin on 13.10.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        Circle circle1 = new Circle(1.0, "red");
        System.out.println(circle1.getArea());
        Rectangle rectangle1 = new Rectangle(6, 7);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        Employee employee1 = new Employee(1, "Ivan", "Ivanov", 3000);
        System.out.println(employee1.getAnnualSalary());
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1.getName());

        Author [] authors = new Author[2];
        authors[0] = new Author();
        authors[1] = new Author();
        authors[0].setName("Bill");
        authors[1].setName("Joye");
        Book book1 = new Book("Head First Java", authors, 700);
        System.out.println(book1.getName());
        System.out.println(book1.getAuthorNames());

        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(4, 8);
        System.out.println(point1.distance(4, 5));
        System.out.println(point1.distance(point2));
        System.out.println(point2.distance());
        point2.setXY(5, 8);
        System.out.println(point2.getXY()[0]);


        MyTriangle triangle1 = new MyTriangle(2, 2, 5, 7, 8, 2);
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.getType());
    }
}
