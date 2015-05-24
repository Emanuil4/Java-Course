import java.util.Random;
public class threeParametres {

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++){
		multiplication();
		System.out.println("===================");
		}
	}
	public static void multiplication(){
		Random rand = new Random();
		int randomInt = rand.nextInt(10);
		System.out.print(randomInt + " ");
		int randToOneHundred = rand.nextInt(100);
		System.out.print(randToOneHundred + " ");
		int randomToFive = rand.nextInt(5);
		System.out.println(randomToFive + " ");
		int a = randomInt * randToOneHundred;
		System.out.println("Result is: " + a);
		int b = randomInt * randomToFive ;
		System.out.println("Result is: " + b);
		int c = randToOneHundred * randomToFive ;
		System.out.println("Result is: " + c);
		
	}
}
