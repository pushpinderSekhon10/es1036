/*
Pushpinder Sekhon
251291426
February 5, 2023
The purpose of this program is to make an object representing a student
 */
package Q2;

public class Student
{
    private int studentNumber;//encapsulates variable
    private String firstName;//encapsulates variable
    private String lastName;//encapsulates variable
    private String emailAddress;//encapsulates variable
    private int yearOfBirth;//encapsulates variable

    //Above are all fields of student object

    public Student()//constructor which accepts no arguments
    {
        studentNumber = 251291426;//value for student number
        firstName = "Pushpinder";//name specified
        lastName = "Sekhon";//name specified
        emailAddress = "psekho2@uwo.ca";//email address specified
        yearOfBirth = 2004;//year of birth specified

    }

    public Student(int sn, String fName, String lName)//constructor which accepts multiple int, and 2 string values
    {
        studentNumber = sn;//student number specified when called
        firstName = fName;//first name specified when called
        lastName = lName;//last name specified when called

    }

    public int getStudentNumber()//accessor method which returns the student number when called
    {
        return studentNumber;//returns student number

    }

    public String getName()//accessor mwthod which returns name when called
    {
        String fullName;//initialises variable
        fullName = firstName +" " + lastName;//adds two strings to get full name
        return fullName;//returns full name

    }

    public String getEmailAddress()//accessor method to get email address when called
    {
        return emailAddress;//returns email address

    }

    public int getAge()//accessor method to get age when called
    {
        int age =2023-yearOfBirth;//calculates age based on date of birth
        return age;//returns age

    }
}
