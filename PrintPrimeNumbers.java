
public class PrintPrimeNumbers {

	public static void main(String[] args) {
		prime(16,20);
	}
	
	static void prime(int m,int n)
	{
		while(m<=n)
		{
			int x=0;
			int i=2;
			
			while(i<=m/2)
			{
			if(m%i==0)
			{
				x++;
				break;
			}
			i++;
			}
			if(x==0)
			{
				System.out.println(m);
			}
			m++;
		    
	   }
	}
}
