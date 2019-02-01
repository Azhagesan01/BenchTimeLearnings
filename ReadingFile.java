package iostream;

import java.io.*;
import java.util.Scanner;

public class ReadingFile {

	public static void main(String[] args) {
		try
		{
			 File file = new File("C:\\Users\\a.kathiresan\\Desktop\\test.txt"); 
			  
			  BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
			  String st; 
			  while ((st = br.readLine()) != null) 
			    System.out.println(st); 
			  
			  
			  FileReader fr = new FileReader("C:\\Users\\a.kathiresan\\Desktop\\test.txt"); 
			  int i; 
			  while ((i=fr.read()) != -1) 
			  System.out.print((char) i); 
				    
				    
			  File file1 = new File("C:\\Users\\a.kathiresan\\Desktop\\test.txt"); 
			  Scanner sc = new Scanner(file1); 
			  
			  while (sc.hasNextLine()) 
			  System.out.println(sc.nextLine()); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
	}

}
