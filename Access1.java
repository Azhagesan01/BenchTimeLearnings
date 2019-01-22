package Access;


import AccessModifierPackage.*;

public class Access1 extends Parent{
	
	public static void main(String args[])
	{
	  Parent.publicMethod();
	  //Parent.privateMethod();
	  //Parent.defaultMethod();
	  Parent.protectedMethod();
	  StaticExplanation.op(30);
	}

}
