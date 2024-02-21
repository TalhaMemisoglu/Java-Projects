package Project2;

import java.util.Scanner;

public class Circle extends Shape {
    //Data Fields
    /**The radius of the rectangle. */
    private double radius = 0;
    /**The pi number. */
    public static final double PI = 3.1415;

    //Constructors
    public Circle(){
        super("Circle");
    }

    /**Constructs a circle of the specified size.
     * @param radius the width
     */

    public Circle(double radius){
        super("Circle");
        this.radius = radius;
    }

    //Methods
    /**Get the radius
     * @return The radius
     */
    public double getRadius(){
        return radius;
    }
    /**Compute the area.
     * @return The area of the circle.
     */
    @Override
    public double computeArea(){
        return radius*radius*PI;
    }

    /**Compute the perimeter. 
     * @return The perimeter of the circle
    */
    @Override
    public double computePerimeter(){
        return 2 * radius * radius * PI;
    }

    /**Read the attributes of the circle. */
    @Override
    public void readShapeData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        radius = in.nextDouble();
    }

    /**Create a string representation of the circle
     * @return A String representatiın of the circle
     */
    @Override
    public String toString()
    {
        return super.toString() + ":radius is " + radius;
    }
}
