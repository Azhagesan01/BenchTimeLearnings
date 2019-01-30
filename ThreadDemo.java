package multiThread;

class DisplayMessage implements Runnable {

	private String message;
	DisplayMessage(String Message)
	{
		this.message=Message;
	}
	public void run()
	{
		while(true)
		{
			System.out.println(message);
			System.exit(0);
		}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		  Runnable hello = new DisplayMessage("Hello");
	      Thread thread1 = new Thread(hello);
	      thread1.setName("hello");
	      System.out.println("Starting hello thread...");
	      thread1.start();
	      System.out.println("hello thread strarted");
	      
	      Runnable bye = new DisplayMessage("Goodbye");
	      Thread thread2 = new Thread(bye);
	      System.out.println("Starting goodbye thread...");
	      thread2.start();
	      
	      System.out.println("main() is ending...");
	}

}
