package boxing;

import java.util.*;

public class BoxingExample {
	
	public static void main(String args[])
	{
		Integer i=new Integer(10); //Boxing
		int j=i;//UnBoxing
		
		System.out.println("Value of i: " + i); 
        System.out.println("Value of j: " + j); 
        
        
        Character ch='a';
        char ch1=ch;
        
        System.out.println("Value of ch: " + ch); 
        System.out.println("Value of ch1: " + ch1); 
        
        List<Integer> list = new ArrayList<Integer>(); 
        for (int k = 0; k<=21; k++) 
            list.add(k); 
        
        int sumOdd = sumOfOddNumber(list); 
        System.out.println("Sum of odd numbers = " + sumOdd); 
        
        
	}
	
	public static int sumOfOddNumber(List<Integer> list) 
    { 
        int sum = 0; 
        for (Integer i : list) 
        { 
            
            if(i % 2 != 0) //unboxing of i automatically
                sum += i; 
            
        } 
        return sum; 
    } 

}
