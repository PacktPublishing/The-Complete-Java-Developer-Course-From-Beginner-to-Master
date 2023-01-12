import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        //2 row x 3 column
        int[][] my2DArray = new int[2][3];  //2 rows x 3 columns

        fill2DArray(my2DArray);
        print2DArray(my2DArray);
        System.out.println();
        twice2DArray(my2DArray);
        print2DArray(my2DArray);
    }//end main

    public static void fill2DArray(int[][] twoDArr) {
        Random rand = new Random();

        for(int i = 0; i < twoDArr.length; i++) {
            for(int j = 0; j < twoDArr[i].length; j++) {
                //randomize 0 through 99 (inclusive)
                //row i, column j
                twoDArr[i][j] = rand.nextInt(100);  //0 ... 99 (inclusive)
            }
        }//end for i
    }//end fill2DArray

    public static void print2DArray(int[][] twoDArr) {
        for(int[] arr : twoDArr) {
            for(int num : arr) {
                System.out.print(num + " ");
            }//end of inner for loop
            System.out.println();
        }
    }//end print2DArray

    public static void twice2DArray(int[][] twoDArr) {
        for(int i = 0; i < twoDArr.length; i++) {
            for(int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j] *= 2;
            }//end for j
        }//end for i
    }//end twice2DArray
}
