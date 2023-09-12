package Q2;//indicates package

public abstract class Geometric3DObject//indicates abstract class
{
    private double r;//sets field
    private double h;//sets field

    protected Geometric3DObject()//empty constructor
    {

    }

    protected Geometric3DObject(double r, double h)//constructor with arguments
    {
        this.r = r;//sets r to argument r
        this.h = h;//sets h to argument h

    }

    public double getR()//returns r
    {
        return this.r;//returns value of r
    }

    public double getH()//returns h
    {
        return this.h;//returns value of h
    }

    public abstract double getArea();//abstract field, no body

    public String toString()//toString method, prints radius and height
    {
        return String.format("Given: Radius = %.2f cm, Height = %.2f cm" , r, h);//prints the radius and height values
    }

}
