package listInterface;
import java.util.*;

public class VectorExample
{
	
	public static void main(String args[])
	{
		Vector v=new Vector();
		v.add("Java");  
		v.add("is a");  
		v.add("programming");  
		v.add("language"); 
		v.add(4);
		v.add(5);
		v.add(3);
		
		Iterator itr=v.iterator();  
		while(itr.hasNext())
		{  
		System.out.println(itr.next());  
		}  
		  
		System.out.println(v);
		
		v.remove(3);
		System.out.println(v);
		
		v.add("language");
		System.out.println(v);
		 
		v.setSize(13);
		
		System.out.println(v.size());
		
		v.setElementAt("a", 1); 
		System.out.println(v);
		
		Vector vretain = new Vector();
		
		vretain.add(4);
		vretain.add(5);
		vretain.add(3);
		vretain.add("Java");
		v.retainAll(vretain);
		
		System.out.println(v);
		
		v.clear();
		System.out.println("vector Cleared");
		
	}

}
