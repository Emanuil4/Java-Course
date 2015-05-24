import java.util.Scanner;
public class maxNumber {
	public static void main(String[] args) {
		maxNumber1();
	}
	public static void maxNumber1(){
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter number: ");
		int a = input.nextInt();
		System.out.print("Please enter number: ");
		int b = input.nextInt();
		if(a > b){
			System.out.println("a > b");
		}else{
			System.out.println("b > a");
			}
		System.out.println("Now you must enter another tree numbers! ");
		System.out.print("Please enter first number: ");
		int first = input.nextInt();
		System.out.print("Please enter second number: ");
		int second = input.nextInt();
		System.out.print("Please enter third number: ");
		int third = input.nextInt();
		if (first > second && first > third){
			System.out.print("The biggest number is: " + first);
		}else if (second > first && second > third){
			System.out.print("The biggest number is: " + second);
		}else if (third > first && third > second){
			System.out.print("The biggest number is: " + third);
		}
		}
	}



