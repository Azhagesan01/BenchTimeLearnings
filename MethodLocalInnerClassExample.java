package innerClass;
class MainClass
{
	private int c=30;
	public void print()
	{
		System.out.println("Inside Print Method of Outer class");
		int a=50;
		
		class Inner
		{
			int b=50;
			
			public void display()
			{
				System.out.println("Inside Display Method of Inner class");
				System.out.println("A is : "+a);
				System.out.println("B is : "+b);
				System.out.println("C is : "+c);
				
			}
		}
		
		Inner i=new Inner();
		i.display();
	}
}
public class MethodLocalInnerClassExample {
	
	public static void main(String args[])
	{
		MainClass m =new MainClass();
		m.print();
		
	}

}
