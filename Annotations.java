class BaseClass
{
	@Deprecated
    public void Display() 
    { 
        System.out.println("Deprecatedtest display()"); 
    } 
  
    
}
@ interface TestAnnotation 
{ 
    String Developer() default "Rahul";  
    String Expirydate(); 
} 
public class Annotations extends BaseClass {
	
	@TestAnnotation(Developer="Rahul", Expirydate="01-10-2020") 
    void fun1() 
    { 
        System.out.println("Test method 1"); 
    } 
  
    @TestAnnotation(Developer="Anil", Expirydate="01-10-2021") 
    void fun2() 
    { 
        System.out.println("Test method 2"); 
    } 
      
	
	@Override
    public void Display() 
    { 
        System.out.println("Derived display()"); 
    } 
	@SuppressWarnings({"checked", "deprecation"}) 
	public static void main(String[] args)
	{
		BaseClass b=new BaseClass();
		b.Display();
		Annotations a=new Annotations();
		a.Display();
		a.fun1();
		a.fun2();

	}

}
