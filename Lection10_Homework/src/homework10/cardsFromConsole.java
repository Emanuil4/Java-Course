package homework10;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class cardsFromConsole {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter your cards: ");
		String string = input.nextLine();
		String[] words = string.split(" ");
		TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();
		for (String word : words ){
			Integer count = wordsCount.get(word);
			if (count == null){
				count = 0; 
			}if (word.equals("2") || word.equals("3")|| word.equals("4") || word.equals("5")
					 || word.equals("6") || word.equals("7") || word.equals("8") || word.equals("9")
					 || word.equals("10") || word.equals("J") || word.equals("Q") || word.equals("K")
					 || word.equals("A")){
				System.out.print("Valid card! ");
				System.out.println();
			}else {
				System.out.println("Invalid cards!");
				break;
			}
			wordsCount.put(word, count + 1);
		}
			Set<String> wordKeys = wordsCount.keySet();
		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			if (count == 2){
			 System.out.printf("You have pair");
			 System.out.println();
			}if (count == 3){
				 System.out.printf("You have set");
				 System.out.println();
			}if (count == 4){
				System.out.printf("You have four cards that are the same \"care\"!");
			}
		}

	}

}
