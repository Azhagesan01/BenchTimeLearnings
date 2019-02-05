package collection;

import java.util.*;
import comparatorExamples.StringComparator;


public class QueueExample {

	public static void main(String[] args) 
	{
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("A");  
		queue.add("V");  
		queue.add("K");  
		queue.add("J");  
		queue.add("R");  
		queue.offer("S");
		System.out.println(queue);
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());   
		System.out.println(queue.poll());  
		System.out.println("after removing a element:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext())
		{  
		System.out.println(itr2.next());  
		}
		
		System.out.println(queue);
		
		
		PriorityQueue<String> q=new PriorityQueue<String>(15,new StringComparator()); 
		
		q.offer("A");
		q.offer("Z");
		q.offer("B");
		q.offer("P");
		q.offer("W");
		
		System.out.println(q);
		
		

	}

}
