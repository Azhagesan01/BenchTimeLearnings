package methodExamples;
import java.util.*;
public class LinkedListMethods 
{

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<String>();  
        ll.add("Sachin");  
        ll.add("Ganguly");  
        ll.add("Kaif");  
        ll.add("Kohli");  
        ll.add("Dhoni");  
        ll.add("Gavaskar");  
        ll.add("Kapil");  
        ll.add("Sachin");  
        ll.add("DK");  
        ll.add("Ganguly");  
        System.out.println("Initial list of elements: "+ll);  
      
           ll.remove("Vijay");  
           System.out.println("After invoking remove(object) method: "+ll);   
      
           ll.remove(0);  
           System.out.println("After invoking remove(index) method: "+ll);   
           LinkedList<String> ll2=new LinkedList<String>();  
           ll2.add("Gambhir");  
           ll2.add("Bradman");  
      
           ll.addAll(ll2);  
           System.out.println("Updated list : "+ll);   
       
           ll.removeAll(ll2);  
           System.out.println("After invoking removeAll() method: "+ll);
           
           ll.peek();
           System.out.println("After invoking peek() method: "+ll);
           
           ll.poll();
           System.out.println("After invoking poll() mrthod: "+ll);
           
           ll.offer("Balaji");
           System.out.println("After invoking offer() method: "+ll);
      
           ll.removeFirst();  
           System.out.println("After invoking removeFirst() method: "+ll);  
        
           ll.removeLast();  
           System.out.println("After invoking removeLast() method: "+ll);  
         
           ll.removeFirstOccurrence("Ganguly");  
           System.out.println("After invoking removeFirstOccurrence() method: "+ll);  
        
           ll.removeLastOccurrence("Sachin");  
           System.out.println("After invoking removeLastOccurrence() method: "+ll);  

           
           ListIterator<String>itr=ll.listIterator();
           
           System.out.println("Traversing elements in forward direction");    
           while(itr.hasNext())
           {    
                 
           System.out.println("index:"+itr.nextIndex()+" value:"+itr.next());    
           }    
           System.out.println("Traversing elements in backward direction");    
           while(itr.hasPrevious())
           {    
             
           System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous());    
           }    
                
           ll.clear();  
           System.out.println("After invoking clear() method: "+ll);  
           
           
          

	}

}
