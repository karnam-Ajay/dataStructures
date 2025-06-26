package BinarySearch;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(sqrt(8));
    }

    static int sqrt(int n){
        int start = 1;
        int end = n/2;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start)/2;
            long square = (long) mid * mid;

            if (square == n) {
                return mid;
            }else if(square < n){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return ans;
    }
}