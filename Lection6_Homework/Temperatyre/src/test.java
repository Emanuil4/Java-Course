import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Temperature conv = new Temperature();
		Scanner input = new Scanner(System.in,"UTF-8");
		System.out.print("Please enter temperature in gradus:");
		double a = input.nextDouble();
		double c;
		c = conv. ConvertfromCelsius(a);
		System.out.print("Fahrenheit = " + c);
	}

}
