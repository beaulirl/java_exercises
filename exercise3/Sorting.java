package ThirdExercise;

import java.util.Arrays;
import java.util.Collections;


/**
 * Created by Admin on 24.10.2016.
 */
public class Sorting {
    private int[] arr;

    public Sorting(int arr[]){
        this.arr = arr;
    }

    public int[] BubbleSortA(){
        int temp = 0;
        for(int j = 0; j<this.arr.length; j++){
            for(int i = 0; i<this.arr.length - 1; i++){
                if(this.arr[i]>this.arr[i+1]){
                    temp = this.arr[i];
                    this.arr[i] = this.arr[i+1];
                    this.arr[i+1] = temp;
                }
            }
        }
        return this.arr;
    }

    public int[] BubbleSortB(){
        int temp = 0;
        for(int j = 0; j<this.arr.length; j++){
            for(int i = 0; i<this.arr.length - 1; i++){
                if(this.arr[i]<this.arr[i+1]){
                    temp = this.arr[i];
                    this.arr[i] = this.arr[i+1];
                    this.arr[i+1] = temp;
                }
            }
        }
        return this.arr;
    }

    public int[] SelectSortA(){
        for (int i = 0; i < this.arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < this.arr.length; j++){
                if (this.arr[j] < this.arr[index]){
                    index = j;
                }
            }
            int smallerNumber = this.arr[index];
            this.arr[index] = this.arr[i];
            this.arr[i] = smallerNumber;
        }
        return this.arr;
    }

    public int[] SelectSortB(){
        for (int i = 0; i < this.arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < this.arr.length; j++){
                if (this.arr[j] > this.arr[index]){
                    index = j;
                }
            }
            int smallerNumber = this.arr[index];
            this.arr[index] = this.arr[i];
            this.arr[i] = smallerNumber;
        }
        return this.arr;
    }

    public int[] SimpleSortA(){
        Arrays.sort(this.arr);
        return this.arr;
    }

    public Integer[] SimpleSortB(){
        Integer[] newArray = new Integer[this.arr.length];
        int i = 0;
        for (int value : this.arr) {
            newArray[i++] = Integer.valueOf(value);
        }
        Arrays.sort(newArray, Collections.reverseOrder());
        return newArray;
    }

}
