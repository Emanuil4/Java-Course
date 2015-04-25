import java.util.Scanner;
public class circleRadius {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
		System.out.print("Enter the radius of the circle:");
		float r=input.nextFloat();
		float area;
		float perimetrie;
		float pi=3.14159f;
		area=pi*r*r;
		perimetrie=2*pi*r;
		System.out.print("Area is:");
		System.out.println(area);
		System.out.print("Perimetrie is:");
		System.out.print(perimetrie);
		
	}
}
