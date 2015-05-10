import java.util.Scanner;
public class searchNumberInMasive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		int[] mas1 = {1, 2, 3, 4, 5, 6, 21, 8, 9,55};
		int a=0;
		System.out.print("Please enter a number that you want to search:");
		int c = input.nextInt();
		for(int i = 0; i <mas1.length ; i++){
			if (c==mas1[i]){
				a = mas1[i-1];
				System.out.print("Index is: " + a);
			}
		}
	}

}
