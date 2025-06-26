package BinarySearch;

import java.util.ArrayList;

public class MaxAndMinInArr {
   public static void main(String[] args) {
     int [] arr = {7,3,6,2,8,12};
     maxAndMin(arr);
   }

   static void maxAndMin(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        int max = list.get(0);
        int min = list.get(0);

        for (int num : list) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
}
