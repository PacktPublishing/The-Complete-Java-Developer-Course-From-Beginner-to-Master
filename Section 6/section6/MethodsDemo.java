

public class MethodsDemo {
    public static void main(String[] args) {
        printHello();
        printNumber(10);  //argument 10 is passed in
        int result = giveMe10();
        double dResult;
        System.out.println(result);

        result = addThese(3, 5);  //arguments 3 and 5 passed in
        System.out.println(result);

        dResult = square(5.5);
        System.out.println(dResult);

        System.out.println(square(7.25));

    }//end main

    //void, parameterless
    public static void printHello() {
        System.out.println("Hello there!");
    }//end printHello

    //void, parameterized
    public static void printNumber(int a) {
        System.out.println("The number is " + a);
    }//end printNumber

    //value-returning, parameterless
    public static int giveMe10() {
        return 10;
    }//end giveMe10

    //value-returning, parameterized
    public static int addThese(int num1, int num2) {
        return num1 + num2;
    }//end addThese

    public static double square(double num) {
        return num * num;
    }//end square
}
