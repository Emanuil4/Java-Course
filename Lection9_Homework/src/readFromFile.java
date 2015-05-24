import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
public class readFromFile {

	public static void main(String[] args) {
		readFile("test.txt");
	}
	public static void readFile(String path){
		String line = null;
		try{
			FileReader fileReader = new FileReader(path);
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
					line = bufferedReader.readLine();
					
					 System.out.print(line);
			}
			String[] parts = line.split("|, |! ");
			for(String part : parts){
				//System.out.println(part);
				
			}
			bufferedReader.close();
			
		}
			catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);

			}String filePath = "withoutSigns.txt";
			try {
				
				FileWriter fileStream = new FileWriter(filePath);
				BufferedWriter writer = new BufferedWriter(fileStream);
				String[] parts = line.split(", |! |\\.");
				for(String part : parts){
				//	System.out.print(part + " ");
					writer.write(part + " ");
				}	
				
				writer.close();
			} catch (Exception e) {
				System.out.println("Error while writing a file.");
				System.out.println(e.getMessage());
				System.exit(0);
			}
			
			System.out.println("The file is succes.");

	}
}
