package collection;
import java.util.*;

public class SynchronizedList 
{
	public static void main(String args[])
	{
	    List<String> syncal = 
	            Collections.synchronizedList(new ArrayList<String>());

	          
	          syncal.add("Pen");
	          syncal.add("NoteBook");
	          syncal.add("Ink");

	          System.out.println("Iterating synchronized ArrayList:");
	          synchronized(syncal) {
	          Iterator<String> iterator = syncal.iterator(); 
	          while (iterator.hasNext())
	             System.out.println(iterator.next());
	          }
	}

}
