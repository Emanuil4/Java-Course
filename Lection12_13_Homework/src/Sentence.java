import java.util.Scanner;
import java.util.Arrays; 
public class Sentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter a sentence: ");
		String sentence = input.nextLine();
		String[] parts = sentence.split(" ");
		Arrays.sort(parts);
		for(String part : parts ){
			System.out.println(part + " ");
		}
	}

}
