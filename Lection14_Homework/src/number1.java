
public class number1 extends Thread {
	public void run() {
			System.out.println("The thread is started");
			try {
				Thread.sleep(8000);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println("The thread is complete");
	}	
	public static void main(String[] args) {
	Thread t1 = new number1();
	t1.setName("Emanyil");
	System.out.println("Name of t1:" + t1.getName());
	t1.start();
	Thread t2 = new number2();
	t2.setName("Ivan");
	System.out.println("Name of t2:" + t2.getName());
	t2.start();
	Thread t3 = new number3();
	t3.setName("Stoyan");
	System.out.println("Name of t3:" + t3.getName());
	t3.start();
	Thread t4 = new number4();
	t4.setName("Petya");
	System.out.println("Name of t4:" + t4.getName());
	t4.start();
	Thread t5 = new number5();
	t5.setName("Diana");
	System.out.println("Name of t5:" + t5.getName());
	t5.start();

	}

}
