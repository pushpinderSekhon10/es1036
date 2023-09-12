/*
Pushpinder Sekhon
251291426
February 5, 2023
The purpose of this program is to make an object representing a circle
 */

package Q1;//indicates package

public class Circle // indicates class Circle
{
    public double radius;// sets radius variable
    public void setRadius(double rad)//declares setRadius method
    {
        radius = rad;//sets value of radius
    }

    public double getRadius()//declares getRadius method
    {
        return radius;//returns the radius
    }

    public double getArea()//declares getArea method
    {
        double area = Math.PI*(Math.pow(radius,2));//uses math to determine area
        return area;//returns area
    }

    public double getDiameter()//declares getDiameter method
    {
        double diameter = radius*2;//uses math to determine diameter
        return diameter;//returns diameter
    }

    public double getCircumference()//declares getCircumference method
    {
        double circumference = 2*Math.PI*radius;//uses math to determine circumference
        return circumference;//returns circumference
    }



    
}
