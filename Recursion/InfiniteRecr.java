package Recursion;

public class InfiniteRecr {
    public static void main(String[] args) {
        infintRecr(5);
    }

    static void infintRecr(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        //below code will run infinte times, since it is first assigning and then subtracting
        // infintRecr(n--);

        // Instead we can do like below
        infintRecr(--n);
    }
}