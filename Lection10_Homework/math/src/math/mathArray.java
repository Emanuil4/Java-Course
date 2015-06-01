package math;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Stack;
public class mathArray {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		Stack<String> myStack = new Stack<String>();
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter math task: ");
		String string = input.nextLine();
		if(string.startsWith("+")|| string.startsWith("-")
		|| string.endsWith("-")|| string.endsWith("+")){
			System.out.print("Error!");
		}
		String[] parts = string.split("\\+ || \\- ");
		for (String part : parts){
			//System.out.println(part);
			
			if (part.equals("1") || part.equals("2")|| part.equals("3")|| part.equals("4")
				|| part.equals("5")|| part.equals("6")|| part.equals("7")|| part.equals("8")
				|| part.equals("9")|| part.equals("+")|| part.equals("-")){
				if(part.equals("+") || part.equals("-")){
					myStack.push(part);	
				}if(part.equals("1")|| part.equals("2")|| part.equals("3")|| part.equals("4")|| part.equals("5")
						|| part.equals("6")|| part.equals("7")|| part.equals("8")|| part.equals("9")){
					queue.offer(part);
				}
			}else{
				System.out.println("Invalid Symbol!");
				break;
			}
			
			
		}
		while(!myStack.isEmpty()){
		String current = myStack.pop();
		System.out.print(current + " ");
		}System.out.println();
		while (!queue.isEmpty()) {
			String current = queue.poll();
		    System.out.print(current + " "); 
		 }
	
	}
}
