import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class evenLinesOddLines {

	public static void main(String[] args) {
		readFile("Lines.txt");
	}
		public static void readFile(String path){
			String line = null;
			try{
				FileReader fileReader = new FileReader(path);
				
				BufferedReader bufferedReader = new BufferedReader(fileReader);

				while (bufferedReader.ready()) {
						line = bufferedReader.readLine();
						String filePath = "evenLines.txt";
						try {
							FileWriter fileStream = new FileWriter(filePath, true);
							BufferedWriter writer = new BufferedWriter(fileStream);
							
								if(line.length() % 2 == 0){
									writer.write(line);
									writer.write(" ");
								}
							writer.close();
						}
						 catch (Exception e) {
							System.out.println("Error while writing a file.");
							System.out.println(e.getMessage());
							System.exit(0);
						}
						String filePath1 = "oddLines.txt";
						try {
							FileWriter fileStream = new FileWriter(filePath1, true);
							BufferedWriter writer = new BufferedWriter(fileStream);
							
								if(line.length() % 2 != 0){
									writer.write(line);
									writer.write(" ");
								}
							writer.close();
						}
						 catch (Exception e) {
							System.out.println("Error while writing a file.");
							System.out.println(e.getMessage());
							System.exit(0);
						}
					//	System.out.println("The file is succes.");
						
				}
				bufferedReader.close();
			}
				catch (Exception e) {
				System.out.println("Error while reading a file.");
				System.out.println(e.getMessage());
				System.exit(0);
				}
		}
}