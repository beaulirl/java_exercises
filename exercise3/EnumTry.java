package ThirdExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 25.10.2016.
 */
public class EnumTry {
    public static void main(String[] args) {

        Weekdays weekday = Weekdays.MONDAY;
        long startTime1 = System.nanoTime();
        if (weekday == Weekdays.MONDAY) {
            System.out.println("Monday");
        } else if (weekday == Weekdays.TUESDAY) {
            System.out.println("Tuesday");
        } else if (weekday == Weekdays.WEDNESDAY) {
            System.out.println("Wednesday");
        } else if (weekday == Weekdays.THURSDAY) {
            System.out.println("Thursday");
        } else System.out.println("Friday");
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(estimatedTime1);

        Weekdays weekday1 = Weekdays.FRIDAY;
        long startTime2 = System.nanoTime();
        switch (weekday1) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case TUESDAY:
                System.out.println("Tuesday");
                break;
            case WEDNESDAY:
                System.out.println("Wednesday");
                break;
            case THURSDAY:
                System.out.println("Thursday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            default:
                System.out.println(" ");
                break;
        }
        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println(estimatedTime2);

        long startTime3 = System.nanoTime();
        ArrayList<Integer> array = new ArrayList<>();

        Map<Integer, Integer> hashmap = new HashMap<>();
        int f1 = 1;
        int f2 = 1;
        int f3 = 1;
        int f4 = 1;
        int f5 = 1;
        int f6 = 1;
        int f7 = 1;
        int f8 = 1;
        int f9 = 1;
        int f10 = 1;
        int f11 = 1;
        for (int i = 0; i < 50; i++) {
            int s = (int) (Math.random() * 10);
            array.add(s);
            if (s == 0) {
                hashmap.put(0, f1);
                f1++;
            } else if (s == 1) {
                hashmap.put(1, f2);
                f2++;
            } else if (s == 2) {
                hashmap.put(2, f3);
                f3++;
            } else if (s == 3) {
                hashmap.put(3, f4);
                f4++;
            } else if (s == 4) {
                hashmap.put(4, f5);
                f5++;
            } else if (s == 5) {
                hashmap.put(5, f6);
                f6++;
            } else if (s == 6) {
                hashmap.put(6, f7);
                f7++;
            } else if (s == 7) {
                hashmap.put(7, f8);
                f8++;
            } else if (s == 8) {
                hashmap.put(8, f9);
                f9++;
            } else if (s == 9) {
                hashmap.put(9, f10);
                f10++;
            } else if (s == 10) {
                hashmap.put(10, f11);
                f11++;
            }
        }
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println(array);
        System.out.println(hashmap);
        System.out.println(estimatedTime3);

        long startTime4 = System.nanoTime();
        ArrayList<Integer> array1 = new ArrayList<>();
        Map<Integer, Integer> hashmap1 = new HashMap<>();
        int s1 = 1;
        int s2 = 1;
        int s3 = 1;
        int s4 = 1;
        int s5 = 1;
        int s6 = 1;
        int s7 = 1;
        int s8 = 1;
        int s9 = 1;
        int s10 = 1;
        int s11 = 1;
        for (int i = 0; i < 50; i++) {
            int s = (int) (Math.random() * 10);
            array1.add(s);
            switch(s){
                case 0:
                    hashmap1.put(0, s1);
                    s1++;
                    break;
                case 1:
                    hashmap1.put(1, s2);
                    s2++;
                    break;
                case 2:
                    hashmap1.put(2, s3);
                    s3++;
                    break;
                case 3:
                    hashmap1.put(3, s4);
                    s4++;
                    break;
                case 4:
                    hashmap1.put(4, s5);
                    s5++;
                    break;
                case 5:
                    hashmap1.put(5, s6);
                    s6++;
                    break;
                case 6:
                    hashmap1.put(6, s7);
                    s7++;
                    break;
                case 7:
                    hashmap1.put(7, s8);
                    s8++;
                    break;
                case 8:
                    hashmap1.put(8, s9);
                    s9++;
                    break;
                case 9:
                    hashmap1.put(9, s10);
                    s10++;
                    break;
                case 10:
                    hashmap1.put(10, s11);
                    s11++;
                    break;
                default:
                    System.out.println();
                    break;
            }
        }
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println(array1);
        System.out.println(hashmap1);
        System.out.println(estimatedTime4);



    }
}
