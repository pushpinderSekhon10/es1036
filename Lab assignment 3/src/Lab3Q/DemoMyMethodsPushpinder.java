/*
Pushpinder Sekhon
251291426
March 5, 2023
The purspose of the lab is to create different methods relating to different mathematical functions and demonstrate them
 */
package Lab3Q;//indicates package

import java.util.*;//imports various classes

public class DemoMyMethodsPushpinder//indicates class
{
    public static Scanner keyboard = new Scanner(System.in);//sets scanner for all methods to use

    public static void main(String[] args)//driver method
    {

        MyMethod reference = new MyMethod();// reference variable for the previous class

        reference.myHeader(3,1,"The purspose of the lab is to create different methods relating to different mathematical functions and demonstrate them");//header method to print header

        char choice = 0;//initialises variable

        while(true)//infinite loop
        {
            System.out.println("\n\n======MENU======");//prints menu
            System.out.println("a: Power Function");//prints menu
            System.out.println("b: Factorial Function");//prints menu
            System.out.println("c: Sine Function");//prints menu
            System.out.println("d: Cosine Function");//prints menu
            System.out.println("e: exit");//prints menu
            System.out.println("================");//prints menu

            System.out.print("\nPlease enter your Choice: ");//prompts user for input

            choice = (keyboard.next().charAt(0));//saves character input from user
            choice = reference.myToLowerCase(choice);//method which makes input lowercase if necessary

            switch (choice) //switch statement using input from user
            {
                case 'a'://checks choice variable

                    System.out.println("\nPOWER FUNCTION: Calculating x to the power of y");//prints statement

                    System.out.print("Enter x: ");//prompts user for input
                    double base = keyboard.nextDouble();//records input from user

                    System.out.print("Enter y: ");//prompts user for input
                    int exponent = keyboard.nextInt();//records input from user

                    double answer = reference.myPow(base, exponent);//uses method to find value of exponential

                    System.out.printf("%.2f^%d = %.2f", base, exponent, answer);//prints answer

                    break;//breaks switch statement, will return to infinite loop

                case 'b'://checks choice variable

                    System.out.println("\nFACTORIAL FUNCTION: Calculating factorial(n)");//prints statement
                    System.out.print("Enter n: ");//prompts user for input

                    int n = keyboard.nextInt();//takes input from user

                    while (n<0)//while loop which will continue until user enter valid input
                    {
                        System.out.print("n has to be >=0; enter again: ");//prompts user for input after invalid input
                        n = keyboard.nextInt();//takes input from user and sets a new n value
                    }

                    answer = reference.myFactorial(n);//uses myFactorial method
                    System.out.printf("%d! = %.2e",n,answer);//prints answer

                    break;//breaks switch statement, will return to infinite loop

                case 'c'://checks choice variable

                    System.out.println("\nSINE FUNCTION: Calculating sin(k) degree");//prints statement
                    System.out.print("Enter k in degrees: ");//prompts user for input

                    double k = keyboard.nextDouble();//takes input from user

                    double kRad = reference.myDegreeToRadian(k);//user method to convert degrees to radians

                    answer = reference.mySin(kRad);//uses method to find value of sin

                    System.out.printf("sin(%.2f) degree = %.2f",k,answer);//prints answer

                    break;//breaks switch statement, will return to infinite loop

                case 'd'://checks choice variable

                    System.out.println("\nCOSINE FUNCION: Calculating cos(m) degree");//prints statement
                    System.out.print("Enter m in degrees: ");//prompts user for input

                    double m = keyboard.nextDouble();//takes input from user

                    double mRad = reference.myDegreeToRadian(m);

                    answer = reference.myCos(mRad);

                    System.out.printf("cos(%.2f) degree = %.2f",m,answer);//prints answer

                    break;//breaks switch statement, will return to infinite loop

                case 'e'://checks choice variable

                    break;//breaks switch statement, will return to infinite loop

                default://default for invalid choices
                {
                    System.out.print("\nInvalid Choice!");//prints statement if invalid

                    break;//breaks switch statement, will return to infinite loop

                }
            }

        if (choice == 'e')//checks if choice is e
        {
            break;//breaks infinite loop
        }


        }

        reference.myFooter(1);//uses method to print footer


        }
    }


