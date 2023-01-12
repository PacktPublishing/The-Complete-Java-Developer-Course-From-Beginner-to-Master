import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circleList;
        circleList = new ArrayList<>();

        fillArrayList(circleList);
        printCircles(circleList);

    }//end main

    private static void fillArrayList(ArrayList<Circle> circleAL) {
        Scanner infile;

        try {
            infile = new Scanner(new File("circle_data.txt"));
            Circle temp;
            double radius;

            while(infile.hasNext()) {
                radius = infile.nextDouble();
                temp = new Circle(radius);
                circleAL.add(temp);
            }//end while

            infile.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Error accessing file!");
        }//end try-catch
    }//end fillArrayList

    private static void printCircles(ArrayList<Circle> circleAL) {
        PrintWriter pw;

        try {
            pw = new PrintWriter("circles_output.txt");
            for(Circle c : circleAL) {
                System.out.println("Radius: " + c.getRadius());
                System.out.println("Circumference: " + c.circumference());
                System.out.println("Area: " + c.area());
                System.out.println();

                pw.println("Radius: " + c.getRadius());
                pw.println("Circumference: " + c.circumference());
                pw.println("Area: " + c.area());
                pw.println();
            }//end for

            pw.close();
        }
        catch(FileNotFoundException ex) {
            System.out.println("Couldn't access file.");
        }//end try-catch
    }//end printCircles
}










