package innerClass;

class Test
{
	static int count=100;
	int a=200;
	static class Inner
	{
		void display()
		{
			System.out.println("Value of static variable is : "+count);
			//System.out.println("A is "+a);
		}
	}
}
public class StaticNestedClass {
	
	public static void main(String args[])
	{
		Test test=new Test();
		Test.Inner inner=new Test.Inner();
		inner.display();
	}

}
