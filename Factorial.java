import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		
		long fact=1;
		int n;
		System.out.println("Enter the number :");
		Scanner sc =new Scanner(System.in);
		n=sc.nextInt();
        
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+ " is : "+fact);
	}

}
