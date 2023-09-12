/*
Pushpinder Sekhon
251291426
April 7, 2023
The purpose of the lab is to user parent anc child classes while also using interfaces to explore their possibilities
*/

package Q2;//indicates package
import java.util.*;//imports various tools
import LA3Q.MyMethod;//imports MyMethod class
public class DriverForAreaAndVolPushpinder//indicates class
{
    public Scanner input = new Scanner(System.in);//sets scanner reference variable
    public static void populateArray(Geometric3DObject[] x, int y) {//populates arrays
        if (y == 1) {//checks if second argument is one
            for (int i = 0; i < x.length; i++) {//loop which populates array
                double r = Math.random() + 2;//sets value of r to between 2 and 3
                double h = (Math.random() * 3) + 4;//sets value of h to between 4 and 7
                x[i] = new RightCylinder(r,h);//sets reference variables to a right cylinder object, this constructor will call the constructor of the parent class also
            }
        }

        if (y == 2) {//checks if second argument is 2
            for (int i = 0; i < x.length; i++) {//loop populates right circular cone
                double r = Math.random() + 2;//sets value of r to between 2 and 3
                double h = (Math.random() * 3) + 4;//sets value of h to between 4 and 7
                x[i] = new RightCircularCone(r, h);//sets reference variables to a right cylinder object, this constructor will call the constructor of the parent class also

            }

        }
    }
    public static void printArrays(Geometric3DObject[] x, int y)//prints the values of the number of cylinders you wish to have, prints the surface area and the volume
    {
        if (y ==1)//check whether to print cylinder or cone
        {
            for (int i = 0; i < x.length; i++)//loop which will print volues of the different objects
            {
                System.out.printf("\n\nCylinder %d\n", i+1);//prints which cylinder it is
                System.out.printf("--------------------------------\n");//formatting
                System.out.print(x[i]);//prints the toString method of the RightCyliner class which print the volume, surface area, radius and height
            }
        }

        if (y ==2)//determines if second argument is 2
        {
            for (int i = 0; i < x.length; i++)//loop which prints the elements of the number of cones
            {
                System.out.printf("\n\nCone %d\n",i+1);//prints cone number
                System.out.printf("--------------------------------\n");//formatting
                System.out.print(x[i]);//uses toString() method to print the values of the given cone
            }
        }



    }

    public static void maxVolume(Geometric3DObject[] x)//volume which finds the
    {
        double max = ((VolumeOf3DObjectsInterface)x[0]).getVolume();//sets value of max to first volume of the array using the VolumeOf3DObjectsInterface
        for (int i =0; i < x.length; i++)//loop which finds the maximum value of the valume
            if (max < ((VolumeOf3DObjectsInterface)x[i]).getVolume())//checks if max is less than the volume
            {
                max = ((VolumeOf3DObjectsInterface)x[i]).getVolume();//sets the max to the highest volume
            }
        System.out.printf(" with the maximum volume is %.2f cm",max);//prints statement of maximum volume
       }


    public static void main(String[] args)//driver method
    {
        MyMethod.myHeader(4,2,"The purpose of the lab is to understand concepts of child and parent classes, inheritance and interfaces");//prints header

        Scanner input = new Scanner(System.in);//allows us to use scanner

        System.out.print("Input number of cylindrical objects you wish to measure: ");//prints question to user
        int n = input.nextInt();//sets n to value inputted by the user

        Geometric3DObject[] g3d = new Geometric3DObject[n];//makes an array of reference variables to the Geometric3DObject class

        populateArray(g3d,1);//populates all reference variables in the array

        printArrays(g3d,1);//prints all the values of all the objects in the array

        System.out.print("\n\nThe cylinder");//prints statement

        maxVolume(g3d);//finds and prints maximum volume

        System.out.print("\n\nInput number of conic objects you wish to measure: ");//asks user for input
        int n2 = input.nextInt();//sets variable n2 to the number inputted by user

        Geometric3DObject[] g3d2 = new Geometric3DObject[n2];//makes new array of reference variables

        populateArray(g3d2,2);//populates reference variables with volues

        printArrays(g3d2,2);//prints objects values

        System.out.print("\n\nThe cone");//prints statement

        maxVolume(g3d2);//prints the maximum volume

        System.out.print("\n");//formatting

        MyMethod.myFooter(2);//prints footer











    }
}
