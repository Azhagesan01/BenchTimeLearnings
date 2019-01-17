
public class OperatorsExample {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=20;
		boolean d=true;
		boolean e=false;
		
		System.out.println(a+b);  
		System.out.println(a-b);  
		System.out.println(a*b);  
		System.out.println(a/b);  
		System.out.println(a%b);  
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a++ + ++a);  
		System.out.println(b++ + b++);  
		System.out.println(~a);
		System.out.println(~b);
		System.out.println(!d);
		System.out.println(!e);
		System.out.println(10<<2); //10*2^2
		System.out.println(20<<8); //20*2^8
        System.out.println(40>>3); //40/2^3
        System.out.println(40>>>3);  
        System.out.println(-20>>2);  
        System.out.println(-20>>>2);  
        System.out.println(a<b&&a<c);
        System.out.println(a<b&a<c);
        System.out.println(a<b&&a++<c);
        System.out.println(a);
        System.out.println(a<b&a++<c);
        System.out.println(a);
        System.out.println(a>b||a++<c);
        System.out.println(a);
        System.out.println(a>b|a++<c);
        System.out.println(a);
        
        if(a==b)
        	System.out.println("a equals b");
        else
        	System.out.println("a not equals b");
        
        int min=(a<b)?a:b;  
        System.out.println(min); 
        
	}

}

