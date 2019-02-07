package methodExamples;
import java.util.*;

public class TreeSetExample 
{

	public static void main(String[] args)
	{
		  TreeSet<String> ts=new TreeSet<String>();  
		  ts.add("A");  
		  ts.add("B");  
		  ts.add("C");  
		  ts.add("D");  
		  ts.add("E");
		  ts.add("F");
		  
		  
		  System.out.println("Traversing TreeSet");
		  Iterator<String> itr=ts.iterator();  
		  while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }  
		  
		  System.out.println("Traversing TreeSet in reverse order");
		  Iterator i=ts.descendingIterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  
		  
		  System.out.println("TreeSet contains : "+ts);
		  System.out.println("Highest Value: "+ts.pollFirst());  
	      System.out.println("Lowest Value: "+ts.pollLast()); 
	      
	      
	      	 System.out.println("Initial Set: "+ts);  
          
	         System.out.println("Reverse Set: "+ts.descendingSet());  
	           
	         System.out.println("Head Set: "+ts.headSet("C", true));  
	          
	         System.out.println("SubSet: "+ts.subSet("A", false, "E", true));  
	           
	         System.out.println("TailSet: "+ts.tailSet("C", false));  
	        
		  

	}

}
