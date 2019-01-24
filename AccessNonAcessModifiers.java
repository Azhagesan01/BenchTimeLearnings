package Access;

import java.io.*;

class StrictfpExample
{
	public strictfp void sum(double x,double y)
	{
		System.out.println("Sum is : "+(x+y));
	}
}

class NativeExample
{
	public native int add(int m1,int m2);
}


public class AccessNonAcessModifiers implements Serializable{

	int a=20;
	int b=30;
	transient int c=40;
	transient final int d=50;
	transient static int e=60;
	
	
	public static void main(String[] args) throws Exception {
		
		AccessNonAcessModifiers a=new AccessNonAcessModifiers();
	
		FileOutputStream fostream=new FileOutputStream("serializedfile.txt");
		ObjectOutputStream ooStream=new ObjectOutputStream(fostream);
		ooStream.writeObject(a);
		ooStream.close();
		fostream.close();
		
		FileInputStream fistream=new FileInputStream("serializedfile.txt");
		ObjectInputStream oiStream=new ObjectInputStream(fistream);
		AccessNonAcessModifiers b =(AccessNonAcessModifiers)oiStream.readObject();
		System.out.println("A is : "+b.a);
		System.out.println("B is : "+b.b);
		System.out.println("C is : "+b.c);
		System.out.println("D is : "+b.d);
		System.out.println("E is : "+e);
		
		oiStream.close();
		fistream.close();
		
		StrictfpExample sfpExample=new StrictfpExample();
		sfpExample.sum(10E+8, 2E+9);
		
		//public,private,default,protected,transient,strictfp,
		//synchronized,abstract,final,static
		//native,volatile
		
//		NativeExample ne=new NativeExample();
//		int na=ne.add(20, 30);
	}

}
