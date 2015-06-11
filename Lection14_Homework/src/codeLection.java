public class codeLection extends Thread{
	public void run() {
		for(int i = 0; i < 1000000;i++){
			System.out.print("z");
		}
	}
	public static void main(String[] args) {
		codeLection t1 = new codeLection();
		t1.start();
		five000 t2 = new five000();
		t2.start();
		sleep t3 = new sleep();
		t3.start();
	}
}
