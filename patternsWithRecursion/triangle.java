package patternsWithRecursion;

import java.util.Arrays;

public class triangle {
    public static void main(String[] args) {
    //    trianglePtrn(7, 0);
    // trianglePtrn2(4, 0);
    int[] arr ={4,3,2,1};
    selectionRecr(arr, arr.length, 0,0);
    System.out.println(Arrays.toString(arr));
    }

    static void trianglePtrn(int row,int col){
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("*");
            trianglePtrn(row,col+1);
        }else{
            System.out.println();
            trianglePtrn(row - 1,0);
        }
    }

    // *
    // **
    // ***
    // ****

    static void trianglePtrn2(int row,int col){
        if (row == 0) {
            return;
        }
        if (col < row) {
            trianglePtrn2(row,col + 1);
             System.out.print("*");
        }else{
            trianglePtrn2(row - 1, 0);
            System.out.println();
        }
    }

    //bubble sort with recursion
    static void bubbleRecr(int[] arr,int r,int c){
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c+1]) {
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubbleRecr(arr, r, c+1);
        }else{
            bubbleRecr(arr, r-1, 0);
        }
    }
  
    //Slection sort with recursion
    static void selectionRecr(int [] arr,int r,int c,int max){
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selectionRecr(arr, r, c+1, c);
            }else{
                selectionRecr(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            selectionRecr(arr, r - 1, 0, 0);
        }
    }
}