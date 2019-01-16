import java.util.Arrays;
import java.util.Scanner; 
public class ArrayOperations {
	
	
	
	void arraySort()
	{
		int a[]= {1,2,3,4,5,6};
		
		
		System.out.println("Original array : "+Arrays.toString(a));
	    Arrays.sort(a);
	    System.out.println("Sorted array : "+Arrays.toString(a));
	}
	
	void arrayBinarySearch()
	{
		int a[]= {21,24,43,64,57,69,76,54,98,106};
		int key;
		System.out.println("Give the value to be searched :");
		Scanner sc=new Scanner(System.in);
		key=sc.nextInt();
		
		System.out.println("The value "+key+ " is found at index "+Arrays.binarySearch(a, key));
	}
	
	void arrayCompare()
	{
		int a[]= {1,2,3,4,5,6};
		int b[]= {5,6,7,8,9};
		System.out.println("Given Array a= " +Arrays.toString(a));
		System.out.println("Given Array b= " +Arrays.toString(b));
		
		System.out.println("Comparing both arrays "+Arrays.equals(a,b));
	}
	
	void arrayCopyof()
	{
		int a[]= {1,2,3,4,5,6};
		System.out.println("Given Array a= " +Arrays.toString(a));
		System.out.println("Copied Array b= "+Arrays.toString(Arrays.copyOf(a, 10)));
		
	}
	
	void arrayFillValue()
	{
		int a[]= {1,2,3,4,5,6};
		System.out.println("Given Array a= " +Arrays.toString(a));
		int key=22;
		Arrays.fill(a, key);
		System.out.println("Filled Array "+Arrays.toString(a));
	}
	
	void arrayHashcode()
	{
		int a[]= {10,20,30,40,50,60,70};
		System.out.println("Given Array a= " +Arrays.toString(a));
		System.out.println("Hashcode of given Array is "+Arrays.hashCode(a));
		
	}
	
	public static void main(String args[])
	{
		ArrayOperations a=new ArrayOperations();
		a.arraySort();
		a.arrayBinarySearch();
		a.arrayCompare();
		a.arrayCopyof();
		a.arrayFillValue();
		a.arrayHashcode();
	}

}
