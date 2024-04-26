
public class Manager extends Employee {
    public Manager(String first, String last, int age) {
        super(first, last, age);
    }
    
    @Override
    public String work() {
        return "I'm busy bossing everyone around!";
    }
}
