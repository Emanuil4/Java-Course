import java.util.Scanner;
import java.util.Arrays;
public class Matrix1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter how many rows will have:");
		int rows = input.nextInt();
		System.out.print("Please enter how many columns will have:");
		int cols = input.nextInt();
		int[][] array =new int[rows][cols];
		for(int col = 0; col < cols; col++){
			for( int row = 0; row<rows; row++){
				System.out.print("Matrix"  + "[" + (row+1) +"]" + "["+ (col+1)+ "]" );
			array[row][col] = input.nextInt();
			}
		}
	
		for( int row1 = 0; row1<rows; row1++){
			for(int col1 = 0; col1 < cols; col1++){
			System.out.print(array[row1][col1] + " " );
			}
			System.out.println();
		}
}
}