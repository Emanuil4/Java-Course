package homeworkLection3;
import java.util.Scanner;
public class cards {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter a card:");
		char a= input.next().charAt(0);
		if (a=='2'){
			System.out.print("Valid card!");
		}else if (a=='3'){
			System.out.print("Valid card!");
		}else if (a=='4'){
			System.out.print("Valid card!");
		}else if (a=='5'){
			System.out.print("Valid card!");
		}else if (a=='6'){
			System.out.print("Valid card!");
		}else if (a=='7'){
			System.out.print("Valid card!");
		} else if (a=='8'){
			System.out.print("Valid card!");
		}else if (a=='9'){
			System.out.print("Valid card!");
		}else if (a=='j' || a=='J'){
			System.out.print("Valid card!");
		}else if (a=='q' || a=='Q'){
			System.out.print("Valid card!");
		}else if (a=='k'|| a=='K'){
			System.out.print("Valid card!");
		}else if (a=='a'|| a=='A'){
			System.out.print("Valid card!");
		}else{
			System.out.println("Invalid card");
		} 
		} 	
	}

