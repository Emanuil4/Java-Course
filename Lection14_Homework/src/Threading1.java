
public class Threading1 {
	synchronized void from0to500000(){
		for(int i = 0; i < 50000; i++){
			if(i == 250000){
				System.out.println("25000 was reached");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}System.out.println(i);
			}
		}
	}
	synchronized void running(){
		for(int i = 0; i < 20; i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
				e.printStackTrace();
			}
			System.out.println("Running...");
		}
	} 
	public static void main(String[] args) {
		final Threading c = new Threading();
		new Thread() {
			public void run() {
				c.from0To50000();
			}
		}.start();

		new Thread() {
			public void run() {
				c.Running();
			}
		}.start();

	}
}
