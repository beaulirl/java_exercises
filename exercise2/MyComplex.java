package SecondExercise;

/**
 * Created by Admin on 17.10.2016.
 */
public class MyComplex {

    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex(){

    }

    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return this.imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "MyComplex(" +
                 real + " + "
                 + imag + "i" +
                ')';
    }

    public boolean isReal(){
        if(this.real != 0.0 ){
            return true;
        }
        else return false;

    }

    public boolean isImaginary(){
        if(this.imag != 0.0 ){
            return true;
        }
        else return false;
    }

    public boolean equals(double real, double imag){
        if(this.real == real && this.imag == imag){
            return true;
        }
        else return false;
    }

    public boolean equals(MyComplex myComplex){
        if(this.real == myComplex.real && this.imag == myComplex.imag){
            return true;
        }
        else return false;
    }

    public double magnitude(){
        return Math.sqrt(Math.pow(this.real, 2) + Math.pow(this.imag, 2));
    }

    public double argument(){
        return Math.atan(this.imag / this.real);
    }


    public MyComplex add(MyComplex right){
        right.real = this.real + right.real;
        right.imag = this.imag + right.imag;
        return right;
    }

    public MyComplex addNew(MyComplex right){
        MyComplex c = new MyComplex();
        c.real = this.real + right.real;
        c.imag = this.imag + right.imag;
        return c;
    }

    public MyComplex substract(MyComplex right){
        right.real = this.real - right.real;
        right.imag = this.imag - right.imag;
        return right;
    }

    public MyComplex substractNew(MyComplex right){
        MyComplex c = new MyComplex();
        c.real = this.real - right.real;
        c.imag = this.imag - right.imag;
        return c;
    }

    public MyComplex multiply(MyComplex right){
        right.real = this.real * right.real;
        right.imag = this.imag * right.imag;
        return right;
    }

    public MyComplex divide(MyComplex right){
        right.real = this.real / right.real;
        right.imag = this.imag / right.imag;
        return right;
    }

    public MyComplex conjugate(MyComplex right){
        right.imag = -right.imag;
        return right;
    }



}
