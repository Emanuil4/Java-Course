import java.util.Scanner;
public class mathOperations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter math task: ");
		String word = input.nextLine();
		int counter = 0;
		int counter1 = 0;
		String[] parts = word.split("");
		for (int i=0; i<parts.length; i++){
			if (parts[i].equals("(")){
				counter++;
			}if (parts[i].equals(")")){
				counter1++;
			}
		}
		if (counter == counter1){
			System.out.print("True");
		}
		if (counter != counter1){
			System.out.print("False");
		}	
	
	}
}
