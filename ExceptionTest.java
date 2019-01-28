package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.IOException;

class ABC
{
	int arr[]=new int[2];
	String s=null;
	void m1(int a,int b)
	{
		int c=0;
		try
		{
			c=a/b;
			
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic Exception");
		}
	}
}
class XYZ extends ABC
{
	void m2()
	{
		try
		{
			try
			{
				int i=Integer.parseInt(s);
				
			}
			catch(NumberFormatException e)
			{
				e.printStackTrace();
			}
			
			m1(64,8);
			System.out.println(s.length());
		}
		catch(NullPointerException np)
		{
			np.printStackTrace();
		}
	}
	void m3() 
	{
		try{
			
			System.out.println(arr[3]);
			}
		catch(ArrayIndexOutOfBoundsException aio)
		{
			aio.printStackTrace();	
		}
	}
	
}
class JKL extends XYZ
{
	public void m4(int i) throws FileNotFoundException, IOException
	{
		if(i < 0)
		{
			throw new FileNotFoundException("Negative Integer "+i);
			
		}
		else if(i==0)
		{
			throw new ArithmeticException("Value is 0");
		}
		else if(i > 10)
		{
			throw new IOException("Only supported for index 0 to 10");
		}

	}
}
public class ExceptionTest {

	public static void main(String[] args) 
	{
		try
		{
		JKL jkl=new JKL();
		jkl.m1(100, 0);
		jkl.m2();
		jkl.m3();
		jkl.m4(-5);
		jkl.m4(6);
		jkl.m4(0);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("FileNotFound Exception");
		}
		catch(IOException ioe)
		{
			System.out.println("IO Exception");
		}

	}

}
