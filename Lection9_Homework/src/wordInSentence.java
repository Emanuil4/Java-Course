import java.util.Scanner;
public class wordInSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter a word: ");
		String word = input.nextLine();
		System.out.print("Please enter a sentence: ");
		String sentence = input.nextLine();
			boolean word1;
		if( word1 = sentence.contains(word)){
			String modified = sentence.replace(word, word.toUpperCase());
			System.out.print(modified);
		}
		else{
			System.out.print("The word is not in the sentence");
		}
	}

}