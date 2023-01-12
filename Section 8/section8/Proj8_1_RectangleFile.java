import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleList;
        rectangleList = new ArrayList<>();

        fillArrayList(rectangleList);
        printRectangles(rectangleList);

    }//end main

    public static void fillArrayList(ArrayList<Rectangle> rectangleAL) {
        Scanner infile;

        try {
            infile = new Scanner(new File("rectangle_data.txt"));
            Rectangle temp;
            double length;
            double width;

            while(infile.hasNext()) {
                length = infile.nextDouble();
                width = infile.nextDouble();
                temp = new Rectangle(length, width);
                rectangleAL.add(temp);
            }//end while

            infile.close();  //close the file!
        }
        catch(FileNotFoundException ex) {
            System.out.println("Error accessing file!");
        }//end try-catch
    }//end fillArrayList

    public static void printRectangles(ArrayList<Rectangle> rectangleAL) {
        for(Rectangle r : rectangleAL) {
            System.out.println("Length: " + r.getLength());
            System.out.println("Width: " + r.getWidth());
            System.out.println("Area: " + r.area());
            System.out.println("Perimeter: " + r.perimeter());
            System.out.println();
        }//end for
    }//end printRectangles
}
















