import java.util.Scanner;
public class from1toN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter a number:");
		int N=input.nextInt();
		for(int i=1;i<=N;i++){
			System.out.println(i);
		}
	}
}
