import java.util.*;
public class TwoDimensionalArray {
	public static void main(String args[]) 
    {         
        System.out.println("enter number of elements in array : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int a[][]=new int[n][m];
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<m;j++)
        	{
            a[i][j]=sc.nextInt();
        	}

        }
  
        
        for (int i=0; i< n ; i++) 
        { 
            for (int j=0; j < m ; j++) 
                System.out.print(a[i][j] + " "); 
  
            System.out.println(); 
        } 
    } 

}
