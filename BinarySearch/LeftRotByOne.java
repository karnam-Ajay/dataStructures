package BinarySearch;

import java.util.Arrays;

public class LeftRotByOne {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        leftByOne(nums);
        // rightByOne(nums);
    }

    // Rotating array to left by one place //[2, 3, 4, 5, 1]
    static void leftByOne(int[] arr){

       int temp = arr[0];
       for (int i = 1; i <= arr.length - 1; i++) {
         arr[i -1] = arr[i];
       }
       arr[arr.length - 1] = temp;
       System.out.println(Arrays.toString(arr));
    }

    //Rotating array to right by one place //[5, 1, 2, 3, 4]
    static void rightByOne(int[] arr){
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
        System.out.println(Arrays.toString(arr));
    }

}