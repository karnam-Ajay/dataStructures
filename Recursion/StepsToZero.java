package Recursion;

public class StepsToZero {

    public static void main(String[] args) {
        System.out.println(stepsToZero(14));
    }

    //No of Steps to reduce a Number to Zero
    static int stepsToZero(int n){
        return helper(n,0);
    }

    static int helper(int n,int count){
        if (n == 0) {
            return count;
        }
        if (n % 2 != 0) {
            return helper(n-1, count + 1);
        }

        return helper(n/2, count + 1);
    }
}