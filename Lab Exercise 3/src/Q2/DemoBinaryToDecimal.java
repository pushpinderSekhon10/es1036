/*
        Pushpinder Sekhon
        251291426
        March 23, 2023
        The purpose of the lab is to create different methods to manipulate binary numbers and array
        */
package Q2;//indicates package

import LA3Q.MyMethod;//imports MyMethod

public class DemoBinaryToDecimal {//indicates class
    public static void main(String[] args) {//main method
        MyMethod.myHeader(3, 1, "Using arrays to perform different actions in relation to binary numbers");//prints the header

        int[] myArray = new int[4];//new reference variable for array

        for (int i = 0; i < myArray.length; i++) {//loop which populates array with random values from 0-1
            myArray[i] = (int) (Math.random() * 2);//populates array
        }


        BinaryToDecimalPushpinder use = new BinaryToDecimalPushpinder(myArray);//sets reference variable for BinaryToDecimalArray class

        System.out.print("The 4 bit number: ");//prints statement
        use.displayArray();//displays array
        int x = use.getDecimalValue();//sets x to decimal value of array
        System.out.printf("\nThe integer value is %d\n", x);//prints statment


        use.doubleTheSizeZeroPadding();//doubles size of array
        System.out.print("the 8 bit number after the size is doubled and zero padded: ");//prints statement
        use.displayArray();//displays array
        x = use.getDecimalValue();//sets x to decimal value of array
        System.out.printf("\nThe corresponding decimal value is: %d\n",x);//prints decimal value

        BinaryToDecimalPushpinder use2 = new BinaryToDecimalPushpinder(use.reverseArray());//sets new array reference variable to reverse of original array

        System.out.print("The 8 bit number after reversing the array: ");//prints statment
        use2.displayArray();//prints array
        x = use.getDecimalValue();//uses x to get decimal value
        System.out.printf("\nThe corresponding decimal value is: %d\n",x);//prints decimal value


        System.out.print("The 8 bit number after the right shift operation: ");//prints statement
        use2.shiftRight();//shifts array to the right
        x = use2.getDecimalValue();//gets decimal value
        use2.displayArray();//displays array
        System.out.printf("\nThe corresponding decimal value is: %d\n",x);//prints decimal value


        System.out.print("The 8 bit number after the shuffling operation: ");//prints statement
        use2.shuffleArray();//shuffles array
        x = use2.getDecimalValue();//sets x to decimal value of array
        use2.displayArray();//displays array
        System.out.printf("\nThe corresponding decimal value is: %d\n",x);//prints decimal value


        MyMethod.myFooter(2);//prints footer



    }
}