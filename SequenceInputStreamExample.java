package iostream;
import java.io.*;
public class SequenceInputStreamExample {

	public static void main(String[] args)
	{
		try
		{
		   FileInputStream input1=new FileInputStream("C:\\Users\\a.kathiresan\\Desktop\\def.txt");    
		   FileInputStream input2=new FileInputStream("C:\\Users\\a.kathiresan\\Desktop\\abc.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1,input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print(" "+(char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();
		   
		   
		   FileOutputStream output1=new FileOutputStream("C:\\Users\\a.kathiresan\\Desktop\\def.txt");    
		   FileOutputStream output2=new FileOutputStream("C:\\Users\\a.kathiresan\\Desktop\\abc.txt");
		   ByteArrayOutputStream bout=new ByteArrayOutputStream();    
		      bout.write(65);    
		      bout.writeTo(output1);    
		      bout.writeTo(output2); 
		      bout.flush();
		   
		}
		catch(IOException ioe)
		{
			
		}
	}

}
