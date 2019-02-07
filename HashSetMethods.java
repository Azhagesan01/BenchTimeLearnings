package methodExamples;
import java.util.*;
public class HashSetMethods 
{

	public static void main(String[] args)
	{
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        
        System.out.println("Traversing HashSet");
        Iterator<String> i=set.iterator(); 
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }  
        
        System.out.println("HashSet contains : "+set);
        
        System.out.println(" Checking if the set has element five "+set.contains("Five"));
        
        System.out.println("Checking if set is empty : "+set.isEmpty());
        
        set.remove("Four");
        System.out.println("After Removing a element  "+set);
        
        
        System.out.println("The Size of set is : "+set.size());
        
        

	}

}
