package iostream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class ByteArrayStreamExample {

	public static void main(String[] args)
	{
		try
		{
		   FileOutputStream output1=new FileOutputStream("C:\\Users\\a.kathiresan\\Desktop\\def.txt");    
		   FileOutputStream output2=new FileOutputStream("C:\\Users\\a.kathiresan\\Desktop\\abc.txt");
		   ByteArrayOutputStream bout=new ByteArrayOutputStream();    
		      bout.write(65);    
		      bout.writeTo(output1);    
		      bout.writeTo(output2); 
		      bout.flush();
		   
		      byte[] buf= {34,35,36,37,38,39,40};
		      ByteArrayInputStream bin=new ByteArrayInputStream(buf);
		      int k=0;
		      while ((k = bin.read()) != -1)
		      {  
		          char ch = (char) k;  
		          System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);  
		        }  
		   
		}
		catch(IOException ioe)
		{
			
		}

	}

}
