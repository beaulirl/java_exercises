package SixthExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Admin on 30.11.2016.
 */
public class MapCompare {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new LinkedHashMap<>();
        Map<Integer, Integer> map3 = new TreeMap<>();

        System.out.println("------------------");
        System.out.println("Compare add");
        long startTime = System.nanoTime();
        for(int n = 0; n < 10000; n++){
            int s = (int)(Math.random()*10);
            map1.put(n, s);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Add HashMap" + " " + estimatedTime);
        long startTime1 = System.nanoTime();
        for(int n = 0; n < 10000; n++){
            int s = (int)(Math.random()*10000);
            map2.put(n, s);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("Add LinkedHashMap" + " " + estimatedTime1);
        long startTime2 = System.nanoTime();
        for(int n = 0; n < 10000; n++){
            int s = (int)(Math.random()*10000);
            map3.put(n, s);
        }
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Add TreeMap" + " " + estimatedTime2);
        System.out.println("------------------");
        System.out.println("Compare remove");
        long startTime3 = System.nanoTime();
        map1.remove(5943);
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println("Remove HashMap" + " " + estimatedTime3);
        long startTime4 = System.nanoTime();
        map2.remove(5943);
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println("Remove LinkedHashMap" + " " + estimatedTime4);
        long startTime5 = System.nanoTime();
        map3.remove(5943);
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println("Remove TreeMap" + " " + estimatedTime5);


        System.out.println("------------------");
        System.out.println("Compare Get");
        long startTime6 = System.nanoTime();
        map1.get(245);
        long estimatedTime6 = System.nanoTime() - startTime6;
        System.out.println("Get HashMap" + " " + estimatedTime6);
        long startTime7 = System.nanoTime();
        map2.get(245);
        long estimatedTime7 = System.nanoTime() - startTime7;
        System.out.println("Get LinkedHashMap" + " " + estimatedTime7);
        long startTime8 = System.nanoTime();
        map3.get(245);
        long estimatedTime8 = System.nanoTime() - startTime8;
        System.out.println("Get TreeMap" + " " + estimatedTime8);





    }

}
