package homeworkLection3;
import java.util.Scanner;
public class triangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
        System.out.print("Enter first side:");
        int a = input.nextInt();
        System.out.print("Enter second side:");
        int b = input.nextInt();
        System.out.print("Enter third side:");
        int c = input.nextInt();
        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))  ) {
        	System.out.print("Triangle exist!");
        }else {
        		System.out.print("Triangle does not exist");
         }
	}

}
