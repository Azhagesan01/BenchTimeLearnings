package Access;

interface Vehicle
{
	//int ab=1;
	
	
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes();
	
	
//	Vehicle(){
//		
//	}
	
//	static
//	{
//		
//	}
	
	static void m1()
	{
		System.out.println("\t\t\t\t m1 method of interface Vehicle");
	}
	
	
}

class Bicycle implements Vehicle
{
	int speed=0,gearcount;
	public void changeGear(int a)
	{
		for(int i=0;i<=a;i++)
			System.out.println("Current Gear of Bicyle is  "+i);
	}
	
	public void speedUp(int a)
	{
		for(int i=0;i<=a;i++)
			System.out.println("Current Speed of Bicyle is  "+i+" kmph");
		
	}
	
	public void applyBrakes()
	{
		System.out.println("Brakes Applied");
		for(int i=10;i>=speed;i--)
		{
			System.out.println("Speed Reducing  "+i+" kmph");
		}
	}
	
}
public class InterfaceExample {
	
	
	public static void main(String args[])
	{
		Bicycle b=new Bicycle();
		b.changeGear(4);
		b.speedUp(10);
		b.applyBrakes();
		
		Vehicle.m1();
	}
	
}
	
	
