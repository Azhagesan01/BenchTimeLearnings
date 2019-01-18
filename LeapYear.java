import java.util.*;
public class LeapYear {
	public static void main(String args[])
	{
		int startYear,endYear;
		System.out.println("Enter the Starting Year : ");
		Scanner sc=new Scanner(System.in);
		startYear=sc.nextInt();
		System.out.println("Enter the Ending Year : ");
		endYear=sc.nextInt();
		sc.close();
		findLeap(startYear,endYear);
	}
	static void findLeap(int startYear,int endYear)
	{
		for(int i=startYear;i<=endYear;i++)
		{
		boolean isLeap;
		if(i%4==0)
		{
			
		isLeap=true;
			
		}
		else
		{
			isLeap=false;
		}
		if(isLeap)
			System.out.println(i);
		}
		
	}

}
