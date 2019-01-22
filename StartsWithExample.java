public class StartsWithExample {
	public static void main(String args[]) {
		String str = new String("quick brown fox jumps over the lazy dog");
		System.out.println(str.startsWith("quick"));//true
		System.out.println(str.startsWith("brown"));//false
		System.out.println(str.startsWith("ron", 7));  //true
		
		System.out.println(str.startsWith("quick", 6));
	}
}