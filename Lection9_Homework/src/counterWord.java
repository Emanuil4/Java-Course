import java.util.Scanner;
public class counterWord {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter a sentence: ");
		String sentence = input.nextLine();
		System.out.print("Please enter a word: ");
		String word = input.nextLine();
		int counter = 0;
		String[] parts = sentence.split(" ");
		for(String part : parts){
			if(part.equals(word)){
				counter++;
			}
		}
		System.out.print(counter);
		}
	}


