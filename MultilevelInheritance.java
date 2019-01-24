package inheritanceExamples;

class Animal
{
	void sound()
	{
		System.out.println("All animals gives a sound");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog Barks");
	}
}

class Cat extends Dog
{
	void meow()
	{
		System.out.println("Cat says Meow");
	}
}

public class MultilevelInheritance {
	
	public static void main(String args[])
	{
		Cat cat =new Cat();
		cat.meow();
		cat.bark();
		cat.sound();
				
	}

}
