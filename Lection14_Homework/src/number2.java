
public class number2 extends Thread{
	public void run() {
		System.out.println("The thread is started");
		try {
			Thread.sleep(4000);
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("The thread is complete");
}
}
