package innerClass;
class Outer
{
	int x=10;
	void display()
	{
		System.out.println(" X in Outer class : "+x);
	}
	  class Inner
	  {
		int y=20;
		
		void show()
		{
			System.out.println(" X in Outer class : "+x);
			System.out.println(" Y in Inner class : "+y);
		}
	  }
    
	
	
}
public class RegularInnerClassExample {
	public static void main(String args[])
	{
		Outer outer=new Outer();
		outer.display();
		Outer.Inner i=new Outer().new Inner();
		i.show();
		
		
		
	}

}
