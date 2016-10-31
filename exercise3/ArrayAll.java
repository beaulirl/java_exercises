package ThirdExercise;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Admin on 25.10.2016.
 */
public class ArrayAll {

    public static void main(String[] args) {

        /*
        * Task a
        * */
        int[][] arr1 = new int[8][8];
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1.length; j++){
                arr1[i][j] = (int)(Math.random()*100);
                System.out.print(arr1[i][j] + " ");
                if(i == j){
                    count += arr1[i][j];
                }
                if(i + j == arr1.length -1){
                    sum += arr1[i][j];
                }
            }
            System.out.println(" ");
        }
        System.out.println(count);
        System.out.println(sum);

        /*
        * Task b
        * */

        int[][] arr2 = new int[8][5];
        int max = 0;
        int index_i = 0;
        int index_j = 0;
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++){
                arr2[i][j] = -99 + (int)(Math.random()*198);
                System.out.print(arr2[i][j] + " ");
                if(arr2[i][j] > max){
                    max = arr2[i][j];
                    index_i = i;
                    index_j = j;
                }
            }
            System.out.println(" ");
        }
        System.out.println("Max value is: " + max + "Their indexes are: " + index_i + " and " + index_j);



        /*
        * Task c
        * */
        int[][] arr3 = new int[8][5];
        int mult = 1;
        int check = 0;
        int index_s = 0;
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++){
                arr3[i][j] = -10 + (int)(Math.random()*20);
                System.out.print(arr3[i][j] + " ");
                mult = mult * arr3[i][j];
            }
            System.out.println(" ");
            if(mult > check){
                check = mult;
                index_s = i;
            }
            mult = 1;
        }
        System.out.println(check);
        System.out.println("Index of a row = " + index_s);

        /*
        * Task d
        * */
        int[][] arr4 = new int[10][7];
        ArrayList <Integer> help_arr = new ArrayList<>();
        int s = 0;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 7; j++){
                arr4[i][j] = (int)(Math.random()*100);
                System.out.print(arr4[i][j] + " ");
                help_arr.add(arr4[i][j]);
                Collections.sort(help_arr);
            }
            System.out.println(" ");
            for(int y: help_arr){
                arr4[i][s] = y;
                s++;
            }
            help_arr.removeAll(help_arr);
            s = 0;
        }
        System.out.println("------------------");
        printArr(arr4);



    }
    public static void printArr(int[][] arr){
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
