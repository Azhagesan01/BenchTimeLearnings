package AccessModifierPackage;


public class AccessModifiersTest {

	public static void main(String[] args) {
		Parent.defaultMethod();
		Parent.protectedMethod();
		Parent.publicMethod();
		//Parent.privateMethod();
		Test.protectedMethod();
		Test.defaultMethod();
		Test.publicMethod();
		//Test.privateMethod();
		
		
		}

}
