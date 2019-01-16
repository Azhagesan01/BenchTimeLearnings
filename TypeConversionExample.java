
public class TypeConversionExample {

	
	
	public static void main(String args[])
	{
		int a=257;
		byte b;
		double d=323.242;
		float f=1.0f;
		String s,s1,s2,s3;

		System.out.println("Int to byte:");
		b=(byte) a;
		System.out.println("a : "+a+" b : " +b);
		
		
		System.out.println("double to int :");
		a=(int)d;
		System.out.println("d is : "+d+" a is : " +a);
		
		System.out.println("double to byte :");
		b=(byte)d;
		System.out.println("d is :"+d+" b is : " +b);
		
		
		System.out.println("Integer to String :");
		s=Integer.toString(a);
		
		s1=String.valueOf(a);
		
		s2=String.format("%d",a);
		
		Integer intInstance=new Integer(a);
				s3=intInstance.toString();
				
				
		System.out.println("String s = "+s);
		
		System.out.println("String s1 = "+s1);
		
		System.out.println("String s2 = "+s2);
		
		System.out.println("String s3 = "+s3);
		
		
		
		
		
		
		
		
	}
	
	
	
}
