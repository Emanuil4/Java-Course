
	public class Running extends Thread {
		public void run() {
			for(int i = 0; i < 2; i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e);
					e.printStackTrace();
				}
				System.out.println("Running...");
			}notify();
		}
	}
