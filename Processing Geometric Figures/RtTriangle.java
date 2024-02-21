package Project2;

import java.util.Scanner;

public class RtTriangle extends Shape{
    //Data Fields
    /**The base of the RtTriangle. */
    private double base = 0;
    /**The height of the RtTriangle. */
    private double height = 0;

    //Constructors
    public RtTriangle(){
        super("RtTriangle");
    }

    /**Constructs a RtTriangle of the specified size.
     * @param base the base
     * @param height the height
     */
    public RtTriangle(double base, double height){
        super("RtTriangle");
        this.base = base;
        this.height = height;
    }

    //Methods
    /**Get the base.
     * @return The base
     */
    public double getBase(){
        return base;
    }
    /**Get the height
     * @return The height
     */
    public double getHeight(){
        return height;
    }
    /**Compute the area.
     * @return The area of the RtTriangle
     */
    @Override
    public double computeArea(){
        return (height * base)/2;
    }

    /**Compute the perimeter. 
     * @return The perimeter of the RtTriangle
    */
    @Override
    public double computePerimeter(){
        return height + base + Math.sqrt(height*height + base*base);
    }

    /**Read the attributes of the RtTriangle. */
    @Override
    public void readShapeData(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the RtTriangle");
        base = in.nextDouble();
        System.out.println("Enter the height of the RtTriangle");
        height = in.nextDouble();
    }

    /**Create a string representation of the RtTriangle.
     * @return A String representatiın of the RtTriangle
     */
    @Override
    public String toString()
    {
        return super.toString() + ":base is " + base + ", height is " + 
               height;
    }
}
