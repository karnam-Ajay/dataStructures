package Recursion;

import java.util.Arrays;

// Merge Sort Alogorithm with Recursion
public class MergeSortRecr {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1 };
         mergeWithRecrInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeWithRecr(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeWithRecr(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeWithRecr(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeBoth(left, right);
    }

    static int[] mergeBoth(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // while comparing two arrays if any of the array size is bigger then we need to
        // add elements at end
        // then Copy the remaining elements
        while (i < first.length) {
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

  //Merge sort InPlace code with recursion
    static void mergeWithRecrInPlace(int[] arr,int s,int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e)/2;

        mergeWithRecrInPlace(arr,s,mid);
        mergeWithRecrInPlace(arr,mid,e);

        mergeBothInPlace(arr,s,mid,e);
    }

    static void mergeBothInPlace(int[] arr,int s,int mid,int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;

        while (i < mid && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // while comparing two arrays if any of the array size is bigger then we need to
        // add elements at end
        // then Copy the remaining elements
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for(int k2 = 0; k2 < mix.length; k2++) {
            arr[s+k2] = mix[k2];
        }
    }
}