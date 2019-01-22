package AccessModifierPackage;
class Test
{
	public static void publicMethod(){
		System.out.println("Public Method of Test");
	}
	
	protected static void protectedMethod(){
		System.out.println("Protected Method of Test");
		
	}
	
	static void defaultMethod(){
		System.out.println("Default Method of Test");
	}
	
	static private void privateMethod(){
		System.out.println("Private Method of Test");
	}
}
public class AccessModifierTest2 {

	public static void main(String[] args) {
		
		Parent.defaultMethod();
		Parent.protectedMethod();
		Parent.publicMethod();
		
		
	       

	}

}
