package Recursion;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
        quickSrt(arr, 0, arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSrt(int[] nums,int low, int high){
        if (low >= high) {
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e -s)/2;
        int povit = nums[mid];

        while (s <= e) {
            while (nums[s] < povit) {
                s++;
            }
            while (nums[e] > povit) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivoit is at correct index, please sort two halfs now.

        quickSrt(nums, low, e);
        quickSrt(nums, s, high);
    }
}