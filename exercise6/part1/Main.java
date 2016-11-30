package SixthExercise;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Admin on 22.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("------------");
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        Iterator iterator2 = list2.iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("------------");
        long startTime = System.nanoTime();
        LinkedList<Integer> list1 = new LinkedList<>();
        for(int n = 0; n < 10000; n++){
            int s = (int)(Math.random()*10);
            list1.add(s);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Add Java" + " " + estimatedTime);

        long startTime1 = System.nanoTime();
        MyLinkedList<Integer> list3 = new MyLinkedList<>();
        for(int n = 0; n < 10000; n++){
            int s = (int)(Math.random()*10);
            list3.add(s);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println("Add MyLinkedList" + " " + estimatedTime1);


        System.out.println("------------");
        long startTime2 = System.nanoTime();
        list1.remove(5875);
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println("Remove Java" + " " + estimatedTime2);


        long startTime3 = System.nanoTime();
        list3.remove(5875);
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println("Remove MyLinkedList" + " " + estimatedTime3);


        System.out.println("------------");
        long startTime4 = System.nanoTime();
        list1.indexOf(8);
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println("Search Index Java" + " " + estimatedTime4);
        
        long startTime5 = System.nanoTime();
        list3.indexOf(8);
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println("Search Index MyLinkedList" + " " + estimatedTime5);

    }
}
