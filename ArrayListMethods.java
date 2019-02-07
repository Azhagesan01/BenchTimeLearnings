package methodExamples;
import java.util.*;
public class ArrayListMethods 
{

	public static void main(String[] args)
	{
		List<String>cities=new ArrayList<String>();
		
		cities.add("Chennai");
		cities.add("Madurai");
		cities.add("Trichy");
		cities.add("Coimbatore");
		cities.add("Tirunelveli");
		
		System.out.println("The ArrayList is : "+cities);
		
		System.out.println("The element at index 3 is : "+cities.get(3));
		
		System.out.println("Index of Chennai is : "+cities.indexOf("Chennai"));
		
		System.out.println("Removing Element at index 4 ");
		
		cities.remove(4);
		
		System.out.println(cities);
		
		List<String>subListOfCities=new ArrayList<String>(cities.subList(0,2));
		
		System.out.println("The sublist is : "+subListOfCities);
		

	}

}
