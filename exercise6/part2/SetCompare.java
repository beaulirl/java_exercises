package SixthExercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Admin on 30.11.2016.
 */
public class SetCompare {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();

        System.out.println("------------------");
        System.out.println("Compare add");
        long startTime = System.nanoTime();
        for(int n = 0; n < 10000; n++){
            int s = (int)(Math.random()*10000);
            set1.add(s);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Add HashSet" + " " + estimatedTime);
        long startTime1 = System.nanoTime();
        for(int n = 0; n < 10000; n++){
            int s = (int)(Math.random()*10000);
            set2.add(s);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("Add LinkedHashSet" + " " + estimatedTime1);
        long startTime2 = System.nanoTime();
        for(int n = 0; n < 10000; n++){
            int s = (int)(Math.random()*10000);
            set3.add(s);
        }
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Add TreeSet" + " " + estimatedTime2);

        System.out.println("------------------");
        System.out.println("Compare remove");
        long startTime3 = System.nanoTime();
        set1.remove(5943);
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println("Remove HashSet" + " " + estimatedTime3);
        long startTime4 = System.nanoTime();
        set2.remove(5943);
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println("Remove LinkedHashSet" + " " + estimatedTime4);
        long startTime5 = System.nanoTime();
        set3.remove(5943);
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println("Remove TreeSet" + " " + estimatedTime5);


        System.out.println("------------------");
        System.out.println("Compare Size");
        long startTime6 = System.nanoTime();
        set1.size();
        long estimatedTime6 = System.nanoTime() - startTime6;
        System.out.println("Size  HashSet" + " " + estimatedTime6);
        long startTime7 = System.nanoTime();
        set2.size();
        long estimatedTime7 = System.nanoTime() - startTime7;
        System.out.println("Size LinkedHashSet" + " " + estimatedTime7);
        long startTime8 = System.nanoTime();
        set3.size();
        long estimatedTime8 = System.nanoTime() - startTime8;
        System.out.println("Size TreeSet" + " " + estimatedTime8);
    }
}
