import java.util.ArrayList;

public class IceCream {
    private String name;
    private int cost;
    private int numScoops;
    private ArrayList<String> toppings;

    public IceCream(String name, int cost, int numScoops) {
        this.name = name;
        this.cost = cost;
        this.numScoops = numScoops;
        this.toppings = new ArrayList<>();
    }//end IceCream ctor

    public void addTopping(String topping) {
        toppings.add(topping);
    }//end addTopping

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getNumScoops() {
        return numScoops;
    }

    public void printToppings() {
        for(String topping : toppings) {
            System.out.println("\t" + topping);
        }//end for
    }//end printToppings
}//end class















