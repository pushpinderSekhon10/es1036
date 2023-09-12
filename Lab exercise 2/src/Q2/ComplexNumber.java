/*
Pushpinder Sekhon
251291426
March 3, 2023
This is complexNumber class that has methods and fields, method which add and multiply the values of complex numbers
 */



package Q2;//indicates package

public class ComplexNumber//complexNumber class
{
    private double real;//field called real
    private double imaginary;//field called imaginary

    public ComplexNumber()//constructor which is when no values are given
    {
        real = 0;//sets real to 0
        imaginary = 0;//sets imaginary to 0
    }

    public ComplexNumber(double re,double im)//constructor which accepts two different doubles
    {
        real = re;//sets value to first double inputted
        imaginary = im;//sets value to second value inputted

    }

    public double getReal()//getter method used to get the value of the real number part
    {
        return real;//returns the real number part
    }

    public double getImaginary()//getter method used to get the value of the imaginary number part
    {
        return imaginary;//returns imaginary number part
    }

    public double getMagnitude()//getter method used to get the magnitude
    {
        double magnitude = Math.sqrt(Math.pow(real,2) + Math.pow(imaginary,2));//uses math to determine magnitude
        return magnitude;//returns magnitude
    }

    public double getAngle()//getter method used to get the angle from the object
    {
        double angle = Math.toDegrees(Math.atan2(imaginary,real));//uses math to find the value of the angle
        return angle;//returns the value of the angle
    }

    public void displayRecForm()//displays the values in complex number from
    {
        System.out.printf("%.2f + %.2fi",real,imaginary);//prints in complex number form
    }

}
