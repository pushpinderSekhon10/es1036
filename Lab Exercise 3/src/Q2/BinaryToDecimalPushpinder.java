/*
        Pushpinder Sekhon
        251291426
        March 23, 2023
        The purpose of the lab is to create different methods to manipulate binary numbers and array
        */
package Q2;//indicates package
import LA3Q.MyMethod;//imports MyMethod class
public class BinaryToDecimalPushpinder//indicates class
{
    private int[] binaryArray;//initialises field

    public BinaryToDecimalPushpinder()//constructor method no arguments
    {


    }

    public BinaryToDecimalPushpinder(int myArray[])//constructor method with an array as argument
    {
        binaryArray = myArray;//sets field to argument array

    }

    public void displayArray()//method to display array
    {
        System.out.print("[");//prints bracket

        for (int i = 0; i < binaryArray.length; i++)//loop which prints array
        {
            System.out.printf("%d, ",binaryArray[i]);//prints part of array
        }

        System.out.print("\b\b");//backspace for formatting
        System.out.print("]");//prints bracket

    }

    public int getDecimalValue()//method to get decimal value
    {
        int decimalValue = 0;//sets variabel to 0

        MyMethod myMethod = new MyMethod();//initialises new array reference variable

        for (int i = 0; i < binaryArray.length; i++)//loop which determines decimal value
        {
            if (binaryArray[i] == 0)//checks if value is 0
            {
                decimalValue = decimalValue + 0;//does not add to sum

            }
            if (binaryArray[i] == 1)//checks if value is 0
            {
                decimalValue = decimalValue + (int)(myMethod.myPow(2,binaryArray.length-i-1));//adds to decimal value depending on the position of number

            }
        }
        return decimalValue;//returns decimal value

    }

    public void doubleTheSizeZeroPadding()//method to double size of array
    {
        int[] newArray = new int[binaryArray.length*2];//declares new array reference variable

        for (int i = 0; i < binaryArray.length; i++)//loop which sets value of doubled array
        {
            newArray[i+binaryArray.length] = binaryArray[i];//sets value of array
        }



        binaryArray = newArray;//passes reference variable to binaryArray field

        newArray = null;//nullifies redundant array

    }

    public int[] reverseArray()//reverses array
    {
        int[] newArray2 = new int[binaryArray.length];//sets new array reference variable

        for (int i = 0; i < binaryArray.length; i++)//loop which gives reversed values to new array
        {
            newArray2[i] = binaryArray[binaryArray.length - i - 1];//statement which gives reverse values to array
        }

        binaryArray = newArray2;//passes array reference variable to field

        newArray2 = null;//nullifies redundant array

        return binaryArray;//returns field

    }

    public void shiftRight()//shifts values right
    {
        int[] newArray3 = new int[binaryArray.length];//sets new array reference variable

        for (int i = 0; i < binaryArray.length - 1; i++)//loop with shifts array right
        {
            newArray3[i+1] = binaryArray[i];//gives values one to the right to new array
        }

        newArray3[0] = binaryArray[binaryArray.length-1];//sets the value of the first position of new array

        binaryArray = newArray3;//passes refence variable to binaryArray field

        newArray3 = null;//nullifies old reference variable

    }

    public void shuffleArray()//method to shuffle array randomly
    {

        for (int i = 0; i < binaryArray.length; i++) {//loop to shuffle array
            int j = (int) (Math.random() * binaryArray.length);//gives random values from 0 to less than the length of the array to new variable j

            int temp = binaryArray[i];//uses temporary variable to store term of position i
            binaryArray[i] = binaryArray[j];//puts the value of position j into position i
            binaryArray[j] = temp;//puts the value of position i into the position of value j
            //this effectively switches the 2 positions randomly
        }

    }



}



