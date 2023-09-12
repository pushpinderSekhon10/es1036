package Q2;//indicates package
import LA3Q.MyMethod;//imports MyMethod

public class RightCircularCone extends Geometric3DObject implements VolumeOf3DObjectsInterface//indicates class which is child class of Geometric3DObject and implements interface
{
    public RightCircularCone()//default constructor
    {

    }

    public RightCircularCone(double r, double h)//constructor with arguments
    {
        super(r,h);//calls parent method with arguments

    }

    public double getArea()//method which gets the area
    {
        double area = ((MyMethod.PI)*(super.getR()))*(super.getR() + Math.sqrt((MyMethod.myPow(super.getH(),2) + MyMethod.myPow(super.getR(),2))));//formula for calculating the area
        return area;//returns the area

    }

    public double getVolume()//
    {
        double volume = ((MyMethod.PI)*MyMethod.myPow(super.getR(),2)*super.getH())/3;//formula for calculating volume
        return volume;//returns the volume

    }

    public String toString()//overridden toString() method
    {
        //reference variable to super class
        return String.format(super.toString() + "\nCone Volume = %.2f cubic cm\nCone Surface Area = %.2f square cm",getVolume(),getArea());//will use super classes toString() then will print it's own values of volume and area

    }




}
