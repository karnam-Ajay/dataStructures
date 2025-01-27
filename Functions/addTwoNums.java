import java.util.Scanner;

public class addTwoNums {
    public static void main(String[] args) {
        int ans = sumOfTwo();
       System.out.println(ans);
    };

    //  function with a return type 

    static int sumOfTwo(){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter number one:");
        int num1 = scnr.nextInt();
        System.out.println("Enter number two:");
        int num2 = scnr.nextInt();
        int result = num1 + num2;
        // after return function will not execute furthur, it will end here
        return result;
    }


}