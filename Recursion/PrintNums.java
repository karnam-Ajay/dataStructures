package Recursion;

public class PrintNums {
    public static void main(String[] args) {
    //   printNo(5); 
    printNoRevr(5);
    }

    static void printNo(int n){
        if(n == 0){
           return;
        }
        System.out.println(n);
        printNo(n-1);
    }

    // to print the no's starting from 1,2..
    static void printNoRevr(int n ){
        if (n == 0) {
            return;
        }
        // to print in reverse order, first let the function execution happen then print number
        printNoRevr(n - 1);
        System.out.println(n);
    }
}