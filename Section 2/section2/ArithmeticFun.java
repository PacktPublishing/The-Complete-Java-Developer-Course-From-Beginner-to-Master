

public class ArithmeticFun {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        //e.g., BINARY operators
        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("result is " + result);
        System.out.println("diff is " + difference);
        System.out.println("product is " + product);
        System.out.println("quotient is " + quotient);
        System.out.println("remainder is " + remainder);

        result += 20;   //result = result + 20
        System.out.println("result is now " + result);

        //UNARY operators
        result++;   //++result;
        System.out.println("result++  " + result);

        result--;   //--result;
        System.out.println("result--  " + result);

        product *= 2;   //product = product * 2;
        System.out.println("final value of product is " + product);
    }
}
