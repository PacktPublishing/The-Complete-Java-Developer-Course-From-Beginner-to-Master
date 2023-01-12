

public class StringMethods1 {
    public static void main(String[] args) {
        String name = "John Baugh";
        String name2 = "John Baugh";
        String name3 = "Rob Percival";
        String challengeName = "Ed Mortram";

        for(int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }//end for

        System.out.println();

        if(name.equals(name2)) {
            System.out.println("Names are equal.");
        }
        else {
            System.out.println("Names aren't equal.");
        }

        if(name.compareTo(name3) > 0) {
            System.out.println("name > name3");
        }
        else {
            System.out.println("name <= name3");
        }

        System.out.println("Comparing for the lecture challenge");
        if (challengeName.compareTo(name) > 0) {
            System.out.println(challengeName + " is greater than " + name);
        }
        else {
            System.out.println(challengeName + " is less than or equal to " + name);
        }
    }//end main
}
