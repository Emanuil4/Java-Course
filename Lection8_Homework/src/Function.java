import java.util.Scanner;
public class Function {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please how many number will you check: ");
		int n = input.nextInt();
		for (int i = 0; i < n; i++){
			evenOrOdd();
		}
	}
	public static void evenOrOdd(){
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter number:");
		int number = input.nextInt();
		if(number % 2 == 0){
			System.out.println("Number is even! ");
		}
		else if (number % 2 != 0){
			System.out.println("Number is odd! ");
		}
	}
}
