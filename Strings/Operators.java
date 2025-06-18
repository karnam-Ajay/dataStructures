package Strings;

public class Operators {

    public static void main(String[] args) {
        // unicode or ASCII value
        System.out.println('a' + 'b'); //195
        System.out.println("a" + "b"); //ab
        System.out.println('a' + 3); // 100
        // Type casting into char
        System.out.println((char) ('a' + 3)); // d
    }
}