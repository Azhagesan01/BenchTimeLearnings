package methodExamples;
import java.util.*;

public class HashMapMethods 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
	    System.out.println("Initial list of elements: "+hm);  
	      hm.put(100,"A");    
	      hm.put(101,"V");    
	      hm.put(102,"R");   
	       
	      System.out.println("After invoking put() method ");  
	      for(Map.Entry m:hm.entrySet())
	      {    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	        
	      hm.putIfAbsent(103, "G");  
	      System.out.println("After invoking putIfAbsent() method "); 
	      
	      
	      
	      for(Map.Entry m:hm.entrySet())
	      {    
	           System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	      
	      
	      HashMap<Integer,String> map=new HashMap<Integer,String>();  
	      map.put(104,"R"); 
	      
	      map.putAll(hm);  
	      System.out.println("After invoking putAll() method ");  
	      
	      
	      for(Map.Entry m:map.entrySet())
	      {    
	           System.out.println(m.getKey()+" "+m.getValue());    
	      }  
	      
	      map.remove(100);  
	      System.out.println("After remove() method ");
	      
	      System.out.println("Updated list of elements:");  
	      hm.replace(102, "G");  
	      for(Map.Entry m:hm.entrySet())  
	      {  
	         System.out.println(m.getKey()+" "+m.getValue());   
	      } 
	      
	      
	      System.out.println("Updated list of elements:");  
	      hm.replace(101, "V", "R");  
	      for(Map.Entry m:hm.entrySet())  
	      {  
	         System.out.println(m.getKey()+" "+m.getValue());   
	      }   

	}

}
