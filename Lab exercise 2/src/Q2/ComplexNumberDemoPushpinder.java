/*
Pushpinder Sekhon
251291426
March 3, 2023
This is a complex number demo used to set the value of some complex numbers and also to perform some math operations on them ant then display those numbers
 */



package Q2;//indicates package
import Q1.StudentGradesByPushpinder;//imports the methods from the previous valss in a different package
import java.util.*;//imports different packages
public class ComplexNumberDemoPushpinder//sets class
{
    public static Scanner keyboard = new Scanner(System.in);//initialises scanner as field
    public static int counter = 0;//sets the counter variable so that it can be used in all different methods in the program
    public static ComplexNumber dataEntry()//data entry method used to display questions which prompt user to input data
    {
        counter++;//increases value of the counter by 1
        System.out.printf("\nComplex number %d data......\n",counter);//prints the number of the data

        System.out.printf("Enter the real term:");//prompts user to input value
        double realPart = keyboard.nextDouble();//records next inputted double as variable realPart

        System.out.printf("Enter the imaginary term:");//prompts user to input value
        double imaginaryPart = keyboard.nextDouble();//records next inputted value as

        return new ComplexNumber(realPart,imaginaryPart);//returns value of complex number

    }

    public static ComplexNumber complexMultiplier(ComplexNumber x,ComplexNumber y)//method used to multiply complex numbers
    {

        double newReal = x.getReal()*y.getReal() - x.getImaginary()*y.getImaginary();//new real set using formula porvided
        double newImaginary = x.getImaginary()*y.getReal() + x.getReal()*y.getImaginary();//new imaginary set using formula provided
        return new ComplexNumber(newReal,newImaginary);//returns a new complex number object




    }

    public static ComplexNumber complexAdder(ComplexNumber x,ComplexNumber y )//method used to add complex numbers
    {
        double newReal = x.getReal() + y.getReal();//formula given
        double newImaginary = x.getImaginary() + y.getImaginary();//formula given
        return new ComplexNumber(newReal,newImaginary);//constructor method



    }

    public static void main(String[] Args)//driver method
    {
        StudentGradesByPushpinder.myHeader(2,2,"the purpose of this program is to do different applications to different complex numbers, like addition and subtraction");//header from different package

        ComplexNumber x = new ComplexNumber();//reference variable
        ComplexNumber y = new ComplexNumber();//reference variable

        x = dataEntry();//use data entry to set values for variables
        y = dataEntry();//use data entry to set values for variables

        System.out.print("\nYou have entered the following two complex numbers x and y:");//print statement

        System.out.print("\nx = ");//statment
        x.displayRecForm();//display using method defined in complexNumber class

        System.out.print("\ny = ");//prints statment
        y.displayRecForm();//display using method defined in complexNumber class

        ComplexNumber addRes = complexAdder(x,y);//new reference variable

        System.out.println("\n\nHere are the results for the arithmetic operations: ");//prints statement

        System.out.print("\nx + y = ");//prints statement
        addRes.displayRecForm();//display using method defined in complexNumber class
        System.out.printf(", Magnitude: %.2f, Angle: %.2f degrees",addRes.getMagnitude(), addRes.getAngle());//prints statement

        ComplexNumber mulRes = complexMultiplier(x,y);//new reference variable
        System.out.print("\nx * y = ");//prints statement
        mulRes.displayRecForm();//display using method defined in complexNumber class
        System.out.printf(", Magnitude: %.2f, angle: % .2f degrees\n\n",mulRes.getMagnitude(),mulRes.getAngle());//prints statement

        StudentGradesByPushpinder.myFooter(2);//uses myFooter method previously made






    }
}
