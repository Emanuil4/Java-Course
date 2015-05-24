import java.util.Scanner;
public class Recursion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Enter a number: ");
		int number=input.nextInt();
		int result = fact(number);
		System.out.println(number + "! = " + result + ".");
	    }
	    static int fact(int n) {
		if (n == 1) {
		    return 1;
		}
		 if (n < 0){
			System.out.println("Please enter positive number! ");
			return 0;
		}
			else {
		    return n * fact(n-1);
			}
	    }	
}	

