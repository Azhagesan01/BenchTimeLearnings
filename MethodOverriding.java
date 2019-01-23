package overRiding;

class A
{
	void show()
	{
			System.out.println("Show of class A");
	}
}
public class MethodOverriding extends A {
	
	void show()
	{
		System.out.println("Welcome to Show of main class");
	}
	
	public static void main(String args[])
	{
		MethodOverriding m=new MethodOverriding();
		m.show();
		A a=new A();
		a.show();
		}

}
