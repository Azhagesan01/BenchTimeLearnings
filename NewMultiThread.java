package multiThread;

class NewThread
{

	public void Count() {
	      try {
	         for(int i = 5; i > 0; i--) {
	            System.out.println("Counter   ---   "  + i );
	         }
	      } catch (Exception e) {
	         System.out.println("Thread  interrupted.");
	      }
	   }
}
class NewThreadDemo extends Thread {
	   private Thread t;
	   private String threadName;
	   NewThread NT;

	   NewThreadDemo( String name,  NewThread nt) {
	      threadName = name;
	      NT = nt;
	   }
	   
	   public void run() {
	      synchronized(NT) {
	         NT.Count();
	      }
	      System.out.println("Thread " +  threadName + " exiting.");
	   }

	   public void start () {
	      System.out.println("Starting " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}

public class NewMultiThread {
	public static void main(String args[])
	{
		NewThread nt=new  NewThread();
		
		  NewThreadDemo T1 = new NewThreadDemo( "Thread - 1 ", nt );
	      NewThreadDemo T2 = new NewThreadDemo( "Thread - 2 ", nt );
	      
	      T1.start();
	      T2.start();
	}

}
