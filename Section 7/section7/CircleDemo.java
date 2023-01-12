
public class CircleDemo {
  public static void main(String[] args) {
    Circle unitCircle = new Circle();
    Circle myCircle = new Circle(5);
    Circle yourCircle = new Circle(12.75);

    printCircleData(unitCircle);
    printCircleData(myCircle);
    printCircleData(yourCircle);
  }//end main

    public static void printCircleData(Circle circle) {
      System.out.println("r = " + circle.getRadius());
      System.out.println("C = " +
              String.format("%.2f",circle.circumference())
      );
      System.out.println("A = " +
              String.format("%.2f", circle.area())
      );
      System.out.println();
    }//end printCircleData
}//end CircleDemo
