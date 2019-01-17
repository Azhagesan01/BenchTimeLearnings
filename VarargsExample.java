
public class VarargsExample {
	
	public static void main (String ... args)
	{
		Varargs v=new Varargs();
//		v.display(new int[] {4,5,6,7,8});
		v.display(4,5,6,7,8);
		v.display(9);
	}

}

class Varargs
{
	public void display(int a)
	{
		System.out.println(a + " in single paramter");
	}
	
	public void display(int ... a)
	{
		for(int i : a)
			System.out.println(i);
	}
	
//	public void display(int a[])
//	{
//		for(int i :a)
//			System.out.println(i);
//	}
//	
	
}
