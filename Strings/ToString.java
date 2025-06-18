package Strings;

import java.util.Arrays;

public class ToString {

    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("Ajay");
        //To print array we need to use Arrays.toString() method to override the default method toString of String class
        System.out.println(Arrays.toString(new int[] {1,2,4,5,6}));
        // we can print null value also 
        String name = null;
        System.out.println(name);
    }
}