package Q3;
/*
Pushpinder Sekhon
251291426
January 29, 2023
ask is to calculate course grades
 */
import java.util.Scanner;
// Imports scanner to get inputs from user
public class GradeCalc
{
    public static void main(String[] args)
    {
        System.out.println("Name: Pushpinder Sekhon");
        System.out.println("Student Number: 251291426");
        System.out.println("Date: January 29, 2023");
        System.out.println("Brief description of the task: Task is to calculate course grades");
        //Above prints name, student number and date

        double GRD1_WGT = 0.2;
        double GRD2_WGT = 0.3;
        double GRD3_WGT = 0.5;
        double grade1 = 0;
        double grade2 = 0;
        double grade3 = 0;
        double courseGrade = 0;
        //Initialises all variables as 0 to prevent logical errors

        Scanner keyboard = new Scanner(System.in);
        //Allows users to input

        System.out.print("Input the first grade: ");
        grade1 = keyboard.nextDouble();
        //Asks for first grade then records it as a variable

        System.out.print("Input the second grade: ");
        grade2 = keyboard.nextDouble();
        //Asks for second grade then records it as a variable

        System.out.print("input the third grade: ");
        grade3 = keyboard.nextDouble();
        //Asks for third grade then records it as a variable


        courseGrade =  grade1*GRD1_WGT + grade2*GRD2_WGT + grade3*GRD3_WGT;
        // Uses formula provided to find course grade

        System.out.printf("The course grade is: " + "%.2f", courseGrade);
        // Prints final course grade




    }
}
