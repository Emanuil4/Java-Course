package homeworkLection3;
import java.util.Scanner;
public class theBiggestNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
        System.out.print("Enter first number:");
        float a= input.nextFloat();
        System.out.print("Enter second number:");
        float b= input.nextFloat();
        System.out.print("Enter third number:");
        float c= input.nextFloat();
      if (a>c){
    	 if (a>b){
    		 System.out.print("The biggest number is ");
    		 System.out.print(a);
      }}if (b>a){
    		 if (b>c){
    			 System.out.print("The biggest number is ");
    			 System.out.print(b);
    		 }} if(c>a){
    			 if(c>b){
    				 System.out.print("The biggest number is ");
    				 System.out.print(c);
    			 }
    		 }
        
	}

}
