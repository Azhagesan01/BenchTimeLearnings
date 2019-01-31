package enumeration;

enum WeekDays
{ sun, mon, tues, wed, thurs, fri, sat }

public class EnumerationExample 
{
	

	public static void main(String[] args)
	{
		 WeekDays wk; 
		  wk = WeekDays.sun;
		  System.out.println("Today is "+wk);

	}

}
