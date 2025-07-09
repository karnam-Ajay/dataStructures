package Recursion;

import java.util.Arrays;

public class MergeSortRecr {
    public static void main(String[] args) {
        int [] arr = {4,3,6,7,8,9};
        arr = mergeWithRecr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeWithRecr(int[] arr){
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeWithRecr(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeWithRecr(Arrays.copyOfRange(arr,mid,arr.length));

        return mergeBoth(left,right);
    }

    static int[] mergeBoth(int[] first,int [] second){
        int [] mix = new int[first.length+second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length ) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // while comparing two arrays if any of the array size is bigger then we need to add elements at end
        // then Copy the remaining elements
        while(i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}