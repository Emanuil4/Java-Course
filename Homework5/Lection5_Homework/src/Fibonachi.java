import java.util.Scanner;
public class Fibonachi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in,"UTF-8");
           System.out.print("Please enter how long the string will be:");
           int mas1=input.nextInt();
           int[] array = new int[mas1];
           	array[0] = 1;
     	  	array[1] = 1;
           int i;
           System.out.print("1 1");
           for(i = 2; i < mas1;i++){
        	   array[i] = array[i-1] + array[i-2];
        	  System.out.print(" " + array[i]);
           }
	}

}
