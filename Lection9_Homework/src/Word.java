import java.util.Scanner;
public class Word {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
			System.out.print("Please enter a word: ");
			String word = input.nextLine();
			StringBuilder sb = new StringBuilder();
			for (int i = word.length()-1; i >= 0; i--){
				sb.append(word.charAt(i));
			}
				System.out.print(sb.toString());
	    }
	}
