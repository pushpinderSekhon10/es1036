/*
Pushpinder Sekhon
251291426
February 5, 2023
 */

package Q3;//indicates package
import Q1.MethodDemo;//imports methods
import java.util.*;//imports scanner among other things
public class SumCity//declares class
{
    public static void main(String[] args)//driver method
    {
        MethodDemo.myHeader(1,3,"Sums of real numbers and characters");//uses myHeader method

        Scanner keyboard = new Scanner(System.in);//initialises scanner

        double realNumber = 0;//initialises variable
        double realNumber2 = 0;//initialises variable
        double realNumberSum = 0;//initialises variable
        char char1 = 0;//initialises variable
        char char2 = 0;//initialises variable
        String input = "0";//initialises variable
        String input1= "0";//initialises variable
        String input2 = "0";//initialises variable
        String clearBuffer = "0";//initialises variable
        int sum = 0;//initialises variable
        int charAdd = 0;//initialises variable
        char charNewChar = 0;//initialises variable
        String name = "My name is ";//sets variable


        System.out.print("Enter a real number: ");//asks question
        realNumber = keyboard.nextDouble();//variable set as next double inputted

        System.out.print("Enter a second real number: ");//asks question
        realNumber2 = keyboard.nextDouble();//variable saved as next double inputted

        realNumberSum = sumValues(realNumber,realNumber2);//uses sumValues method

        System.out.printf("The sum of %.2f and %.2f is %.2f\n" , realNumber, realNumber2, realNumberSum );//prints sum statement



        System.out.print("Enter a character: ");//asks question
        input = keyboard.next();//saves next input
        char1 = input.charAt(0);//ues first character of input

        System.out.print("Enter a second character: ");//asks question
        input = keyboard.next();//saves next input
        char2 = input.charAt(0);//ues first character of input

        charAdd = sumValues(char1,char2);//mehod which adds integer values to characters

        charNewChar = (char)charAdd;//converts integer to charcter

        System.out.printf("The sum of %c and %c is %c, whose equivalent integer value is %d\n",char1,char2,charNewChar,charAdd);//prints answer
        keyboard.nextLine();//will record next line input
        System.out.print("Enter your full name: ");//asks for name
        input1 = keyboard.nextLine();//saves name


        String stringSum = sumValues(name,input1);//uses sumValues method to sum strings
        System.out.printf("%s\n" , stringSum);//prints name


        MethodDemo.myFooter(3);//uses myFooter method

    }
    public static String sumValues(String str1, String str2)//declares method
    {
        String wholeString= str1+str2;//adds strings
        return wholeString;//returns string

    }
    public static double sumValues(double num1, double num2)//declares method
    {
        double num3 = num1+num2;//uses math to find sum
        return num3;//returns double


    }
    public static int sumValues(char character1, char character2)//declares method
    {
        int char1Int = (int) character1;//changes character into int value
        int char2Int = (int) character2;//changes character into int value
        int charSum = char1Int + char2Int;//adds int values
        return charSum;//returns sum of int values

    }
}
