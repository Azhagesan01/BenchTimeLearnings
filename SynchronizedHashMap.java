package collection;
import java.util.*;

public class SynchronizedHashMap {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hmap= new HashMap<Integer, String>();
        hmap.put(2, "Karthi");
        hmap.put(44, "Ajith");
        hmap.put(1, "Surya");
        hmap.put(4, "Vikram");
        hmap.put(88, "Vijay Sethupathi");

        Map map= Collections.synchronizedMap(hmap);
        Set set = map.entrySet();
        synchronized(map){
            Iterator i = set.iterator();
            
            while(i.hasNext()) {
               Map.Entry me = (Map.Entry)i.next();
               System.out.print(me.getKey() + ": ");
               System.out.println(me.getValue());
            }
        }

	}

}
