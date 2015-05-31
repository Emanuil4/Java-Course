import java.util.Stack;
	import java.util.Scanner;
public class Steck {
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<String>();
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter String: ");
		String string = input.nextLine();
		String[] parts = string.split(" ");
		for(String part : parts){
			//System.out.println(part);
			myStack.push(part);	
		}while(!myStack.isEmpty()){
			
			String current = myStack.pop();
			
			System.out.print(current + " ");
			}
	}

}
