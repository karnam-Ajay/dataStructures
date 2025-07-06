package SortingAlgos;

import java.util.Arrays;

public class InsertionSort{
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        InsertionSrt(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Insertion Sort: it sorts the array in partial manner
    // why Insertion sort:
    //1.Steps gets reduced if array is sorted
    //2.Works well with paritally sorted arrays,becuz of this it is used in hybrid sorting algos.
    //3.Stable and Used for smaller values of N 
    static void InsertionSrt(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            // here j loop checks whether it's previous element is less than present element if yess the it swaps, else break
            for (int j = i +1; j >0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr,j,j - 1);
                }else{
                    break;
                }
            }
        }
    }

    static void swap(int[] arr,int first,int second ){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}