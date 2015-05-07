
public class NK_ {

	public static void main(String[] args) {
		int N=4;
		int K=3;
		int M=N-K;
		long factorial = 1;
		for (int i = 1; i <= N; i++) {
		    factorial *= i;
		} 
		   System.out.println(N + "! = " + factorial);
		long factorial1 = 1;
		for (int j = 1; j <= K; j++) {
		    factorial1 *= j;
		} 
		   System.out.println(K + "! = " + factorial1);
		   long factorial2=1;
	    for(int k = 1; k<=M;k++){
		    factorial2 *=k;
	    }
			  System.out.println(M + "! = " + factorial2);
			  System.out.print(factorial*factorial1/factorial2);
	}

}
