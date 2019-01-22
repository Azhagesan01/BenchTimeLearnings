import java.lang.reflect.Method;

public class StringReverse {

	public static void main(String args[])
	{
		reverseByMethod("hello world!!");
		reverse("This is a reversed one!!!!");
	}
	
	static void reverseByMethod(String str)
	{
		StringBuilder sb=new StringBuilder(str);
		String resultString=sb.reverse().toString();
		System.out.println("Reversed by Method : "+resultString);
	}
	
	static void reverse(String str)
	{
		StringBuilder sb=new StringBuilder(str);
		String resultString="";
		for(int i=str.length()-1;i>=0;i--)
		{
			resultString=resultString+str.charAt(i);
		}
		System.out.println("Reversed by for loop : "+resultString);
	}
}
