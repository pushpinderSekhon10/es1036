/*
Pushpinder Sekhon
251291426
March 3, 2023
Purpose of the object is to have different student related variables including score and methods related to these students
 */



package Q1;//idicates package

public class Student {//indicates class
    private String name;//name field declared
    private int studentNumber;//student field declared
    private int score;//score field declared

    public Student()//declares student constructor
    {
        name = "Pushpinder Sekhon";//sets variable name
        studentNumber = 251291426;//sets student number variable
        score = 100;//sets score variable

    }

    public Student(String nm, int sn, int sc)//overloads student constructor
    {
        String name = nm;//sets name variable to accept from constructor
        int studentNumber = sn;//sets student number variable to accept from constructor
        int score = sc;//sets score variable to accept from constructor

    }

    public void printInfo()//method used to print info about object
    {
        System.out.printf("%20s %20d %3d (letter Grade: %2s)",name,studentNumber,score,getLetterGrade());//prints infor regarding object

    }

    public String getName()//method which retrieves name in object
    {
        return name;//returns value of variable name

    }

    public int getScore()//returns value of variable score
    {
        return score;//returns score

    }

    public void setName(String nm)//sets contents of name variable
    {
        name = nm;//retrieves value from method then sets it to name variable

    }

    public void setStudentNumber(int sn)//method to set value of student number variable
    {
        studentNumber = sn;//sets value of student number variable from contents of method

    }

    public void setScore(int sc)//method which sets value of score
    {
        score = sc;//sets value of score variable using contents of method

    }

    public String getLetterGrade()//prints letter grade based on value of score variable
    {
        if (score >= 90)//checks if score is above or equal to 90
        {
            return "A+";//returns letter grade based on score

        }
        else if (score >= 80)//checks if score is above or equal to 80
        {
            return "A-";//returns letter grade based on score
        }
        else if (score >= 70)//checks if score is above or equal to 70
        {
            return "B+";//returns letter grade based on score
        }
        else if (score >= 60)//checks if score is above or equal to 60
        {
            return "B-";//returns letter grade based on score
        }
        else if (score >= 50)//checks if score is above or equal to 50
        {
            return "C+";//returns letter grade based on score
        }
        else if (score >=40)//checks if score is above or equal to 40
        {
            return "C-";//returns letter grade based on score
        }
        else if (score >= 30)//checks if score is above or equal to 30
        {
            return "D";//returns letter grade based on score
        }

        else//if none of the above conditions are met this will happen
        {
            return "F";//returns character F
        }






    }






}