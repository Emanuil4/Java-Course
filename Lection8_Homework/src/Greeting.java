import java.util.Scanner;
public class Greeting {
	public static void main(String[] args) {
		sayGreet();
		
	}
	public static void sayGreet(){
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter name: ");
		String name = input.nextLine();
		System.out.print("Greeting " + name + "!");
	}
}
