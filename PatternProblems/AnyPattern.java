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
    //    invertedNumpattern(5);
    // verticalPyramidOfNums(8);
    // rhombusPattern(5);
    numbersPyramid(5);
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


    //Print the below pattern
    // *
    // **
    // ***
    // ****
    // *****
    // ****
    // ***
    // **
    // *
    static void verticalPyramid(int n){
        for (int row = 1; row <= 2*n; row++) {
            int totalNoOfColsInRow = (row > n) ? 2*n - row : row ;
            for (int col = 1; col <= totalNoOfColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    

    // Print Below pattern
    
        // 1 
        // 1 2 
        // 1 2 3 
        // 1 2 3 4 
        // 1 2 3 4 5 
        // 1 2 3 4 5 6 
        // 1 2 3 4 5 6 7 
        // 1 2 3 4 5 6 7 8 
        // 1 2 3 4 5 6 7 
        // 1 2 3 4 5 6 
        // 1 2 3 4 5 
        // 1 2 3 4 
        // 1 2 3 
        // 1 2 
        // 1
        static void verticalPyramidOfNums(int n){
        for (int row = 1; row <= 2*n; row++) {
            int totalNoOfColsInRow = (row > n) ? 2*n - row : row ;
            for (int col = 1; col <= totalNoOfColsInRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    //rhombus pattern
        //     * 
        //    * * 
        //   * * * 
        //  * * * * 
        // * * * * * 
        //  * * * * 
        //   * * * 
        //    * * 
        //     * 
    static void rhombusPattern(int n){
        for (int row = 1; row <= 2 * n; row++) {
            int totalNoOfColsInRow = (row > n) ? 2*n - row : row;
            int noOfSpaces = n - totalNoOfColsInRow;
            for (int spaces = 0; spaces < noOfSpaces; spaces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= totalNoOfColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//Print below pattern
//      1
//     212
//    32123
//   4321234
//  543212345

    static void numbersPyramid(int n){
        for (int row = 1; row <= n; row++) {
            // spaces printing
            for (int spaces = 0; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }

           for (int col = row; col >=1; col--) {
            System.out.print(col);
           }
           for (int col = 2; col <= row; col++) {
            System.out.print(col);
           }
           System.out.println();
        }
    }
}