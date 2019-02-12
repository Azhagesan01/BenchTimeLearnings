package collection;
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) 
	{
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("A");
		ts.add("F");
		ts.add("a");
		ts.add("G");
		ts.add("c");
		
		Iterator<String> itr=ts.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  } 
		  
		  ts.add("b");
		  ts.add("Q");
		  ts.add("U");
		  
		  System.out.println("Highest Value: "+ts.pollFirst());  
	      System.out.println("Lowest Value: "+ts.pollLast());
	      
	      System.out.println(ts);
	      
	      System.out.println("Reverse Set: "+ts.descendingSet());  
	      
	      System.out.println("SubSet: "+ts.subSet("G", "a"));
	      
	      System.out.println(ts.ceiling("A"));
	      System.out.println(ts.floor("G"));

	}

}
