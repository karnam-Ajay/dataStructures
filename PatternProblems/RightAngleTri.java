package PatternProblems;

//Steps
// 1. Run the outer loop for number of rows (no.of lines = no.of rows = no.of times the OUTER loop will RUN)
//2. Identify for every row number:
// a). how many columns are there and type of columns present (ex: *, numbers etc.,)
// 3. What do you need to print for every element

public class RightAngleTri{
    public static void main(String[] args) {
        rightAnglePattern(4);
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
}