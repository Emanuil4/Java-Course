import java.util.Scanner;
public class text {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter sentences:");
		String sentences = input.nextLine();
		System.out.print("Please enter word:");
		String word = input.nextLine();
		String[] parts = sentences.split("\\.");
		for (String part : parts){
			String[] part1 = part.split(" ");
			for(String part2 : part1){
				if(part2.equals(word)){
				System.out.println(part);
				}
			}
		}
		}
}
		
	



