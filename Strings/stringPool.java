package Strings;


// String Pool : It is a seperate memory structure created for Strings
// Why?: String pool avoids creating same objects with different reference variables
// It will optimize the program
//Strings are immutable in java (for security reasons we cannot change string object)


public class stringPool {

    public static void main(String[] args) {
        //comparision of same objects with different ref.variables
        String a = "Ajay";
        String b = "Ajay";
        // here "==" will check the ref.vars are pointing to same object or not
        System.out.println(a == b); //True

        // how to create diff objects with same value

        // it will create two diff objects outside String Pool
        String str1 = new String("Sachin");
        String str2 = new String("Sachin");
        System.out.println(str1 == str2); //False
    }
}