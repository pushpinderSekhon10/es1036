/*
Pushpinder Sekhon
251291426
March 3, 2023
Purpose of the program is to print different students information and grades and compare them
 */

package Q1;//indicates package
import java.util.*;//imports various things
public class StudentGradesByPushpinder//declares class
{
    public static Scanner input = new Scanner(System.in);//initialises scanner

    public static int counter = 0;//creates counter variable for all methods

    public static void myHeader(int labNum, int questionNum, String description)//creates new method
    {
        System.out.println("**********************************");
        System.out.printf("Full name: Pushpinder Sekhon\n");//prints name
        System.out.printf("Lab Exercise: %d ",labNum);//prints lab exercise number
        System.out.printf("Question: %d \n", questionNum);//prints question number
        System.out.printf("Program description: %s \n", description);//prints description of program
        System.out.println("**********************************");

    }
    public static void myFooter(int questionNumber)//creates new method
    {
        System.out.printf("\n*** Signing off from Question %d - Pushpinder Sekhon ***", questionNumber);//prints footer

    }

    public static void dataEntry(Student s)//used to enter data for the student
    {
        counter++;//increases value of counter variable

        System.out.printf("\nStudent %d:\n",counter);//prints student and number

        System.out.print("\nEnter Student Number:");//asks for student number
        int studentNumber = input.nextInt();//sets variable to studentNumber to integer inputted by user
        s.setStudentNumber(studentNumber);//uses setter method to set variable of the student number in the object

        input.nextLine();//clears buffer

        System.out.print("Enter Student's full Name:");//asks for name of student
        String fullName = input.nextLine();//stores name of student as a string
        s.setName(fullName);//sets the value of the full name variable to the input by the user

        System.out.printf("Enter score:");//asks user to enter the score
        int score = input.nextInt();//sets the score variable to the next integer entered by the user
        s.setScore(score);//sets the value of the score with the score inputted using the setter method
    }

    public static int compareGrades(Student s1, Student s2)//method which compares the grades of the different students
    {
        int score1 = s1.getScore();//gets score from the object
        int score2 = s2.getScore();//gets score from the object

        if (score1>score2)//sees if the score in the first object is higher
        {
            return 1;//returns integer value 1
        }

        else if(score1==score2)//checks if the score in the first variable is the same as the score in the second variable
        {
            return 0;//returns 0
        }
        else//if none of the above conditions are met, this will be executed
        {
            return -1;//returns integer value of 1
        }



    }

    public static void main(String args[])//main method
    {
        myHeader(2,1,"The purpose of the lab is to realise an object and use it to determine student's grades compared to one another");//prints a header using myHeader method

        System.out.print("Here is my grade-info:\n");//prints statement
        Student normal = new Student();//sets reference variable
        normal.printInfo();//prints empty constructor method

        System.out.println("\n\nData entry follows.....");//prints statement

        Student s1 = new Student();//sets s1 as the reference variable
        Student s2 = new Student();//sets s2 as a different reference variable to the s2 object

        dataEntry(s1);//uses dataEntry method
        dataEntry(s2);//uses dataEntry method

        System.out.print("\nHere is the detail info..\n");//prints statement
        String n = "Name";//sets string contents
        String s = "Student Number";//sets string contents
        System.out.printf("%20s %20s Score (Letter Grade)\n",n,s);//prints statement
        System.out.print("-------------------------------------------------------------------------\n");//prints border
        s1.printInfo();//uses printInfo method in Student object to print the values of the s1 object
        System.out.print("\n");//new line
        s2.printInfo();//uses printInfo method in the Student object to print the contents of the s2 object
        System.out.print("\n-------------------------------------------------------------------------");//prints border

        int higherGrade = compareGrades(s1,s2);//uses compare grades method to set value of integer

        if (higherGrade == 1)//checks if value is equal to 1
        {
            System.out.printf("\n%s scored higher than %s", s1.getName(), s2.getName());//prints that the name in the s1 object has achieved a higher grade than the name in the s2 object

        }

        else if (higherGrade == 0)//checks if the value is equal to 0
        {
            System.out.printf("\n%s scored equal to %s", s1.getName(), s2.getName());//prints that both the names of students in the different objects s1 and s2 have the same score values
        }

        else//executed if other conditions are not met
        {
            System.out.printf("\n%s scored lower than %s", s1.getName(), s2.getName());//prints that the student name in the si object has a lower value than the score of the name in the s2 object
        }


                myFooter(1);//prints footer
    }
    }



