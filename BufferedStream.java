package iostream;
import java.io.*;
public class BufferedStream
{

	public static void main(String[] args)
	{
		FileOutputStream fout;
		try 
		{
			fout = new FileOutputStream("C:\\Users\\a.kathiresan\\Desktop\\def.txt");
			BufferedOutputStream bout=new BufferedOutputStream(fout);    
		     String s="Java";    
		     byte b[]=s.getBytes();    
		     bout.write(b);    
		     bout.flush();    
		     bout.close();    
		     fout.close();    
		     System.out.println("success"); 
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    
	    catch (IOException ioe)
		{
	    	ioe.printStackTrace();
		}

	}

}
