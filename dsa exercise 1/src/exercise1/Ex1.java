package exercise1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Ex1
{
    public static void main(String[] args)
    {
        loopOrIteration();
        long startTime = System.nanoTime();
        recursion(30);
        System.out.println((System.nanoTime())-startTime);
    }

    public static long recursion(long n)
    {
        if (n<=1)
        {
            return 1;
        }
        else
        {
            return n*(recursion(n-1));
        }
    }

    public static void loopOrIteration()
    {
        long startTime = System.nanoTime();
        long n = 1;
        long counter = 30;
        while(counter > 1)
        {
            n = n*(counter);
            counter= counter-1;

        }
        long time_elapsed = ((System.nanoTime())-startTime);
        System.out.println(time_elapsed);
    }

}
