import java.util.*;
public class PalindromeStrings {

	public static void main(String[] args) {
		String s,reverse="";
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int length=s.length();
		for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + s.charAt(i);
		
		if(s.equals(reverse))
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}

	}

}