/**
 * Created by Admin on 13.10.2016.
 */
public class MyTriangle {

    private MyPoint v1 = new MyPoint();
    private MyPoint v2 = new MyPoint();
    private MyPoint v3 = new MyPoint();

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){
        this.v1.setX(x1);
        this.v1.setY(y1);
        this.v2.setX(x2);
        this.v2.setY(y2);
        this.v3.setX(x3);
        this.v3.setY(y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1.setX(v1.getX());
        this.v1.setY(v1.getY());
        this.v2.setX(v2.getX());
        this.v2.setY(v2.getY());
        this.v3.setX(v3.getX());
        this.v3.setY(v3.getY());
    }


    public double getPerimeter(){
        double a, b, c, p;
        a = v1.distance(this.v2.getX(), this.v2.getY());
        b = v2.distance(this.v3.getX(), this.v3.getY());
        c = v3.distance(this.v1.getX(), this.v1.getY());
        p = (a + b + c) / 2;
        return p;
    }


    @Override
    public String toString() {
        return "MyTriangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                '}';
    }

    public String getType(){
        String result;
        double a, b, c;
        a = v1.distance(this.v2.getX(), this.v2.getY());
        b = v2.distance(this.v3.getX(), this.v3.getY());
        c = v3.distance(this.v1.getX(), this.v1.getY());
        if(a == b && a == c && b == c){
            result = "Equilateral";
        }
        else if((a == b && a != c) || (a == c && a != b) || (b == c && b != a)){
            result = "Isosceles";
        }
        else result = "Scalene";
        return result;
    }


}
