package AccessModifierPackage;

public class Parent {
//		private int x;
//		public int v=0;
//		protected int z=8;
		
		public static void publicMethod(){
			System.out.println("Public method of Parent");
		}
		
		protected static void protectedMethod(){
			System.out.println("Protected method of Parent");
		}
		
		static void defaultMethod(){
			System.out.println("Default method of Parent");
		}
		
		static private void privateMethod(){
			System.out.println("Private method of Parent");
		}
	}

