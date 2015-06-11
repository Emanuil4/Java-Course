
public class number5 extends Thread  {
	public void run(){
	System.out.println("The thread is started");
	try {
		Thread.sleep(5000);
	} catch (Exception e) {
		System.out.println(e);
	}
	System.out.println("The thread is complete");
}
}
