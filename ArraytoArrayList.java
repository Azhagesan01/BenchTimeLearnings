package collection;

import java.util.*;
public class ArraytoArrayList 
{

	public static void main(String[] args) 
	{
		String[] cities= {"chennai","trichy","coimbatore","madurai","tirunelveli"};
		
		ArrayList<String>citieslist=new ArrayList<String>(Arrays.asList(cities));
		
		
		for (String str: citieslist)
		  {
			System.out.println(str);
	      }
		
		Iterator itr=citieslist.iterator();
		
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		ArrayList<String>citieslist2=new ArrayList<String>();
		
		Collections.addAll(citieslist2, cities);
		
		for (int i = 0; i < citieslist2.size(); i++)  
            System.out.print(citieslist.get(i) + " "); 
		
		
		System.out.println(citieslist.hashCode());

	}

}
