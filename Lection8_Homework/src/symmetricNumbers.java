package kkk;
public class symmetricNumbers {
	public static void main(String[] args) {
	int[] array = new int[1000];
	for (int i = 10; i <= 999; i++){
		array[i] = i;
	}
		for (int j = 10; j < 100; j++){
			for (int k = 0; k < 10; k++){
				if(j / 10 == k && j % 10 == k){
				System.out.println(j);
				}
			}
		}
		for (int e = 100; e <= 999; e++){
			if (e/ 100 == (( e%100 ) % 10)){
				System.out.println(e);
			}
		}
			}
	
	}

