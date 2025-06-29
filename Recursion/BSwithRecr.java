package Recursion;

public class BSwithRecr {
    public static void main(String[] args) {
        int[] num = {2,5,7,8,9,12,14};
        System.out.println(binarySearchRecr(num, 11, 0, num.length-1));
    }

    static int binarySearchRecr(int[] arr, int target,int start,int end){

        if (start > end) {
            return -1;
        }
        int mid = start + (end - start)/2;

        if (target == arr[mid]) {
            return mid;
        }

        if (target > arr[mid]) {
            return binarySearchRecr(arr, target, mid + 1, end);
        }
        return binarySearchRecr(arr, target, start, mid - 1);
    }
}
