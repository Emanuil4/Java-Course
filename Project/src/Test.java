import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Test extends Array {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Please enter your choice: ");
		int menu = input.nextInt();
		switch (menu) {
		case 1:
			System.out
					.println("Your choice is from ONE demension to TWO demension array");
			System.out.print("Please enter how long the array will be: ");
			int length = input.nextInt();
			if ((length >= 2) && (length <= 9)) {
				int[] mas1 = new int[length * length];
				System.out.print("Please enter " + length * length
						+ " numbers: ");
				int i;
				for (i = 0; i < mas1.length; i++) {
					mas1[i] = input.nextInt();
				}

				int[][] mas2 = new int[length][length];
				i = 0;try{
					String filePath = "22.txt";
					FileWriter fileStream = new FileWriter(filePath);			
					BufferedWriter writer = new BufferedWriter(fileStream);
				for (int row = 0; row < mas2.length; row++) {
					for (int col = 0; col < mas2[0].length; col++) {
						mas2[row][col] = mas1[i++] * i;
						System.out.print(mas2[row][col] + " ");
						writer.write(mas2[row][col]);
					}
					System.out.println();
					
				}}catch(Exception e){
					System.out.println("Error while writing a file.");
					System.out.println(e.getMessage());
					System.exit(0);
				}

			} else {
				System.out.print("Please enter number betwåen 2-9! ");
			}
			break;
		case 2:
			System.out
					.println("Your choice is from two demension to one demension array");
			System.out.print("Please enter how long the array will be: ");
			int length1 = input.nextInt();
			if ((length1 >= 2) && (length1 <= 9)) {
				int col;
				int row;
				int[][] array = new int[length1][length1];
				for (col = 0; col < length1; col++) {
					for (row = 0; row < length1; row++) {
						array[row][col] = input.nextInt();
					}
				}

				for (int row1 = 0; row1 < length1; row1++) {
					for (int col1 = 0; col1 < length1; col1++) {
						System.out.print(array[col1][row1] + " ");
					}
					System.out.println();
					
				}try{
					String filePath = "11.txt";
				row = 0;
				col = 0;
				int count =0;
				FileWriter fileStream = new FileWriter(filePath);			
				BufferedWriter writer = new BufferedWriter(fileStream);

				int[] mas4 = new int[length1 * length1];
				for (int row1 = 0; row1 < length1; row1++) {
					for (int col1 = 0; col1 < length1; col1++) {
					mas4[count] = array[col1][row1]*count;
					System.out.print(mas4[count] + " ");
					count++;
					writer.write(mas4[count]);
					}
				}
				}catch (Exception e) {
					System.out.println("Error while writing a file.");
					System.out.println(e.getMessage());
					System.exit(0);
				}

			} else {
				System.out.print("Wrong choice! ");
			}
			break;
		default:
			System.out.print("Wrong choice!");
			break;
		}
	}
}
