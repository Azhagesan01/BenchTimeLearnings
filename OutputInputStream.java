package iostream;
import java.io.*;
public class OutputInputStream {

	public static void main(String[] args) {
		
		FileOutputStream fout;
		try 
		{
			fout = new FileOutputStream("C:\\Users\\a.kathiresan\\Desktop\\abc.txt");
			//fout.write(56);
			String s="JAVA";    
            byte b[]=s.getBytes();   
            fout.write(b);  
			fout.close();
			System.out.println("Successfully Written");
			
			FileInputStream fin=new FileInputStream("C:\\Users\\a.kathiresan\\Desktop\\abc.txt");
			
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.println((char)i);
			}
			
			fin.close();
			System.out.println("Successfully Read");
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		
	}

}
