
public class AmstrongNumbers {

	 public static void main(String args[])
	    {
	        int temp,n,c=0,a;
	        n=303;
	        temp=n;
	        while(n>0)
	        {
	            a=n%10;
	            n=n/10;
	            c=c+(a*a*a);
	        }
	        if(temp==c)
	        System.out.println("Given Number is an amstrong number");
	        else
	        System.out.println("Given Number is not an amstrong number");
	    }
}
