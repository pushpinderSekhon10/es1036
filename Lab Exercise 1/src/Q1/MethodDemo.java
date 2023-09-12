/*
Pushpinder Sekhon
251291426
February 5, 2023
 */



package Q1; //indicates package
import java.util.*;//imports scanner among other things
public class MethodDemo {//sets class
    public static void main(String[] args)//driver method
    {
        double centimeters = 0;//initialises variable
        int feet = 0;//initialises variable
        double remainingInches = 0;//initialises variable
        int wholeInches = 0;//initialises variable
        String description = "Change centimeters to inches"; //sets string variable


        myHeader(1,1,"Change centimeters to inches");//uses myHeader method


        System.out.printf("Enter your height in cm: ");//prints statement


        Scanner keyboard = new Scanner(System.in);//brings scanner into method
        centimeters = keyboard.nextDouble();//uses scanner to determine value of variable


        double inches = cmToInchConverter(centimeters);//uses cmToInchConverter method to convert
        wholeInches = (int)inches;//sets wholeInches as integer value of inches
        feet = wholeInches/12;//uses math to determine number of feet
        remainingInches = inches-(feet*12);//uses math to determine remaining inches


        System.out.printf("%.2f cm = %.2f inches \n ", centimeters, inches);//prints answer statement
        System.out.printf("%.2f inches = %d feet %.2f inch \n",inches,feet,remainingInches);//prints answer statement


        myFooter(1);//uses myFooter method



    }

    public static void myHeader(int labNum, int questionNum, String description)//creates new method
    {
        System.out.printf("Full name: Pushpinder Sekhon\n");//prints name
        System.out.printf("Lab Exercise: %d ",labNum);//prints lab exercise number
        System.out.printf("Question: %d \n", questionNum);//prints question number
        System.out.printf("Program description: %s \n", description);//prints description of program

    }
    public static void myFooter(int questionNumber)//creates new method
    {
        System.out.printf("*** Signing off from Question %d - Pushpinder Sekhon ***", questionNumber);//prints footer

    }
    public static double cmToInchConverter(double cm)//creates new method
    {
       double in = cm/2.54;//uses math to convert cm to inches
       return in;//returns inches value

    }
}
