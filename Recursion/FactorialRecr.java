package Recursion;

public class FactorialRecr {
    public static void main(String[] args) {
        // System.out.println(factorial(6));
        System.out.println(prodOfDgts(505));
    }

    static int factorial(int n){
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Sum of digits

    static int sumOfDgts(int n){
        if (n == 0) {
            return 0;
        }
        return (n%10) + sumOfDgts(n/10);
    }

    // Product Of digits
    static int prodOfDgts(int n){
        // if an one digit of given number is 0 then return 0
        if (n % 10 == n) {
            return n;
        }

        return (n%10) * prodOfDgts(n/10);
    }
}
