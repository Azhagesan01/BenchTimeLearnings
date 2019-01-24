package inheritanceExamples;

class Animals
{
	void sound()
	{
		System.out.println("All Animals produce Sound");
	}
}

class Dogs extends Animal
{
	void bark()
	{
		System.out.println("Dog Barks");
	}
}

class Cats extends Animal
{
	void meow()
	{
		System.out.println("Cat says Meow");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		Cats c=new Cats();
		c.meow();
		c.sound();
		//c.bark();
		
		Dogs d=new Dogs();
		d.bark();
		d.sound();
		//d.meow();

	}

}
