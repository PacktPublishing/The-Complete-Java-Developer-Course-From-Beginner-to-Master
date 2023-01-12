
public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }//no arg ctor

    public Circle(double radius) {
        this.radius = radius;
    }//end ctor

    public double getRadius() {
        return radius;
    }//end getRadius

    public void setRadius(double radius) {
        this.radius = radius;
    }//end setRadius

    public double circumference() {
        return 2 * Math.PI * radius;
    }//end circumference

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }//end area
}//end Circle class
















