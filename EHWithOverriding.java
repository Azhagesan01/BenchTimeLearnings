package exceptionHandling;

import java.io.FileNotFoundException;

class SuperClass
{
	void m1() 
    { 
        System.out.println("M1 SuperClass"); 
    } 
	void m2() throws RuntimeException
	{
		 System.out.println("M2 SuperClass"); 
	}
}



public class EHWithOverriding extends SuperClass {
	
//	void m1() throws Exception
//	{
//		System.out.println("M1 SubClass"); 
//	}
	void m1()
	{
		System.out.println("M1 SubClass"); 
	}
	
//	void m2() throws FileNotFoundException
//	{
//		System.out.println("M2 SubClass"); 
//	}
	
	void m2() throws ArithmeticException
	{
		int a=6;
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	
	public static void main(String args[])
	{
		EHWithOverriding ehw=new EHWithOverriding();
		ehw.m1();
		ehw.m2();
	}

}
