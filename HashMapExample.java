package collection;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<>(); 
        
        print(map); 
        map.put("Dhoni", 10); 
        map.put("sachin", 30); 
        map.put("Ganguly", 20); 
          
        System.out.println("Size of map is: " + map.size()); 
      
        print(map); 
        if (map.containsKey("Dhoni"))  
        { 
            Integer a = map.get("Dhoni"); 
            System.out.println("value for key \"Dhoni\" is: " + a); 
        } 
          
        map.clear(); 
        print(map); 
        
        
        LinkedHashMap<String, Integer> LHmap = new LinkedHashMap<>(); 
        
        print(LHmap); 
        LHmap.put("Gilchrist", 100); 
        LHmap.put("BretLee", 300); 
        LHmap.put("Ponting", 200); 
        LHmap.put("Symonds", 400);
        
        print(LHmap); 
        
       /* TreeMap<String,Integer>sorted=new TreeMap<String,Integer>();
        sorted.putAll(LHmap);
        
        for (Map.Entry<String, Integer> entry : sorted.entrySet())  
            System.out.println("Key = " + entry.getKey() +  
                         ", Value = " + entry.getValue()); */
        
          
        System.out.println("Size of map is: " + LHmap.size()); 
      
        print(LHmap); 
        if (LHmap.containsKey("Ponting"))  
        { 
            Integer ab = LHmap.get("Ponting"); 
            System.out.println("value for key \"Ponting\" is: " + ab); 
        } 
          
        LHmap.clear(); 
        print(LHmap); 
    } 
      
    public static void print(Map<String, Integer> map)  
    { 
        if (map.isEmpty())  
        { 
            System.out.println("map is empty"); 
        } 
          
        else
        { 
            System.out.println(map); 
        } 
	}
    
    
} 