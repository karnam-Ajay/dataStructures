package SubsetsAndSequences;

public class CharStream {

    public static void main(String[] args) {
        //skip("","bcaaddch");
        // System.out.println(skipStringWithReturn("bcaaddch"));
        // System.out.println(skipApple("bcappleddch"));
        System.out.println(skipAppNotApple("bcappddch"));
    }


    // without returning any string
    static void skip(String p,String up ){
        if (up.isBlank()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }

    //with returning a string
    static String skipStringWithReturn(String up){
        if (up.isBlank()) {
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            return skipStringWithReturn(up.substring(1));
        }else{
            return ch + skipStringWithReturn(up.substring(1));
        }
    }


    //skip  a string 

    static String skipApple(String up){
        if (up.isBlank()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    //skip app not apple
    static String skipAppNotApple(String up){
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !(up.startsWith("apple"))) {
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}