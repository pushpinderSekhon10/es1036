package LA3Q;

public class MyMethod//indicates class
{
    public static double PI = 3.141592653589793;//sets value of PI for all methods

    public static double myPow(double x, int y)//method which accepts a double and integer and find the value
    {
        double base = x;//sets base = double inputted
        int exponent = y;//sets exponent to integer inputted

        if (exponent == 0)//for statement checkhing if exponenet is 0
        {
            return 1;//returns 1
        }

        if (exponent == 1)//check is exponent is 1
        {
            return base;//returns base
        }

        if (exponent < 0)//checks if exponent is negative
        {
            base = 1 / base;//inverts formula
            exponent = -exponent;//makes exponent positive
        }

        double result = 1;//intitialises result

        while (exponent > 0)//loop if exponent is greater than 0
        {
            if (exponent % 2 == 1)//checks if exponent is odd
            {
                result = base * result;//the result while be 1 so essentially we are just returning the base after it has been multiplied many different times
            }

            base = base * base;//changes the base by multiplying it by itself
            exponent = exponent / 2;//divides exponent by 2
            //basically what happens is that it uses the property that an exponent to an exponent is the multiplication of those exponents

        }

        return result;//returns result

    }

    public static double myFactorial(int n)//method which finds factorials
    {
        double nfact = 1;//initialises variable

        if (n > 0)//checks if n is less than 0
        {
            for (int i = 1; i <= n; i++)//initialises counter, checks if counter is larger than n which is the factorial number, and increments counter
            {
                nfact = nfact * i;//multiplies previous value by counter
            }
        }

        return nfact;//returns value

    }

    public static double mySin(double x)//method which calculates value of sin function
    {
        int N = 20;//sets the counter to a maximum of 20, higher number means more accuracy

        double value = 0;//initialises variable
        double endValue = 0;//initialises variable

        for (int n = 0; n <= N; n++)//for statement which sees if n is less than or equal to the max, n starts at 0, and this also increments n every time the statement is executed
        {
            value = (myPow(-1, n)) * (myPow(x, (2 * n + 1))) / (myFactorial(2 * n + 1));//formula given for sin function using methods previously made
            endValue = endValue + value;//adds all the values of the runs to get final value
        }

        return endValue;//returns the end value

    }

    public static double myCos(double x)//method used to simulate cosine function
    {
        int N = 20;//sets the maximum number of executions to 20

        double value = 0;//initialises variable
        double endValue = 0;//initialises variable

        for (int n = 0; n <= N; n++)//for statement which sets n equal to 0 and checks if n is less than the maximum value and increments n
        {
            value = ((myPow(-1, n)) * (myPow(x, 2 * n))) / (myFactorial(2 * n));//formula given for cosine function, which uses previously made methods
            endValue = endValue + value;//adds the previous value to get the next value, continues until final value
        }

        return endValue;//returns final value


    }


    public static double myDegreeToRadian(double degree)//method which converts degrees to radians
    {
        double convertedRad = (degree * PI) / 180;//formula given to converts degrees to radians
        return convertedRad;//returns converted value
    }

    public static char myToLowerCase(char c)//method which converts an upper case character to lower case
    {
        if (c >= 'A' && c <= 'Z')//if statement which checks if character is upper case
        {
            return (char) (c + 32);//returns lower case character
        } else//if not uppercase letter
        {
            return c;//returns original value
        }

    }

    public static void myHeader(int labNum, int questionNum, String description)//creates new method
    {
        System.out.println("**********************************");
        System.out.printf("Full name: Pushpinder Sekhon\n");//prints name
        System.out.printf("Lab Assignment: %d ", labNum);//prints lab exercise number
        System.out.printf("Question: %d \n", questionNum);//prints question number
        System.out.printf("Program description: %s \n", description);//prints description of program
        System.out.println("**********************************");

    }

    public static void myFooter(int questionNumber)//creates new method
    {
        System.out.printf("\n*** Signing off from Question %d - Pushpinder Sekhon ***", questionNumber);//prints footer

    }
}
