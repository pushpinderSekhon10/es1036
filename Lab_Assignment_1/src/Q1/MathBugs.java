package Q1;
/*
Pushpinder Sekhon
251291426
January 29, 2023
Task to display RMS value of integer and also display different digits of integer depending on their thousands, hundreds, tens, and ones values
 */
import java.util.Scanner;
public class MathBugs
{
    public static void main(String[] args)
    {
        System.out.println("Name: Pushpinder Sekhon");
        System.out.println("Student Number: 251291426");
        System.out.println("Date: January 29, 2023");
        System.out.println("Brief description of the task: Task is to display RMS value of integer and different digits of integer");
        //Above prints name, student number and date

        System.out.print("Enter a number between 1111 and 9999, which contains no zeroes: ");
        //Asks user for an input

        Scanner keyboard = new Scanner(System.in);
        //Allows user to input

        int number = 0;
        double rms = 0;
        int thousandsDigit = 0;
        int hundredsDigit = 0;
        int tensDigit = 0;
        int onesDigit = 0;
        //Initialises all variables as 0 to prevent logical errors

        number = keyboard.nextInt();
        //Records user input as the variable "number"

        thousandsDigit = number/1000;// Divides numbers by 1000, answer will always be thousands digit as it is an integer and there will be no decimal points
        hundredsDigit = (number%1000)/100;// Uses modulus to find remainder when dividing by 1000, last 3 digits will remain, when divided by 100 it will provide the hundreds digit
        tensDigit = (number%100)/10;// Uses modulus to find remainder when divided by 100, last 2 digits will remain, when divided this will provided tens digit
        onesDigit = (number%10);// When using modulus of 10 remainder will be ones digit


        rms = (Math.pow(thousandsDigit,2) + Math.pow(hundredsDigit,2) + Math.pow(tensDigit,2) + Math.pow(onesDigit,2));// Adds square of all digits
        rms = rms/4;// Divides square of all digits by 4
        rms = Math.pow(rms,0.5);// Finds square root of all digits

        System.out.println("Thousands Digit: " + thousandsDigit);
        System.out.println("Hundreds Digit: " + hundredsDigit);
        System.out.println("Tens Digit: " + tensDigit);
        System.out.println("Ones Digit: " + onesDigit);
        System.out.printf("The RMS value of the above four digits is: " + "%.2f",rms);
        // Above statements will print all of the different digits





    }
}

