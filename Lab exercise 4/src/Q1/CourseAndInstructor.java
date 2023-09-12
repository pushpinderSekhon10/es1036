package Q1;//indicates package

public class CourseAndInstructor extends InstructorInfo//indicates child class which extend the parent class InstructorInfo
{
    private String courseName;//private field courseName

    public CourseAndInstructor()//no argument constructor
    {
        super();//calls no argument constructor of the parent class

    }

    public CourseAndInstructor(String cN, String fN, String lN, String oL)//constructor with argument
    {
        super(fN,lN,oL);//calls parent class constructor with argument
        this.courseName = cN;//sets course name to argument cN


    }

    public String toString()//overridden toString method
    {
        String instructor = super.toString();//calls the toString() method of the parent class
        return "\n" + courseName + instructor ;//returns a string

    }



}
