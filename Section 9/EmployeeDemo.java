
import java.util.Random;


public class EmployeeDemo {
    
    private enum EmployeeType {
        WORKER, 
        MANAGER
    }
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
           
        for(int i = 0; i < 5; i++) {
            EmployeeType et = getEmployeeType();
            Employee currentEmployee;
            
            if(et == EmployeeType.WORKER) {
                currentEmployee = new Worker("Will", "Jones", 20);
            }
            else {
                currentEmployee = new Manager("Sam", "Jones", 38);
            }
            
            employees[i] = currentEmployee;
        }//end for creating employees
        
        for(Employee employee : employees) {
            System.out.println("Name: " + employee.getFirstName() +
                    " " + employee.getLastName() + ", age " + 
                    employee.getAge() + " says , " );
            System.out.println("\t" + employee.work() + "\n");
        }//end for
        
    }//end main
    
    public static EmployeeType getEmployeeType() {
        EmployeeType result;
        
        Random rand = new Random();
        final int UPPER_BOUND = 2;
        int whichOne = rand.nextInt(UPPER_BOUND);
        
        if(whichOne == 0) {
            result = EmployeeType.WORKER;
        }
        else {
            result = EmployeeType.MANAGER;
        }
          
        return result;
    }
}
