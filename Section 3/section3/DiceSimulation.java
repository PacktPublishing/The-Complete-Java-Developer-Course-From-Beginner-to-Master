import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random random = new Random();

        int diceVal;

        for(int i = 0; i < 10; i++) {
            diceVal = random.nextInt(6) + 1;
            System.out.println(diceVal);
        }//end for
    }//end main
}
