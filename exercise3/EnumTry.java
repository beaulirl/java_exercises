package ThirdExercise;

import java.util.ArrayList;
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
        int[] array_amount = new int[10];

        for (int i = 0; i < 50; i++) {
            int s = (int) (Math.random() * 10);
            array.add(s);
            if (s == 0) {
                array_amount[0] += 1;
            } else if (s == 1) {
                array_amount[1] += 1;
            } else if (s == 2) {
                array_amount[2] += 1;
            } else if (s == 3) {
                array_amount[3] += 1;
            } else if (s == 4) {
                array_amount[4] += 1;
            } else if (s == 5) {
                array_amount[5] += 1;
            } else if (s == 6) {
                array_amount[6] += 1;
            } else if (s == 7) {
                array_amount[7] += 1;
            } else if (s == 8) {
                array_amount[8] += 1;
            } else if (s == 9) {
                array_amount[9] += 1;
            } else if (s == 10) {
                array_amount[10] += 1;
            }
        }
        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println(array);
        for(int s = 0; s < array_amount.length; s++){
            System.out.print(s + " - " + array_amount[s] + "; ");
        }
        System.out.println();
        System.out.println(estimatedTime3);

        long startTime4 = System.nanoTime();
        ArrayList<Integer> array1 = new ArrayList<>();
        int[] array_amount1 = new int[10];
        for (int i = 0; i < 50; i++) {
            int s = (int) (Math.random() * 10);
            array1.add(s);
            switch(s){
                case 0:
                    array_amount1[0] += 1;
                    break;
                case 1:
                    array_amount1[1] += 1;
                    break;
                case 2:
                    array_amount1[2] += 1;
                    break;
                case 3:
                    array_amount1[3] += 1;
                    break;
                case 4:
                    array_amount1[4] += 1;
                    break;
                case 5:
                    array_amount1[5] += 1;
                    break;
                case 6:
                    array_amount1[6] += 1;
                    break;
                case 7:
                    array_amount1[7] += 1;
                    break;
                case 8:
                    array_amount1[8] += 1;
                    break;
                case 9:
                    array_amount1[9] += 1;
                    break;
                case 10:
                    array_amount1[10] += 1;
                    break;
                default:
                    System.out.println();
                    break;
            }
        }
        long estimatedTime4 = System.nanoTime() - startTime4;
        System.out.println(array1);
        for(int s = 0; s < array_amount1.length; s++){
            System.out.print(s + " - " + array_amount1[s] + "; ");
        }
        System.out.println();
        System.out.println(estimatedTime4);



    }
}
