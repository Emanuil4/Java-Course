import java.util.Scanner;
public class from1to5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter a number:");
		int a = input.nextInt();
		int[] Array = new int[a];
		int j=0;
		System.out.print("Please enter " + a + " integers");
		for (j = 0; j < a; j++){
			Array[j] = input.nextInt();
		}	
		int min = Array[0];
		for (j = 0; j < a; j++){
			if (min > Array[j]){
				System.out.print("Min is: "+ min);
			}
			
		}
		
			
	}

}

