import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Samantha");
        names.add("John");
        names.add("Kyle");
        names.add("Heather");
        names.add("Luke");

        try {
            PrintWriter pw = new PrintWriter("names.txt");
            for(String name : names) {
                pw.println(name);
            }//end for

            pw.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Can't write to file!");
        }
    }//end main
}
