package listInterface;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListExample
{

	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(0);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		
		System.out.println(al);
		
		al.remove(0);
		System.out.println(al);
		
		
		al.set(4, 7);
		System.out.println(al);
		
		ArrayList<String> sal=new ArrayList<String>();
		
		sal.add("Java");
		sal.add("Collection");
		sal.add("Framework");
		sal.add("List Interface in Java");
		sal.add("Java");
		sal.add(null);
		System.out.println(sal);
		
		
		System.out.println("Index of Java: "+sal.indexOf("Java"));
		System.out.println("Last Index of Java: "+sal.lastIndexOf("Java"));
		System.out.println("Index of element not present : " + sal.indexOf("java"));
		
		System.out.println(al.size());
		System.out.println(sal.size());
		
		System.out.println(sal.contains("java"));
		
		
		
		
		
	}

}
