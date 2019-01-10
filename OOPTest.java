
class Display
{
	public void displayTest()
	{
		System.out.println("Display.displayTest");
	}
}

class Show extends Display
{
	public void displayTest()
	{
		System.out.println("Overriden Display.displayTest");
	}
	
	public int add(int a,int b)
	{
		int c=a+b;
		System.out.println("Added int values and answer is:" +c);
		return c;
	}
	public double add(double x,double y)
	{
	    double z=x+y;
		System.out.println("Added int values and answer is:" +z);
		return z;
	}
}

class EncapsulationTest
{
	String name;
	public String getName()
	{
		return name;
	}
	
	public String setName(String newName)
	{
		name=newName;
		return name;
	}
}


abstract class Color
{
	abstract void colorName();
}

class AbstractTest extends Color
{
	void colorName()
	{
		System.out.println("Color is RED");
	}
}





public class OOPTest {
	
	public static void main(String args[])
	{
		Display d=new Display();
		d.displayTest();
		Show s=new Show();
		s.displayTest();
		s.add(2, 3);
		s.add(2.0, 3.0);
		
		EncapsulationTest e=new EncapsulationTest();
		e.setName("ANNA");
		System.out.println("Name Given is  :  "+e.getName());
		
		Color c=new AbstractTest();
		c.colorName();
	}

}
