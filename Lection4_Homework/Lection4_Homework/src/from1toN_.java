import java.util.Scanner;
public class from1toN_ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
		
       System.out.print("Please enter a number:");
       int N=input.nextInt();
       for(int i=0;i<=N;i++){
    	   if((i % 3) != 0 && (i % 7) !=0){
    		   System.out.println(i);
    	   }
       }	
   }

}
