package src;


/**
 * Write a description of class PrimeNumbersFor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PrimeNumbersFor
{
    // instance variables - replace the example below with your own
    public static void main(String args[])
    {
        int count=0;
        for(int i=10;i<=20;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    count=0;
                    break;
                }
                else
                {
                    count=1;
                }
                if(count==1)
                {
                System.out.println(i);
                }
            }
        }
    }
}
