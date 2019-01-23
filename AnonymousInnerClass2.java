package innerClass;

interface Child
{
	void eat();
}
public class AnonymousInnerClass2 {
	public static void main(String args[])
	{
		Child c=new Child() {
			
			@Override
			public void eat() {
				System.out.println("Inside Eat Method of Parent Interface");
				
			}
		};
		
		c.eat();
	}

}
