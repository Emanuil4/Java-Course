import java.util.Scanner;
public class company {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in, "UTF-8");
	System.out.print("Please enter first name of your employer:");
	String firstName=input.nextLine();
	System.out.print("Please enter last name of your employer:");
	String lastName=input.nextLine();
	System.out.print("Please enter the phone number of your employer:");
    String phoneNumber=input.nextLine(); // +35988... 
	System.out.print("Please enter the sex of your employer:");
    String sex=input.nextLine();
	System.out.print("Please enter the years of your employer:");
	byte  years=input.nextByte();
	System.out.print("Please enter egn of your employer:");
	long egn=input.nextLong();
	
	System.out.print( "The name is " + firstName + " " + lastName +  " Phone number is: " + phoneNumber +".The employer is  " + years + " years old. " +" Sex: " + sex + ". Egn: " + egn  );
}
}