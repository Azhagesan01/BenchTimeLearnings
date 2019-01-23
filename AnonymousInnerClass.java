package innerClass;

abstract class Parent
{
	abstract void eat();
}

public class AnonymousInnerClass {

	public static void main(String args[])
	{
		Parent p=new Parent() {
			
			@Override
			void eat() {
				System.out.println("Overriden Parent Class Eat Method");
				
			}
		};
	    p.eat();
	}
}
