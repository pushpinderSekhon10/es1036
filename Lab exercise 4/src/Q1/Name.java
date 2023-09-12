package Q1;//indicates package

public class Name//indicates class
{
    private String firstName;//empty String field
    private String lastName;//empty String field

    public Name()//constructor without argument
    {

    }

    public Name(String firstName, String lastName)//constructor with argument
    {
        this.firstName = firstName;//sets field to contents of argument
        this.lastName = lastName;//sets field to contents of argument

    }

    public String toString()//toSting() method returns string
    {
        return  firstName + " " + lastName + "\n";//returns string with certain info
    }

}
