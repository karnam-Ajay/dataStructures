public class numsPrint{
    public static void main(String[] args) {
        // printNums();
        //printNumsReverse();
        //evensOneto100();
        // oddNums();
        //multiplicationTable(4);
        // sumOfFirstNaturalNums(100);
        sumOfAllEvenNoTilln(100);
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

    static void oddNums(){
        int odNm = 1;
        while(odNm <= 100){
            System.out.println(odNm);
            odNm += 2;
        }
    }

    static void multiplicationTable(int n){
        int multiples = 1;
        while (multiples <= 10) {
            System.out.println( n * multiples);
            multiples++;
        }
    }

    static void sumOfFirstNaturalNums(int n){
        int nums = 1;
        int sum = 0;
        while (nums <= n) {
            sum+=nums;
            nums++;
        }
        System.out.println(sum);
    }

    static void sumOfAllEvenNoTilln(int n){
        int eNums = 1;
        int eSum = 0;
        while(eNums <= n) {
            if (eNums % 2 == 0) {
                eSum+=eNums;
            }
            eNums++;
        }
        System.out.println(eSum);
    }


}