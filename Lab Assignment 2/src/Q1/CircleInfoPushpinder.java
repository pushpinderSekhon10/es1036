/*
Pushpinder Sekhon
251291426
February 5, 2023
The purpose of this program is to ask user for radius then output radius, diameter, circumference, and area
 */


package Q1;//indicates package
import java.util.*;//imports scanner among other things
public class CircleInfoPushpinder//sets class
{
    public static void main(String[] args)//driver method
    {
        myHeader(2,1,"The purpose of this program is to ask user for radius then output radius, diameter, circumference, and area");//calls myHeader method to print header

        Circle info = new Circle();//initialises circle class
        Scanner keyboard = new Scanner(System.in);//brings scanner into method


        System.out.printf("Enter circle radius: ");//prompts user for radius
        double radius = keyboard.nextDouble();//uses scanner to determine value of variable

        info.setRadius(radius);//sets radius in Circle class
        double area = info.getArea();//gets info from circle class
        double diameter = info.getDiameter();//gets info from circle class
        double circumference = info.getCircumference();//gets info from circle class

        System.out.printf("\nCircle info:\nRadius: %.3f cm\nArea: %.3f sq-cm\nDiameter: %.3f cm\nCircumference: %.3f cm\n", radius , area , diameter, circumference);//prints answer statement

        myFooter(1);//calls myFooter method to display footer

    }
    public static void myHeader(int labNum, int questionNum, String description)//creates new method
    {
        System.out.println("**********************************");
        System.out.printf("Full name: Pushpinder Sekhon\n");//prints name
        System.out.printf("Lab Assignment: %d ",labNum);//prints lab exercise number
        System.out.printf("Question: %d \n", questionNum);//prints question number
        System.out.printf("Program description: %s \n", description);//prints description of program
        System.out.println("**********************************");

    }
    public static void myFooter(int questionNumber)//creates new method
    {
        System.out.printf("\n*** Signing off from Question %d - Pushpinder Sekhon ***", questionNumber);//prints footer

    }
}
