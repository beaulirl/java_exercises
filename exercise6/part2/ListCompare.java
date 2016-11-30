package SixthExercise;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Admin on 30.11.2016.
 */
public class ListCompare {
    public static void main(String[] args) {

        List<Integer> lst1 = new ArrayList<>();
        List<Integer> lst2 = new LinkedList<>();
        System.out.println("------------------");
        System.out.println("Compare add");
        long startTime = System.nanoTime();
        for(int n = 0; n < 10000; n++){
            int s = (int)(Math.random()*10);
            lst1.add(s);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Add ArrayList" + " " + estimatedTime);
        long startTime1 = System.nanoTime();
        for(int n = 0; n < 10000; n++){
            int s = (int)(Math.random()*10);
            lst2.add(s);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("Add LinkedList" + " " + estimatedTime1);


        System.out.println("------------------");
        System.out.println("Compare remove");
        long startTime2 = System.nanoTime();
        lst1.remove(5943);
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Remove ArrayList" + " " + estimatedTime2);
        long startTime3 = System.nanoTime();
        lst2.remove(5943);
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println("Remove LinkedList" + " " + estimatedTime3);

        System.out.println("------------------");
        System.out.println("Compare indexOf");
        long startTime4 = System.nanoTime();
        lst1.indexOf(8);
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println("Index search ArrayList" + " " + estimatedTime4);
        long startTime5 = System.nanoTime();
        lst2.remove(8);
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println("Index search LinkedList" + " " + estimatedTime5);

    }
}

