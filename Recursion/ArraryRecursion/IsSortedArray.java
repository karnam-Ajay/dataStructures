package Recursion;

public class IsSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,8,4};
       System.out.println(isSorted(nums, 0));
    }

    static boolean isSorted(int [] arr,int start){

        if (start == arr.length - 1) {
            return true;
        }
      return arr[start] < arr[start + 1] && isSorted(arr, start + 1);
    }
}