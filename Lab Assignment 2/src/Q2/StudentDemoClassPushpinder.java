/*
Pushpinder Sekhon
251291426
February 5, 2023
Purpose of the program is to print different information of multiple different students
 */

package Q2;
import Q1.CircleInfoPushpinder;//imports q1 so that user can call header and footer methods
public class StudentDemoClassPushpinder
{
    public static void main(String[] args)//driver method
    {
        CircleInfoPushpinder.myHeader(2,2,"Demonstration of student class");//uses myHeader method to print header

        Student student1 = new Student();//creates student reference variable


        System.out.println("Here is my information:\n===================================");//prints border
        System.out.printf("I am %s \n", student1.getName());//prints name uses accessor method
        System.out.printf("Student Number: %d \n", student1.getStudentNumber());//prints student number using accessor method
        System.out.printf("Email address: %s \n", student1.getEmailAddress());//prints email address using accessor method
        System.out.printf("Age: %d \n", student1.getAge());//prints age using accessor method

        Student student2 = new Student(250221375,"Addie", "Slowgrave");//initialises new student using constructor method to assign variables
        Student student3 = new Student(250309716, "Talia","Hanscom");//initialises new student using constructor method to assign variables


        System.out.println("Here is the info on other students: \n=============================");//prints border
        System.out.printf("%-10s %-16s\n%-10s %-16s\n%-10d %-16s\n%-10d %-16s\n=============================","Number","Name","=========","==================", student2.getStudentNumber(),student2.getName(),student3.getStudentNumber(),student3.getName());//prints final part using complex formatting



        CircleInfoPushpinder.myFooter(2);//uses myFooter method to print footer

    }





}
