package Recursion;

public class ReverseNumRecr {
       static int sum = 0;
    public static void main(String[] args) {
        // ReverseNum(1234);
        // System.out.println(sum);
        // System.out.println(ReverseNum1(1234));
    //    System.out.println(Palindrome(12321));
    System.out.println(zerosCount(0));
    }

    // Method 1, by creating a static variable outside the method
    static void ReverseNum(int n){
        
        if(n == 0){
            return;
        }

        int rem = n % 10;
        sum = sum * 10 + rem;
        ReverseNum(n/10);
    }

    //Method 2
    static int ReverseNum1(int n){
        //Sometimes you might need some additional arguments in the function
        // so create one helperFunction
        int digits = (int) (Math.log10(n)) + 1;
        return helperFunction(n,digits);
    }

    static int helperFunction(int n,int digits){
        if(n % 10 == n){
            return n;
        }
        // here we can get last digit
        int rem = n % 10;
        // we will multiply reminder * 10v powers to digits place & adding it with remaining digits
       return rem * (int) (Math.pow(10, digits -1)) + helperFunction(n/10, digits - 1);
    }


    // check given number is palindrome or not

    static boolean Palindrome(int n){
        return n == ReverseNum1(n);
    }


    // Count number of Zeros

    static int zerosCount(int n){
        return helper(n,0);
    }

     static int helper(int n,int count){
        if (n == 0) {
            return count;
        }

        if (n % 10 == 0) {
            return helper(n/10,count+1);
        }
        return helper(n/10, count);
        
    }
    
}