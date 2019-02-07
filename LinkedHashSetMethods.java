package methodExamples;

import java.util.*;

public class LinkedHashSetMethods
{

	public static void main(String[] args) 
	{
		LinkedHashSet<String> set=new LinkedHashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        
        System.out.println("Traversing LinkedHashSet");
        Iterator<String> i=set.iterator(); 
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
        
        System.out.println("LinkedHashSet contains : "+set);
        
        System.out.println(" Checking if the set has element five "+set.contains("Five"));
        
        System.out.println("Checking if set is empty : "+set.isEmpty());
        
        set.remove("Four");
        System.out.println("After Removing a element  "+set);
        
        
        System.out.println("The Size of set is : "+set.size());

	}

}
