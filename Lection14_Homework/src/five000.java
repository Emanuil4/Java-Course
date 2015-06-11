public class five000 extends Thread {
	public void run() {
		for(int i = 500000; i > 0;i--){
			System.out.println(i + " ");
		}
	}
}