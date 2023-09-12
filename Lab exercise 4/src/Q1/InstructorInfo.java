package Q1;//indicates package

public class InstructorInfo extends Name//indicates class which is a child class of Name
{
    private String officeLocation;//empty field

    public InstructorInfo()//constructor which calls constructor of parent class
    {
        super();//calls parent constructor

    }

    public InstructorInfo(String fN, String lN, String oL)//constructor with argument
    {
        super(fN,lN);//calls constructor of parent class with argument
        this.officeLocation = oL;//sets variable equal to one of the arguments


    }

    public String toString()//overriddent toString() method
    {
        String instructorName = super.toString();//reference variable to parent class
        return "\nInstructor's Info: \n" + "Instructor Name: " + instructorName + "Office Location:  " + officeLocation;//returns string printing information
    }

}
