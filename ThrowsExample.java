package exceptionHandling;

import java.io.IOException;

class Eh
{
	void m1()throws IOException
	{
		throw new IOException ("IO Exception");
	}
}
public class ThrowsExample {
	
	public static void main(String args[])
	{
		try
		{
			Eh e1=new Eh();
			e1.m1();
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
		System.out.println("Rest of the code");
	}

}
