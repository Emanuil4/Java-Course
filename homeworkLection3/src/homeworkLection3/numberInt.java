package homeworkLection3;
import java.util.Scanner;
public class numberInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
       System.out.print("Please enter a number:");
     int a= input.nextInt();
     if (1 < a && 5 > a ){
    	 if (a % 2 ==0){
    		 System.out.println("Number is even!");
    	 }
    	 else if(a % 2 !=0){
    		 System.out.println("Number is odd!");
    	 }
     }
     if(6 <= a && 15 >= a){
    	 if(a % 3==0 ){
    		 System.out.println("Without residuå");
    	 }
    	 else if (a % 3 !=0){
    		 System.out.println("With residue");
    	 }
     }
     else if  (a==0) {
    	 System.out.println("Zero");
     }
     else if (a>15){
    	 System.out.print("Number is positive");
     }
     else if (a<0){
    	 System.out.print("Number is negative");
     }
	}

}
