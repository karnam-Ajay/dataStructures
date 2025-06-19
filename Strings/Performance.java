package Strings;

public class Performance {

    // the below code will take time complexity of O(n2), and each time it will create a new object a,ab,abc..
    // so it is not a good approach to print alphabets, so we can use StringBuilder here
    public static void main(String[] args) {
        String series  = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }
        System.out.println(series);
    }
}