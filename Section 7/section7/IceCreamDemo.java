public class IceCreamDemo {
    public static void main(String[] args) {
        IceCream myIC = new IceCream("Chocolate", 3, 2);
        IceCream yourIC = new IceCream("Strawberry", 2, 1);

        myIC.addTopping("nuts");
        myIC.addTopping("cherries");

        yourIC.addTopping("sprinkles");

        printIC(myIC);
        printIC(yourIC);

    }//end main

    public static void printIC(IceCream icecream) {
        System.out.println(icecream.getName());
        System.out.println("Cost: $" + icecream.getCost());
        System.out.println("Topped with:");
        icecream.printToppings();
        System.out.println();  //extra space
    }//end printIC
}//end IceCreamDemo
