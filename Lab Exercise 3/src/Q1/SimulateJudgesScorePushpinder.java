/*
        Pushpinder Sekhon
        251291426
        March 23, 2023
        The purpose of the lab is to create different methods to manipulate arrays and make arrays related the scores of judges
        */
package Q1;//indicates package

import LA3Q.MyMethod;
public class SimulateJudgesScorePushpinder//indicates class
{

    public static void populateArray(double[] anyName)//method which populates the array
    {
        double value = 0;//initialises value

        for (int  i = 0; i < anyName.length; i++)//loop to populate array randomly
        {
            value = ((Math.random()*3)+7);//populates value randomly
            anyName[i] = value;//populates array with value figures


        }
    }

    public static void displayArray(double[] anyName)//method to display array
    {
        System.out.print("[");//prints bracket
        for (int i = 0; i < anyName.length; i++)//loop to print array
        {
            System.out.printf("%.2f, ", anyName[i]);//prints part of array

        }
        System.out.print("\b\b");//backspace for formatting
        System.out.print("]");//prints bracket
    }

    public static double finalScore(double[] anyName)//method to calculate final score
    {
        double[] myScore = new double[anyName.length];//creates new array reference variable

        double max = myScore[0];//sets value of max, all numbers will be above 0 so max will always be higher
        double min = myScore[0]+10;//sets value of min, all numbers will be lower than 10 so min will always go lower

        for(int i = 0; i < myScore.length; i++)//loop to assign values to new array
        {
            myScore[i] = anyName[i];//assigning values to new array
        }


        double average = 0;//intialises average
        double sum = 0;//initialises sum


        for (int i = 0; i < myScore.length; i++)//loop to determine maximum and minimum
        {
            if (myScore[i] > max)//check if number is larger than max
            {
                max = myScore[i];//sets number to max if it is larger
            }

            if (myScore[i] < min)//checks if number is smaller than min
            {
                min = myScore[i];//sets number to min if it is smaller than min
            }
        }

        System.out.printf("\n\tHighest score: %.2f", max);//prints highest score
        System.out.printf("\n\tLowest score: %.2f", min);//prints lowest score
        System.out.print("\nHere are the scores after discarding the highest and the lowest\n");//prints statment

        for (int i = 0; i < myScore.length; i++)//loop wich sets the largest and smallest number to 0
        {
            if (myScore[i] == max || myScore[i] == min)//if statement which checks if number is equal to the max or min
            {
                myScore[i] = 0;//sets value to 0
            }
        }

        displayArray(myScore);//displays array

        for (int i = 0; i < myScore.length; i++)//loop which sums up values of array
        {
            double value = myScore[i];//sets value to array value
            sum = sum + value;//sum if found in loop
        }

        double length = myScore.length;//initialies variable length

        for (int i= 0; i < myScore.length; i++)//loop which makes it so that the length is lessened so that the average can be calculated correctly
        {
            if (myScore[i]==0)//checks if score is 0
            {
                length--;//decrements length
            }
        }

        average = sum/length;//calculates average
        return average;//returns average

    }

    public static void main(String[] args)//main method
    {
        LA3Q.MyMethod.myHeader(3,1,"Exploring the ideas of arrays");//prints header

        double myArray[] = new double[5];//initialises new array referenc variable

        System.out.println("Here are the scores from the 5 judges");//prints stament
        populateArray(myArray);//populates array
        displayArray(myArray);//displays array

        System.out.printf("\n\tThe final score is %.2f",finalScore(myArray));//prints final score

        LA3Q.MyMethod.myFooter(1);//prints footer
    }

}
