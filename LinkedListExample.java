package listInterface;
import java.util.*;

public class LinkedListExample 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer>ll=new LinkedList<Integer>();
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.add(7);
		ll.add(null);
		
		System.out.println(ll);
		
		
		ll.remove(4);
		System.out.println(ll);
		
		
		LinkedList ll1=new LinkedList();
		
		ll1.add(3);
		ll1.add("Java");
		
		System.out.println(ll1);
		
		

	}

}
