package PatternProblems;

//Steps
//1. Run the outer loop for number of rows (no.of lines = no.of rows = no.of times the OUTER loop will RUN)
//2. Identify for every row number:
//a). how many columns are there and type of columns present (ex: *, numbers etc.,)
//3. What do you need to print for every element

public class AnyPattern{
    public static void main(String[] args) {
       // rightAnglePattern(4);
       //rectanglePattern(5);
       //invertedRightTriangle(7);
       //numberPattern(5);
       invertedNumpattern(5);
    }

    static void rightAnglePattern(int n){
        for (int row = 1; row <= n; row++) {
            // for every row , run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add new line
            System.out.println();
        }
    }

    static void rectanglePattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();             
        }
    }
    //  *****
    //  ****
    //  ***
    //  **
    //  *
    static void invertedRightTriangle(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 0; col <= (n-row); col++) {             
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print below pattern
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5

    static void numberPattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


    // Print below Pattern
    // 1 2 3 4 5 
    // 1 2 3 4 
    // 1 2 3 
    // 1 2 
    // 1
    static void invertedNumpattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=(n - row + 1); col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    
}