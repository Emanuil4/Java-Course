import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
public class Queues {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter a string: ");
		String string = input.nextLine();
		String[] parts = string.split(" ");
		for(String part : parts){
			String string1 = "xka";
			//System.out.println(part);
			if(part.length() > string1.length()){
				queue.offer(part);
				}
			}
				while (!queue.isEmpty()) {
			String current = queue.poll();
		    System.out.print(current + " ");  
		}
		}
}

