package innerClass;

class OuterClass
{
	final static int y=90;
	static class InnerClass1
	{
		
		static char c='c';
		static int show(int a)
		{
			return a;			
		}
	}
	static class InnerClass2 extends InnerClass1
	{
		static char disp1()
		{
			return c;
		}
		static String disp(String a)
		{
			return a;
			
		}
	}
	
	static class InnerClass3 
	{
		static int display(int a) {
			return a;
		}
	}
}
public class InnerClassInheritance{
	 public static void main(String args[])
	 {
	System.out.println("Static variable Y of Outer Class : "+OuterClass.y);
	
	
	System.out.println("C of Inner Class 1 : "+OuterClass.InnerClass1.c);
	System.out.println("Show method of Inner Class 1 : "+OuterClass.InnerClass1.show(34));
	
	System.out.println("C of Inner Class 1 from Inner Class 2 : "+OuterClass.InnerClass2.disp1());
	System.out.println("A of Inner Class 2 : "+OuterClass.InnerClass2.disp("JAVA"));
	
	
	System.out.println("Display method of Inner class 3 : "+OuterClass.InnerClass3.display(56));
	 
		
	}
}
