import java.util.Scanner;
public class sentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter the sentence:");
		String sentence = input.nextLine();
		boolean startsWith = sentence.startsWith("Greeting");
		System.out.format("The sentence starts with the world \"Greeting\": %s ",startsWith);
		System.out.println();
		boolean endsWith = sentence.endsWith(".");
		System.out.format("The sentence ends with the world \".\" %s ",endsWith);
		System.out.println();
		boolean contains = sentence.contains("water");
		System.out.format("The sentance contains the word \"water\": %s \n", contains);
	}
}
