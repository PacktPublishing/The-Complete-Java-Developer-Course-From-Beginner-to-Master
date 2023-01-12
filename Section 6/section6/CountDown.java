
public class CountDown {
    public static void main(String[] args) {
        //countDownFrom(10);

        countUpTo(0, 10);
    }//end main

    public static void countDownFrom(int num) {
        if(num >= 0) {
            System.out.println(num);
            countDownFrom(num - 1);
        }
    }//end countDownFrom

    public static void countUpTo(int from, int to) {
        if(from <= to) {
            System.out.println(from);
            countUpTo(from + 1, to);
        }
    }//end countUpTo

}
