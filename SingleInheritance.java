package inheritanceExamples;
class A{
	
	int a;
	public void display()
	{
		System.out.println("A is : "+a);
	}
}
public class SingleInheritance extends A {
	
	public static void main(String args[])
	{
		SingleInheritance s=new SingleInheritance();
		System.out.println("Display Method from Parent class");
		s.display();
	}

}
