package exceptionHandling;


class ExceptionHandling {

	public void excephandler()
	{
		int a=20;
		int b=0;
		String s=null; 
		String s1="abc"; 
		int arr[]=new int[2];
	try
	{
		try
		{
			int c=a/b;
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		try
		{
			System.out.println(s.length());
		}
		
		catch(NullPointerException np)
		{
			np.printStackTrace();
		}
		try
		{
			int i=Integer.parseInt(s);
			
		}catch(NumberFormatException e)
		{
			e.printStackTrace();
		}
		try{
		
			System.out.println(arr[3]);
			}
		catch(ArrayIndexOutOfBoundsException aio)
		{
			aio.printStackTrace();	
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

		finally
		{
		   System.out.println("Finally Block Executed");
		}
		
	}
	
	static void m1()
	{
		int x=50;
		int y=0;
		int z=x/y;
		throw new ArithmeticException("Divide by ZERO");
	}
		
	
}

public class ExceptionHandling1
{
	public static void main(String args[])
	{
		ExceptionHandling e=new ExceptionHandling();
		e.excephandler();
		ExceptionHandling.m1();
	}
		
}

