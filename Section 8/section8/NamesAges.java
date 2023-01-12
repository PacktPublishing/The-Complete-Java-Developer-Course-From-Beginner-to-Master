import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class NamesAges {
    public static void main(String[] args) {
        Scanner namesFile;
        Scanner agesFile;
        PrintWriter pw;

        try {
            namesFile = new Scanner(new File("student_names.txt"));
            agesFile = new Scanner(new File("student_ages.txt"));
            pw = new PrintWriter("names_ages.txt");

            String tempName;
            int tempAge;

            while(namesFile.hasNext()) {
                tempName = namesFile.nextLine();
                tempAge = agesFile.nextInt();

                pw.println(tempName + " is " + tempAge + " years old.");
            }//end while

            namesFile.close();
            agesFile.close();
            pw.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }//end try-catch
    }//end main
}
