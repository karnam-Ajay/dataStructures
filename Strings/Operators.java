package Strings;
import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {
        // unicode or ASCII value
        System.out.println('a' + 'b'); //195
        System.out.println("a" + "b"); //ab
        System.out.println('a' + 3); // 100
        // Type casting into char
        System.out.println((char) ('a' + 3)); // d

        System.out.println("Ajay" + new ArrayList<>()); // Ajay[]
        // System.out.println("Ajay" + new Integer(56)); // Ajay56

        // **
        // String concatination only can happen if one of the values which are being added must be a string
        // Operators (ex "+") in strings can be added only with atleast one string value.
        // so below console will throw an error
        //System.out.println(new Integer(58) + new ArrayList<>());
    }
}