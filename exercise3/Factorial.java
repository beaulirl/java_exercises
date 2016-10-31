package ThirdExercise;

/**
 * Created by Admin on 24.10.2016.
 */
public class Factorial {

    private int i;

    public Factorial(int i){
        this.i = i;
    }

    public static int factorialR(int n)
    {
        if (n == 0) return 1;
        return n * factorialR(n-1);
    }

    public int factorialC()
    {
        int ret = 1;
        for (int n = 1; n <= this.i; ++n) {
            ret *= n;
        }
        return ret;
    }



}
