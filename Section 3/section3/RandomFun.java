import java.util.Random;

public class RandomFun {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("number is:\t" + myRandomNumber);

        myRandomNumber = random.nextInt(1000);  //0 - 999
        System.out.println("0 through 999?\t" + myRandomNumber);

        //shifting
        myRandomNumber = random.nextInt(1000) + 1;  //1 - 1000
        System.out.println("1 through 1000?\t" + myRandomNumber);

    }//end main
}
