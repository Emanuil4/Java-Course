import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class writeInFile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		readFile("countries.txt");
	}
	public static void readFile(String path){
		Scanner input = new Scanner(System.in,"UTF-8");
		try{
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					String line = bufferedReader.readLine();
					// System.out.println(line);
			}
			
			bufferedReader.close();
			
		}
			catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
			}	String filePath = "capitals.txt";
			try {
				
				FileWriter fileStream = new FileWriter(filePath);
//				FileWriter fileStream = new FileWriter(filePath, true);
				
				BufferedWriter writer = new BufferedWriter(fileStream);

				
				
			System.out.println("Please enter the capital of Bulagria: ");
			String Bulgaria  = input.nextLine();
				writer.write(Bulgaria);
				writer.newLine();
				System.out.println("Please enter the capital of USA: ");
				String Washington  = input.nextLine();
				writer.write(Washington);
				writer.newLine();
				System.out.println("Please enter the capital of England: ");
				String London  = input.nextLine();
				writer.write(London);
				writer.newLine();
				System.out.println("Please enter the capital of France: ");
				String France  = input.nextLine();
				writer.write(France);
				writer.newLine();
				System.out.println("Please enter the capital of Greece: ");
				String Greece  = input.nextLine();
				writer.write(Greece);
				writer.newLine();
				
				writer.close();
				
			} catch (Exception e) {
				System.out.println("Error while writing a file.");
				System.out.println(e.getMessage());
				System.exit(0);
			}
			
			System.out.println("The file is succes.");
		}

		}
	


