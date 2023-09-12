/*
Pushpinder Sekhon
251291426
April 7, 2023
The purpose of the lab is to explore parent and child classes with an emphasis on exploring overridden methods
*/

package Q1;//indicates package
import LA3Q.MyMethod;//imports various tools

public class DemoCourseGradeYourFirstName//indicates class
{
    public static void main(String[] args)//driver method
    {
        MyMethod.myHeader(4,1,"To demonstrate the effectiveness of super an sub classes and use them in a school environment, also demonstrating polymorphism");//prints header

        CourseAndInstructor caiRef = new CourseAndInstructor("Programming Fundamentals", "Quazi", "Rahman", "TEB263");//calls constructor of class and assigns referecene variable
        StudentInfo siRef = new StudentInfo("Pushpinder", "Sekhon", 251291426, caiRef);//calls constructor of different class and assigns reference variable
        System.out.print(siRef);//prints information about student

        System.out.print("\n========================================");//formatting
        System.out.print("\n  Score Card (Based on rounded Score)");//prints statemtment
        System.out.print("\n========================================");//formatting

        double[] labG = {14.5,13.5,15,13.5,15,15,14};//creates new array reference variable
        GradeActivity avgLabG = new GradeActivity(labG,15);//creates new reference variable for gradeActivity class
        System.out.print("\nLab Grade: ");//prints statement
        System.out.print(avgLabG);//calls toString() method of class

        double[] quizG = {15.83,18.33,20};//creates new array reference variable
        GradeActivity avgQuizG = new GradeActivity(quizG,20);//creates new reference variable for gradeActivity class
        System.out.print("\nQuiz Grade: ");//prints statement
        System.out.print(avgQuizG);//calls toString() method of class

        double midterm = 21.79;//creates variable and assigns value
        GradeActivity midtermG = new GradeActivity(midterm,25);//creates new reference variable for gradeActivity class
        System.out.print("\nMidterm Grade: ");//prints statement
        System.out.print(midtermG);//calls toString() method of class

        double examG = 25;//creates variable and assigns value
        GradeActivity finalG = new GradeActivity(examG,40);//creates new reference variable for gradeActivity class
        System.out.print("\nExam Grade: ");//prints statement
        System.out.print(finalG);//calls toString() method of class

        System.out.print("\n========================================");//formatting

        double[] finalScore = {avgLabG.getScore(),avgQuizG.getScore(),midtermG.getScore(),finalG.getScore()};//creates array using values from different objects using getter methods
        GradeActivity courseG = new GradeActivity(finalScore,100);//creates new reference variable for gradeActivity class
        System.out.print("\nCourse Grade: ");//prints statement
        System.out.print(courseG);//calls toString() method of class

        System.out.print("\n========================================");//formatting

        double bonusG = 4.95;//creates variable and assigns value
        GradeActivity avgBonusG = new GradeActivity(bonusG,5);//creates new reference variable for gradeActivity class
        System.out.print("\nAverage Bonus Grade: ");//prints statement
        System.out.print(avgBonusG);//calls toString() method of class

        double sum = avgLabG.getScore() + avgQuizG.getScore() + midtermG.getScore() + finalG.getScore() + avgBonusG.getScore();//creates variable sum using values from different objects using getter methods
        GradeActivity reportedFinalG = new GradeActivity(sum,100);//creates new reference variable for gradeActivity class
        System.out.print("\nReported Final Grade: ");//prints statement
        System.out.print(reportedFinalG);//calls toString() method of class

        System.out.print("\n========================================");//formatting

        MyMethod.myFooter(1);//prints footer




    }
}
