public class HouseDemo {
    public static void main(String[] args) {
        House myHouse = new House();
        House yourHouse = new House(3, 10, "blue");

        myHouse.setNumStories(2);
        myHouse.setNumWindows(6);
        myHouse.setColor("red");

        printHouseData(myHouse);
        System.out.println();
        printHouseData(yourHouse);
//        yourHouse.setNumStories(3);
//        yourHouse.setNumWindows(10);
//        yourHouse.setColor("blue");

//        System.out.println("My house is " + myHouse.getColor() +
//                " and has " + myHouse.getNumStories() + " stories and " +
//                myHouse.getNumWindows() + " windows.");
//        System.out.println();
//
//        System.out.println("Your house is " + yourHouse.getColor() +
//                " and has " + yourHouse.getNumStories() + " stories and " +
//                yourHouse.getNumWindows() + " windows.");
    }//end main

    public static void printHouseData(House house) {
        System.out.println("The house is " + house.getColor() +
                "\nand has " + house.getNumStories() + " stories and " +
                "\n" + house.getNumWindows() + " windows.");
    }//end printHouseData
}//end HouseDemo
