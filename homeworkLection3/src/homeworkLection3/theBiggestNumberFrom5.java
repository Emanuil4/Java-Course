package homeworkLection3;
import java.util.Scanner;
public class theBiggestNumberFrom5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Enter first number:");
		float a = input.nextFloat();
		System.out.print("Enter second number:");
		float b = input.nextFloat();
		System.out.print("Enter third number:");
		float c = input.nextFloat();
		System.out.print("Enter fourth number:");
		float d = input.nextFloat();
		System.out.print("Enter fifth number:");
		float e = input.nextFloat();
		if (a>b && a>c && a>d && a>e){
			System.out.print("The biggest number is:");
			System.out.print(a);
		}if (b>a && b>c && b>d && b>e){
			System.out.print("The biggest number is:");
			System.out.print(b);
		}if (c>a && c>b && c>d && c>e){
			System.out.print("The biggest number is:");
			System.out.print(c);
		}if (d>a && d>b && d>c && d>e){
			System.out.print("The biggest number is:");
			System.out.print(d);
		}if (e>a && e>b && e>c && e>d){
			System.out.print("The biggest number is:");
			System.out.print(e);
		}
	}
}
