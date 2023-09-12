package Q2;//indicates package
import LA3Q.MyMethod;//allows us to use MyMethod

public class RightCylinder extends Geometric3DObject implements VolumeOf3DObjectsInterface//indicates child class with parent Geometric3DObject and implements VolumeOf3DObjectsInterface
{
    public RightCylinder()//constructor method with no body
    {

    }

    public RightCylinder(double r, double h)//constructor with argument
    {
        super(r,h);//calls constructor of parent class

    }

    public double getVolume()//method to get volume
    {
        double volume = (MyMethod.PI)*(MyMethod.myPow(super.getR(),2))*super.getH();//formula for volume
        return volume;//returns the volume

    }

    public double getArea()//method which gets area
    {
        double area = 2*(MyMethod.PI)*(super.getR())*(super.getR()+super.getH());//formula for surface area
        return area;//returns area
    }

    public String toString()//overridden toString() method
    {
        String rh = super.toString();//reference to toString() method of parent class
        return String.format(rh + "\nCylinder Volume = %.2f cubic cm\nCylinder SurfaceArea = %.2f square cm",getVolume(),getArea());//calls parent toString() method then prints surface area and volume of it's own
    }



}
