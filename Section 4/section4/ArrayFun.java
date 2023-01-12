
public class ArrayFun {
    public static void main(String[] args) {
        int[] myArray;
        myArray = new int[5];

        myArray[0] = 10;
        myArray[1] = 22;
        myArray[2] = 5;
        myArray[3] = 17;
        myArray[4] = 20;

//        for(int i = 0; i < myArray.length; i++) {
//            System.out.println(myArray[i]);
//        }//end for

        for(int num : myArray) {
            System.out.println(num);
        }
    }//end main
}
