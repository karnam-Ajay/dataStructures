
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,4,4,7,9};
        // System.out.println(linearSrch(arr, 8, 0));  //false
        // System.out.println(linearSrchIdx(arr, 4, 0)); //2
        // System.out.println(LinearSearchLast(arr, 6, arr.length - 1));  //3
        // SearchMultipleIndexes(arr, 2, 0);
        // System.out.println(list);
        // System.out.println(SearchWithArrList(arr, 4, 0, new ArrayList<>())); // [2,3]
       ArrayList<Integer> res = SearchWithoutArrListInArgs(arr,4,0);
        System.out.println(res);
    }

    // Linear Search with Recursion
    // to check target is there or not
    static boolean linearSrch(int[] arr,int target,int index){
        if (index == arr.length) {
            return false;
        }
        return (arr[index] == target) || linearSrch(arr, target, index+1);
    };

    // To return the required target index
    static int linearSrchIdx(int[] arr,int target,int index){
        // if the target element is not there in the array just return -1
        if (index == arr.length) {
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
            return linearSrchIdx(arr, target, index + 1);
        }
    };

    // To check from Last index

    static int LinearSearchLast(int[] arr,int target,int index){
        if (index == -1) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }else{
            return LinearSearchLast(arr, target, index - 1);
        }
    }


    // Find the index poisitons if target is present at more than one time
   static ArrayList<Integer> list = new ArrayList<>();
    static void SearchMultipleIndexes(int[] arr, int target,int index){
        if (index == arr.length) {
            return;
        }

        if (arr[index] == target) {
            list.add(index);
        }
        SearchMultipleIndexes(arr, target, index + 1);
    }

    // By taking the list inside function argumet

    static ArrayList<Integer> SearchWithArrList(int[] arr,int target,int index,ArrayList<Integer> list){
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
             list.add(index);
        }
        
        return SearchWithArrList(arr, target, index + 1, list);
    }

    // Program to find an element in an array using ArrayList inside the function body
    static ArrayList<Integer> SearchWithoutArrListInArgs(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowList = SearchWithoutArrListInArgs(arr,target,index + 1);
        list.addAll(ansFromBelowList);
        return list;
    }
}