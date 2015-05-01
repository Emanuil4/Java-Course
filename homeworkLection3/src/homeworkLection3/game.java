package homeworkLection3;
import java.util.Scanner;
public class game {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter number from 1 to 9: ");
		int a = input.nextInt();
		if ( (a >= 1) && (a <= 3 ) ){
			int d = a*5;
			System.out.print(d);
		}else  if( (a>=4) && (a<=6) ){
			int c= a*10;
			System.out.print(c);
		}else  if ( (a>=7) && (a<=9) ){
			int f= a*50;
			System.out.print(f);
		}else{
			System.out.print("Enter the number from 1 to 9!");
		}
	}

}
