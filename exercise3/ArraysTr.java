package ThirdExercise;

import java.util.ArrayList;
import java.util.Collections;



/**
 * Created by Admin on 24.10.2016.
 */
public class ArraysTr {

    public static void main(String[] args) {


        /*
        * Task a
        * */
        ArrayList <Integer> arr1 = new ArrayList<>();
        for (int i = 1; i < 100; i++){
            if(i % 2 != 0){
                arr1.add(i);
            }
        }
        System.out.println(arr1);
        Collections.sort(arr1, Collections.reverseOrder());
        System.out.println(arr1);


        /*
        * Task b
        * */
        ArrayList <Integer> arr2 = new ArrayList<>();
        ArrayList <Integer> subarr2 = new ArrayList<>();
        for (int i = 0; i < 20; i++){
            int s = (int)(Math.random()*10);
            arr2.add(s);
            if(s % 2 == 0){
                subarr2.add(s);
            }
        }
        System.out.println(arr2);
        System.out.println("Number of even numbers: " + subarr2.size());
        System.out.println("Number of odd numbers: " + (arr2.size() - subarr2.size()));


        /*
        * Task c
        * */
        ArrayList <Integer> arr3 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int s = (int) (Math.random() * 99 + 1);
            arr3.add(s);
        }
        System.out.println(arr3);
        for (int i = 0; i < 10; i++) {
            if(i % 2 != 0){
                arr3.remove(i);
                arr3.add(i, 0);
            }
        }
        System.out.println(arr3);

        /*
        * Task d
        * */
        ArrayList <Integer> arr4 = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int s = -50 + (int)(Math.random() * 101);
            arr4.add(s);
        }
        System.out.println(arr4);
        System.out.println(Collections.min(arr4));
        System.out.println(Collections.max(arr4));

        /*
        * Task e
        * */
        ArrayList <Integer> arr5 = new ArrayList<>();
        ArrayList <Integer> arr6 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int s = (int) (Math.random() * 10);
            int d = (int) (Math.random() * 10);
            arr5.add(s);
            arr6.add(d);
        }
        int count1 = 0;
        int sum1 = 0;
        int count2 = 0;
        int sum2 = 0;
        for (int s1: arr5) {
            sum1 += s1;
            count1++;
        }
        for (int s2: arr6) {
            sum2 += s2;
            count2++;
        }
        int avg1 = sum1 / count1;
        int avg2 = sum2 / count2;
        int result = (avg1 > avg2) ? avg1 : avg2;
        if(avg1 == avg2){
            System.out.println("They are equal");
        }

        System.out.println(arr5);
        System.out.println(arr6);
        System.out.println(result);

        /*
        * Task f
        * */
        ArrayList <Integer> arr7 = new ArrayList<>();
        ArrayList <Integer> arr8 = new ArrayList<>();
        int cnt = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        int reslt, n;
        for (int i = 0; i < 20; i++) {
            int s = -1 + (int) (Math.random() * (3));
            arr7.add(s);
            if (!arr8.contains(s)) {
                arr8.add(s);
            }
            n = arr8.size();
            if(s == arr8.get(0)){
                cnt++;
            }
            else if(s == arr8.get(1)){
                cnt1++;
            }
            else cnt2++;

        }
        if(cnt > cnt1 && cnt > cnt2){
            reslt = arr8.get(0);
        }
        else if(cnt1 > cnt && cnt1 > cnt2){
            reslt = arr8.get(1);
        }
        else reslt = arr8.get(2);

        System.out.println(arr7);
        System.out.println(arr8);
        System.out.println(reslt);



















    }





}
