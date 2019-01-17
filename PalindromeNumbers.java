
public class PalindromeNumbers {
	
	public static void main(String args[])
	{
		int n=3553;
		int temp=n;
		int sum=0;
		
		while(n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println("The given Number is a palindrome");
			
		}
		else
		{
			System.out.println("The given Number is not a palindrome");
		}
	}
	

}
