package iostream;
import java.io.*;
import java.util.*;

public class ReadingAndWritingConsole {

	public static void main(String[] args)
	{
		try {
			System.out.println("Enter a name :");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String name;
			name = br.readLine();
			System.out.println("The name is "+name);
			br.close();
			
			System.out.println("Enter dob in ddmmyy :");
			Scanner sc=new Scanner(System.in);
			int dob=sc.nextInt();
			System.out.println("Date of birth of "+name+" is : "+dob);
			sc.close();
			
			
			 String company = System.console().readLine(); 
	         System.out.println(name); 
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

}
