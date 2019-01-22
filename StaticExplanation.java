package Access;
public class StaticExplanation
{
	static int a=30;
	static int b;
	
	
	static void op(int x)
	{    
		
		System.out.println("Inside Static Method");
		System.out.println("X is :"+x);
		System.out.println("A is :"+a);
		System.out.println("B is :"+b);
	}
	
	static {
		System.out.println("Inside Static Block");
		b=a*2;
	}
	public static void main(String args[])
	{
		System.out.println("Inside Main Method");
		op(20);
		
	}
}
