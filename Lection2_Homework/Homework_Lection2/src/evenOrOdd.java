import java.util.Scanner;
public class evenOrOdd {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.println("Enter a number");
		int a= input.nextInt();
		   boolean  aIsEven = (a%2==0);
	        System.out.print(" Result is Even ");
	        System.out.println(aIsEven);
	        boolean aIsOdd=(a% 2!=0);
	        System.out.print(" Result is Odd ");
	        System.out.println(aIsOdd);
	        
		
	}
}
