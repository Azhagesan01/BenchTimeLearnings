import java.util.*;
public class ArrayIO {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

        System.out.println("enter number of elements in array : ");

        int n=sc.nextInt();

        int a[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();

        }
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element at " +i +" is " +a[i]);
		}
		
	}

}
