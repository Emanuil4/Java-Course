package homeworkLection3;
import java.util.Scanner;
public class plusOrMinus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Enter first number:");
		int a = input.nextInt();
		System.out.print("Enter second number:");
		int b = input.nextInt();
		if (a<0 && b<0){
			System.out.println("Plus!");
		} if(a>0 && b<0){
        	System.out.println("Minus!");
        }if (a>0 && b>0){
			System.out.println("Plus!");
		}if(a<0 && b>0){
			System.out.println("Minus!");
		}
	}

}