package collection;
import java.util.*;
public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer>al=new ArrayList<Integer>();
		
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(4);
		al.add(5);
		al.add(7);
		al.add(3);
		al.add(8);
		al.add(6);
		
		
		System.out.println("Original Array List : "+al);
		
		LinkedHashSet<Integer>lhs=new LinkedHashSet<Integer>();
		lhs.addAll(al);
		
		al.clear();
		
		al.addAll(lhs);
		
		System.out.println("Array List after removing duplicates : "+al);

    }
}
