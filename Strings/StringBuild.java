package Strings;

// StringBuilder in Java is a mutable (changeable) sequence of characters. 
// It is part of java.lang and is used to efficiently build and modify strings without creating new string objects every time.
public class StringBuild {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}