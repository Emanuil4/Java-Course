import java.util.Arrays;
public class Arrays2 {
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		int i,k;
		 int[] array = {3,6,5,1,4,2,9,8,7,10};
		 for( i = 0; i < array.length; i++){
			 if (array[i] % 2 == 0){
				count++;
			  } } int[] array1 = new int[count];
					array1[0] = array[1];
					array1[1] = array[4];
					array1[2] = array[5];
					array1[3] = array[7];
					array1[4] = array[9];
				System.out.print(Arrays.toString(array1));
				 System.out.println();
				 int temp;
			        for(int m=0; m < array1.length-1; m++){
			            for(int j=1; j < array1.length-m; j++){
			                if(array1[j-1] < array1[j]){
			                    temp=array1[j-1];
			                    array1[j-1] = array1[j];
			                    array1[j] = temp;
			                }
			            }
			        }
			        System.out.println(Arrays.toString(array1));
			        for( i = 0; i < array.length; i++){
						 if (array[i] % 2 != 0){
							count1++;
					     } 
					}
			        int[] array2 = new int[count];
						  array2[0] = array[0];
						  array2[1] = array[2];
						  array2[2] = array[3];
						  array2[3] = array[6];
						  array2[4] = array[8];
						System.out.print(Arrays.toString(array2));
							 System.out.println();
							 int temp1;
			   for(int m=0; m < array2.length-1; m++){
				for(int j=1; j < array2.length-m; j++){
				   if(array2[j-1] > array2[j]){
					temp1=array2[j-1];
					array2[j-1] = array2[j];
					array2[j] = temp1;
		           }
				 }
			   }
				 System.out.println(Arrays.toString(array2));
	}
}