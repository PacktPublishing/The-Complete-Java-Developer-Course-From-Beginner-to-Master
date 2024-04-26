
public class Worker extends Employee {

    public Worker(String first, String last, int age) {
        super(first, last, age);
    }
    
    @Override
    public String work() {
         return "I'm busy getting work done!";
    }
    
}
