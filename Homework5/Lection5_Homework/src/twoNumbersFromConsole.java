import java.util.Scanner;
public class twoNumbersFromConsole {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter first number:");
         int a = input.nextInt();
         System.out.print("Please enter second number:");
         int b = input.nextInt();
         if (a>b){
        	 System.out.print("Error because, a > b");
         }
	 for (int i = a; i <= b; i++ ){
		if ( i % 3 == 0 || i % 7 == 0){
			System.out.print(i + " ");
		}
	}
	}
	}
