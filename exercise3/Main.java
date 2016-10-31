package ThirdExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 24.10.2016.
 */
public class Main {
    public static void main(String[] args) {

        int n = 15;
        int[] arrforsort = new int[n];
        int[] newarr;
        Integer[] arrsort;


        createRandArr(arrforsort, n);
        long startTime = System.nanoTime();
        Sorting sort1 = new Sorting(arrforsort);
        newarr = sort1.SelectSortB();
        getArrString(newarr);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        long startTime1 = System.nanoTime();
        newarr = sort1.BubbleSortA();
        getArrString(newarr);
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(estimatedTime1);

        long startTime2 = System.nanoTime();
        arrsort = sort1.SimpleSortB();
        getArrStringInteg(arrsort);
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println(estimatedTime2);

        int f = 10;
        long startTime3 = System.nanoTime();
        Factorial factorial1 = new Factorial(f);
        System.out.println(factorial1.factorialC());
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println(estimatedTime3);

        long startTime4 = System.nanoTime();
        Factorial factorial2 = new Factorial(f);
        System.out.println(factorial2.factorialR(f));
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println(estimatedTime4);

    }

    private static void getArrString(int[] arr){
        String d = new String();
        for (int i = 0; i < arr.length; i++){
            d += arr[i] + " ";
        }
        System.out.println(d);
    }

    private static void getArrStringInteg(Integer[] arr){
        String d = new String();
        for (int i = 0; i < arr.length; i++){
            d += arr[i] + " ";
        }
        System.out.println(d);
    }

    private static void createRandArr(int[] arrforsort, int n) {
        for (int i = 0; i < arrforsort.length; i++){
            arrforsort[i] = (int)(Math.random()*10);
            System.out.println(arrforsort[i]);
        }
    }


}
