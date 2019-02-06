package collection;
import java.util.*;

public class TreeMap {

	public static void main(String[] args) 
	{
		TreeMap<String, String> hm = new TreeMap<String, String>();
        
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third","THIRD INSERTED");
        System.out.println(hm);
        
        System.out.println("Value of second: "+hm.get("second"));
        System.out.println("Is TreeMap empty? "+hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the TreeMap: "+hm.size());
        
        
        Set<String> keys = hm.keySet();
        for(String key: keys)
        {
			System.out.println("Value of "+key+" is: "+hm.get(key));
		}
        
        TreeMap<String, String> subMap = new TreeMap<String, String>();
		subMap.put("s1", "S1 VALUE");
		subMap.put("s2", "S2 VALUE");
		hm.putAll(subMap);
		System.out.println(hm);
		
		if(hm.containsKey("first"))
		{
			System.out.println("The TreeMap contains key first");
		} 
		else 
		{
			System.out.println("The TreeMap does not contains key first");
		}
		
		
		if(hm.containsKey("fifth"))
		{
			System.out.println("The TreeMap contains key fifth");
		} 
		else 
		{
			System.out.println("The TreeMap does not contains key fifth");
		}
		
		
		
		if(hm.containsValue("SECOND INSERTED"))
		{
			System.out.println("The TreeMap contains value SECOND INSERTED");
		}
		else
		{
			System.out.println("The TreeMap does not contains value SECOND INSERTED");
		}
		
		
		if(hm.containsValue("first"))
		{
			System.out.println("The TreeMap contains value first");
		}
		else
		{
			System.out.println("The TreeMap does not contains value first");
		}
		
		Set<String> keys1 = hm.keySet();
		for(String key: keys1)
		{
			System.out.println(key);
		}

	}

}
