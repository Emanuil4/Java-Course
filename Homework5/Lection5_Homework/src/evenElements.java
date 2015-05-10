
public class evenElements {

	public static void main(String[] args) {
		int[] mas1={1, 2, 3, 4, 5};
		int sum=0;
		int sum1=0;
		for(int i = 0; i < mas1.length; i++){
			if(mas1[i] % 2 == 0){
				sum = sum + mas1[i];
			}
		}    
		System.out.print(sum);
	}
         
}
