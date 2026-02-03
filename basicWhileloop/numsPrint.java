public class numsPrint{
    public static void main(String[] args) {
        // printNums();
        //printNumsReverse();
        evensOneto100();
    }

    static void printNums(){
        int i = 1;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
    }

    static void printNumsReverse(){
        int i1 = 10;
        while(i1 >= 1){
            System.out.println(i1);
            i1--;
        }
    }

    static void evensOneto100(){
        int num = 2;
        while (num <= 100) {
            int i2 = 2;
            boolean isPrime = true;
            while (i2 <= num /2) {
                if (num % i2 == 0) {
                    isPrime = false;
                    break;
                }
                i2++;
            }
            if(isPrime){
                System.out.println(num + "");
            }
            num++;
        }
    }
}