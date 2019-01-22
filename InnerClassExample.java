class Outer
{
	int x=10;
	void display()
	{
		//Inner inner=new Inner();
		//inner.show();
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
    
	//System.out.println(" Y in Outer class : "+y);
	
}
public class InnerClassExample {
	public static void main(String args[])
	{
		Outer outer=new Outer();
		outer.display();
		Outer.Inner i=new Outer().new Inner();
		i.show();
		
		
		
	}

}
