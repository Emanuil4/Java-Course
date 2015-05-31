package homework10;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
public class wordsNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter words: ");
		String string = input.nextLine();
		String[] words = string.split(" ");
		TreeMap<String, Integer> wordsCount = new TreeMap<String, Integer>();
		for (String word : words ){
			Integer count = wordsCount.get(word);
			if (count == null){
				count = 0; 
			}
			wordsCount.put(word, count + 1);
		}
			Set<String> wordKeys = wordsCount.keySet();
		for (String word : wordKeys) {
			int count = wordsCount.get(word);
			if(count == 1){
			System.out.printf("\"%s\" is in the massive only %d time\n", word, count);
			}
			if (count > 1){
				System.out.printf("\"%s\" is in the massive %d times\n", word, count);
			}
		}
	}
}
