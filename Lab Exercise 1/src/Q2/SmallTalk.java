/*
Pushpinder Sekhon
251291426
February 5, 2023
 */


package Q2;// indicates package
import Q1.MethodDemo;//imports methods
import java.util.*;// imports scanner among other things
public class SmallTalk//declares class
{
    public static void main(String[] args)//driver method
    {
        MethodDemo.myHeader(1,2,"Converting to fahrenheit and celsius");//uses myHeader method
        Scanner keyboard = new Scanner(System.in);//initiates scanner

        double celsiusOutdoor = 0;//initiates variable
        double fahrenheitOutdoor = 0;//initiates variable
        double celsiusIndoor = 0;//initiates variable
        double fahrenheitIndoor = 0;//initiates variable
        double fahrenheitNew = 0;//initiates variable
        double celsiusNew = 0;//initiates variable




        System.out.print("What is the outdoor temperature now? ");//prints question statement
        celsiusOutdoor = keyboard.nextDouble();//sets variable as next doubel inputted

        fahrenheitOutdoor = celsiusToFahrenheit(celsiusOutdoor);// uses celsiusToFahrenheit method

        System.out.printf("\t I know you're used to Fahrenheit scale. %.2f deg-C is %.2f deg-F.\n", celsiusOutdoor,fahrenheitOutdoor );// prints answer statement

        System.out.print("I am cold what is the indoor temperature? ");//prints question statement
        celsiusIndoor = keyboard.nextDouble();//sets variable as next inputted double

        fahrenheitIndoor = celsiusToFahrenheit(celsiusIndoor);//uses celsius to fahrenheit method

        System.out.printf("\t%.2f deg-C is %.2f deg-F. \n" , celsiusIndoor , fahrenheitIndoor);//prints answer
        System.out.print("I see. Would you crank up the temperature\n");//prints statement

        System.out.printf("\t Ok I'll! What temperature should I set the thermostat to? ");//prints question
        fahrenheitNew = keyboard.nextDouble();//sets variable to next double inputted

        System.out.printf("\t Oh, you mean %.2f deg Fahrenheit! Here you go.\n", fahrenheitNew);//prints answer

        celsiusNew = fahrenheitToCelsius(fahrenheitNew);//uses fahrenheit to celsius method

        System.out.printf("\t By the way, %.2f deg-F is %.2f deg-C.\n", fahrenheitNew, celsiusNew);//prints answer
        System.out.print("Thank you! It is very nice of you\n");//prints statement





        MethodDemo.myFooter(2);//uses myFooter method from previous question

    }
    public static double celsiusToFahrenheit(double c)//declares method
    {
        double f = (c/5)*9+32;//uses formula to convert
        return f;//returns double


    }
    public static double fahrenheitToCelsius(double f)//declares method
    {
        double c = ((f-32)/9)*5;//uses formula to convert
        return c;//returns double

    }
}
