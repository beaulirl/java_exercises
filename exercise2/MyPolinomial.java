package SecondExercise;

import java.util.Arrays;

/**
 * Created by Admin on 17.10.2016.
 */
public class MyPolinomial {
    private double[] coeffs;

    public MyPolinomial(double[] coeffs){
        this.coeffs = coeffs;
    }

    public int getDegree(){
        return this.coeffs.length - 1;
    }

    @Override
    public String toString() {
        String s = coeffs[0] + " ";
        for(int i = 1; i < this.coeffs.length; i++){
            s = s + " + " + coeffs[i] + "*x^" + i;
        }
        return s;
    }


    public double evaluate(double x){
        double result = coeffs[0];
        for(int i = 1; i < this.coeffs.length; i++){
            result = result + this.coeffs[i] * Math.pow(x, i);
        }
        return result;
    }


    public MyPolinomial add(MyPolinomial right){
        for(int i = 0; i < this.coeffs.length; i++){
            right.coeffs[i] = this.coeffs[i] + right.coeffs[i];
        }
        return right;
    }

    public MyPolinomial multiply(MyPolinomial right){
        for(int i = 0; i < this.coeffs.length; i++){
            right.coeffs[i] = this.coeffs[i] * right.coeffs[i];
        }
        return right;
    }


}
