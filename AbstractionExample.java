package Access;

abstract class AbstractExample
{
	abstract void m1();
	void m2()
	{
		System.out.println("M2 method of Abstract Class A");
	}
}
public class AbstractionExample extends AbstractExample {
	
	void m1()
	{
		System.out.println("Implementation of M1 in main Class");
	}

	public static void main(String[] args) {
		
		AbstractionExample abs=new AbstractionExample();
		abs.m1();
		abs.m2();

	}

}
