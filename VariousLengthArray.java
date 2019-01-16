import java.util.*;
public class VariousLengthArray {

	public static void main(String args[])
	{
		int student[][]=new int[5][];
		
		student[0]=new int[4];
		student[1]=new int[3];
		student[2]=new int[5];
		student[3]=new int[1];
		student[4]=new int[2];
		
		
		student[0][0]=40;
		student[0][1]=30;
		student[0][2]=20;
		student[0][3]=10;
		
		student[1][0]=3;
		student[1][1]=2;
		student[1][2]=1;
		
		student[2][0]=55;
		student[2][1]=44;
		student[2][2]=33;
		student[2][3]=22;
		student[2][4]=11;
		
		student[3][0]=9;
		
		student[4][0]=76;
		student[4][1]=67;
		
		
		for(int i = 0; i < student.length; i++)     
		   {
		     for(int j = 0; j < student[i].length; j++)
		     {
		       System.out.print(student[i][j] + " ");
		     }
		     System.out.println();        
		   }
		
	}
}
