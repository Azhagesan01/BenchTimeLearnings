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
          
        System.out.println("Size of map is:- " + map.size()); 
      
        print(map); 
        if (map.containsKey("Dhoni"))  
        { 
            Integer a = map.get("Dhoni"); 
            System.out.println("value for key \"Dhoni\" is:- " + a); 
        } 
          
        map.clear(); 
        print(map); 
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
