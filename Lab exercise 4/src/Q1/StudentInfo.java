package Q1;//indicates package

public class StudentInfo extends Name//indicates class which is a child class of Name
{
    private int studentNumber;//empty int type field
    private CourseAndInstructor courseInfo;//empty CourseAndInstructor type field

    public StudentInfo()//empty body constructor
    {

    }

    public StudentInfo(String fN, String lN, int sN, CourseAndInstructor cInfo)//constructor with argument
    {
        super(fN,lN);//calls the parent class constructor with argument
        this.courseInfo = cInfo;//sets course info to the argument
        this.studentNumber = sN;//sets field to value of argument


    }

    public String toString()//overridden toString() method
    {
        String name = super.toString();//creates reference variable to call the toString() method of the parent class
        return "Student Name: " + name + "Student Number: " + studentNumber + " " + courseInfo;//returns string containing info
    }

}
