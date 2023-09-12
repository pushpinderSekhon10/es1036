package Q2;
/*
Pushpinder Sekhon
251291426
January 29, 2023
Task to display volume of cone
 */
import java.util.Scanner;
// Imports scanner to get inputs from user
public class ConeVolume
{
    public static void main(String[] args)
    {

        System.out.println("Name: Pushpinder Sekhon");
        System.out.println("Student Number: 251291426");
        System.out.println("Date: January 29, 2023");
        System.out.println("Brief description of the task: Task is to display volume of cone");
        //Above prints name, student number and date

        double volume = 0;
        double radius = 0;
        double height = 0;
        //Initialises all variables as 0 to prevent logical errors

        Scanner keyboard = new Scanner(System.in);
        //Allows users to input

        System.out.print("Please enter the height of a cone: ");
        height = keyboard.nextDouble();
        //Asks for height then records it as variable

        System.out.print("Please enter the radius of the cone: ");
        radius = keyboard.nextDouble();
        //Asks for radius then records it as variable

        volume = (Math.PI)*Math.pow(radius , 2)*height;
        volume =volume/3;
        /*
        Uses formula of the volume of circle
        Math.PI means pi
        Math.pow means using a power
        */

        System.out.printf("The volume of the cone with a radius " + radius + "cm and height " + height + "cm is: " + "%.2f", volume);
        System.out.printf(" cubic cm");
        //These two lines print final statement




    }
}
